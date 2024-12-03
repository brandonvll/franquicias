package com.practicanequi.apirestful.franquicias.service;

import com.practicanequi.apirestful.franquicias.entity.Sucursal;
import com.practicanequi.apirestful.franquicias.entity.Franquicia;
import com.practicanequi.apirestful.franquicias.repository.SucursalRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SucursalService {
    private final SucursalRepository sucursalRepository;

    public SucursalService(SucursalRepository sucursalRepository) {
        this.sucursalRepository = sucursalRepository;
    }

    public Sucursal create(Sucursal sucursal) {
        if (sucursal.getFranquicia() != null && sucursal.getFranquicia().getId() != null) {
            Franquicia franquicia = new Franquicia();
            franquicia.setId(sucursal.getFranquicia().getId());
            sucursal.setFranquicia(franquicia);
        }
        return sucursalRepository.save(sucursal);
    }

    public Sucursal findById(Long id) {
        return sucursalRepository.findById(id).get();
    }

    public List<Sucursal> findAll() {
        return sucursalRepository.findAll();
    }

    public void delete(Long id) {
        sucursalRepository.deleteById(id);
    }

    public Sucursal update(Sucursal sucursal) {
        if (sucursal.getFranquicia() != null && sucursal.getFranquicia().getId() != null) {
            Franquicia franquicia = new Franquicia();
            franquicia.setId(sucursal.getFranquicia().getId());
            sucursal.setFranquicia(franquicia);
        }
        return sucursalRepository.save(sucursal);
    }

}
