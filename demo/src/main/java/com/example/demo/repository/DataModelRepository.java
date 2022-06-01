package com.example.demo.repository;

import com.example.demo.model.DataModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DataModelRepository extends JpaRepository<DataModel, Long> {
}
