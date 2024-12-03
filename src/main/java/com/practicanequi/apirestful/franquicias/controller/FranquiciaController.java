package com.practicanequi.apirestful.franquicias.controller;

import com.practicanequi.apirestful.franquicias.entity.Franquicia;
import com.practicanequi.apirestful.franquicias.service.FranquiciaService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/franquicias")
// enpoint: http://localhost:8080/api/franquicias
public class FranquiciaController {

    private FranquiciaService franquiciaService;

    public FranquiciaController(FranquiciaService franquiciaService) {
        this.franquiciaService = franquiciaService;
    }

    @PostMapping
    public Franquicia create(@RequestBody Franquicia franquicia) {
        return franquiciaService.create(franquicia);
    }

    @GetMapping
    public List<Franquicia> findAll() {
        return franquiciaService.findAll();
    }

    @GetMapping("/{idFranquicia}")
    public Franquicia findById(@PathVariable("idFranquicia") Long id) {
        return franquiciaService.findById(id);
    }

    @DeleteMapping("/{idFranquicia}")
    public void deleteById(@PathVariable("idFranquicia") Long id) {
        franquiciaService.delete(id);
    }

    @PutMapping("/{idFranquicia}")
    public Franquicia update(@PathVariable("idFranquicia") Long id, @RequestBody Franquicia franquicia) {
        return franquiciaService.update(franquicia);
    }
}
