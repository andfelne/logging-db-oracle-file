package com.project.loggingdoitright.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.loggingdoitright.model.Catalog;
import com.project.loggingdoitright.service.CatalogService;



@RestController
@RequestMapping("/api/automation/catalog")
public class CatalogController {

    private final CatalogService catalogService;

    @Autowired
    public CatalogController(final CatalogService catalogService) {
        this.catalogService = catalogService;
    }

    @GetMapping(value = "/{type}")
    public ResponseEntity<List<Catalog>> getCatalog(@PathVariable String type) {
        return ResponseEntity.ok().body(catalogService.getByType(type));
    }

}
