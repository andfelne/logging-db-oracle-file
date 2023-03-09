package com.project.loggingdoitright.service;

import java.util.List;

import com.project.loggingdoitright.model.Catalog;


public interface CatalogService {

    /**
     * Obtiene una lista de catalogos de tipo {@link CatalogDto} que coincidan con
     * el tipo que se da como parametro
     * 
     * @param type - filtro de busqueda
     * @return {@link una lista de elementos que coincidieron con el filtro de busqueda}
     */
    List<Catalog> getByType(String type);

}
