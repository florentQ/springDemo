package com.example.demo.service;

import com.example.demo.dto.DataModelDTO;
import com.example.demo.model.DataModel;
import org.springframework.web.bind.annotation.*;

import javax.persistence.EntityNotFoundException;
import java.util.List;

public interface DataModelService {

    public List<DataModelDTO> findAll();

    public DataModelDTO save(@RequestBody DataModel dataModel);

    public DataModelDTO findById(@PathVariable Long id);

    public DataModelDTO updateById(@RequestBody DataModel dataModel, @PathVariable Long id) throws EntityNotFoundException;

    public void deleteById(@PathVariable Long id);
}
