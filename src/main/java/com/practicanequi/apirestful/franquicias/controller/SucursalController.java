package com.practicanequi.apirestful.franquicias.controller;

import com.practicanequi.apirestful.franquicias.entity.Sucursal;
import com.practicanequi.apirestful.franquicias.service.SucursalService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/sucursales")
// enpoint: http://localhost:8080/api/sucursales
public class SucursalController {

    private SucursalService sucursalService;

    public SucursalController(SucursalService sucursalService) {
        this.sucursalService = sucursalService;
    }

    @PostMapping
    public Sucursal create(@RequestBody Sucursal sucursal) {
        return sucursalService.create(sucursal);
    }

    @GetMapping
    public List<Sucursal> findAll() {
        return sucursalService.findAll();
    }

    @GetMapping("/{idSucursal}")
    public Sucursal findById(@PathVariable("idSucursal") Long id) {
        return sucursalService.findById(id);
    }

    @DeleteMapping("/{idSucursal}")
    public void deleteById(@PathVariable("idSucursal") Long id) {
        sucursalService.delete(id);
    }

    @PutMapping("/{idSucursal}")
    public Sucursal update(@PathVariable("idSucursal") Long id, @RequestBody Sucursal sucursal) {
        sucursal.setId(id);
        return sucursalService.update(sucursal);
    }
}
