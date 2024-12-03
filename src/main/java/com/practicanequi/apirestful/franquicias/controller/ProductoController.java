package com.practicanequi.apirestful.franquicias.controller;

import com.practicanequi.apirestful.franquicias.entity.Producto;
import com.practicanequi.apirestful.franquicias.service.ProductoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/productos")
// enpoint: http://localhost:8080/api/productos
public class ProductoController {

    private ProductoService productoService;

    public ProductoController(ProductoService productoService) {
        this.productoService = productoService;
    }

    @PostMapping
    public Producto create(@RequestBody Producto producto) {
        return productoService.create(producto);
    }

    @GetMapping
    public List<Producto> findAll() {
        return productoService.findAll();
    }

    @GetMapping("/{idProducto}")
    public Producto findById(@PathVariable("idProducto") Long id) {
        return productoService.findById(id);
    }

    @DeleteMapping("/{idProducto}")
    public void deleteById(@PathVariable("idProducto") Long id) {
        productoService.delete(id);
    }

    @PutMapping("/{idProducto}")
    public Producto update(@PathVariable("idProducto") Long id, @RequestBody Producto producto) {
        producto.setId(id);
        return productoService.update(producto);
    }
}
