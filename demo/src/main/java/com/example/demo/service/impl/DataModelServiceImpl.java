package com.example.demo.service.impl;

import com.example.demo.mapper.DataModelMapper;
import com.example.demo.model.DataModel;
import com.example.demo.dto.DataModelDTO;
import com.example.demo.repository.DataModelRepository;
import com.example.demo.service.DataModelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

import javax.persistence.EntityNotFoundException;
import java.util.List;
import java.util.Optional;

@Component
public class DataModelServiceImpl implements DataModelService {
    @Autowired
    DataModelRepository dataModelRepository;

    @Autowired
    DataModelMapper dataModelMapper;

    public List<DataModelDTO> findAll() {
        return dataModelMapper.mapToDtos(dataModelRepository.findAll());
    }

    public DataModelDTO save(@RequestBody DataModel dataModel) {
        return dataModelMapper.mapToDto(dataModelRepository.save(dataModel));
    }

    public DataModelDTO findById(@PathVariable Long id) {

        return dataModelMapper.mapToDto(dataModelRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException(id.toString())));
    }

    public DataModelDTO updateById(@RequestBody DataModel dataModel, @PathVariable Long id) throws EntityNotFoundException {
        Optional<DataModel> opt = dataModelRepository.findById(id);
        DataModel tmp = opt.map(dataModelToUpdate -> {
                    dataModelToUpdate.setSomeData(dataModel.getSomeData());
                    return dataModelRepository.save(dataModelToUpdate);
                })
                .orElseThrow(() -> new EntityNotFoundException(id.toString()));

        return dataModelMapper.mapToDto(tmp);
    }

    public void deleteById(@PathVariable Long id) {
        dataModelRepository.deleteById(id);
    }
}
