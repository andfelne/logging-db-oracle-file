package com.project.loggingdoitright.service.implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.loggingdoitright.model.Catalog;
import com.project.loggingdoitright.repository.CatalogRepository;
import com.project.loggingdoitright.service.CatalogService;

@Service
public class CatalogServiceImpl implements CatalogService {

    private final CatalogRepository catalogRepository;

    @Autowired
    public CatalogServiceImpl(final CatalogRepository catalogRepository) {
        this.catalogRepository = catalogRepository;
    }

    @Override
    public List<Catalog> getByType(final String type) {
        Integer a = 1/0;
        return catalogRepository.findByType(type);
    }

}
