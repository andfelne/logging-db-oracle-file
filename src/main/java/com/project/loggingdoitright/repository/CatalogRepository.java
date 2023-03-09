package com.project.loggingdoitright.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import com.project.loggingdoitright.model.Catalog;


public interface CatalogRepository extends CrudRepository<Catalog, Long> {

    List<Catalog> findByType(String type);
    
}
