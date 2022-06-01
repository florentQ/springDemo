package com.example.demo.controller;

import com.example.demo.dto.DataModelDTO;
import com.example.demo.model.DataModel;
import com.example.demo.service.DataModelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/dataModels")
public class DataModelController {
    @Autowired
    DataModelService dataModelService;

    @GetMapping()
    List<DataModelDTO> findAll() {
        return dataModelService.findAll();
    }

    @PostMapping()
    DataModelDTO save(@RequestBody DataModel dataModel) {
        return dataModelService.save(dataModel);
    }

    @GetMapping("/{id}")
    DataModelDTO findById(@PathVariable Long id) {

        return dataModelService.findById(id);
    }

    @PutMapping("/{id}")
    DataModelDTO updateById(@RequestBody DataModel dataModel, @PathVariable Long id) {

        return dataModelService.updateById(dataModel, id);
    }

    @DeleteMapping("/{id}")
    void deleteById(@PathVariable Long id) {
        dataModelService.deleteById(id);
    }
}
