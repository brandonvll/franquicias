package com.practicanequi.apirestful.franquicias.service;

import com.practicanequi.apirestful.franquicias.entity.Sucursal;
import com.practicanequi.apirestful.franquicias.entity.Producto;
import com.practicanequi.apirestful.franquicias.repository.ProductoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductoService {
    private final ProductoRepository productoRepository;

    public ProductoService(ProductoRepository productoRepository) {
        this.productoRepository = productoRepository;
    }

    public Producto create(Producto producto) {
        if (producto.getSucursal() != null && producto.getSucursal().getId() != null) {
            Sucursal sucursal = new Sucursal();
            sucursal.setId(producto.getSucursal().getId());
            producto.setSucursal(sucursal);
        }
        return productoRepository.save(producto);
    }

    public Producto findById(Long id) {
        return productoRepository.findById(id).get();
    }

    public List<Producto> findAll() {
        return productoRepository.findAll();
    }

    public void delete(Long id) {
        productoRepository.deleteById(id);
    }

    public Producto update(Producto producto) {
        if (producto.getSucursal() != null && producto.getSucursal().getId() != null) {
            Sucursal sucursal = new Sucursal();
            sucursal.setId(producto.getSucursal().getId());
            producto.setSucursal(sucursal);
        }
        return productoRepository.save(producto);
    }

}
