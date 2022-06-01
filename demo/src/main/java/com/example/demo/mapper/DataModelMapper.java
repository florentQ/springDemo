package com.example.demo.mapper;

import com.example.demo.dto.DataModelDTO;
import com.example.demo.model.DataModel;
import org.mapstruct.Mapper;
import org.mapstruct.ValueMappings;

import java.util.List;

@Mapper(componentModel = "spring")
public interface DataModelMapper {

    DataModelDTO mapToDto(DataModel source);
    DataModel mapToModel(DataModelDTO destination);
    List<DataModelDTO> mapToDtos(List<DataModel> source);
    List<DataModel> mapToModels(List<DataModelDTO> destination);

}
