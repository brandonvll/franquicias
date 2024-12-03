package com.practicanequi.apirestful.franquicias.service;

import com.practicanequi.apirestful.franquicias.entity.Franquicia;
import com.practicanequi.apirestful.franquicias.repository.FranquiciaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FranquiciaService {
    private FranquiciaRepository franquiciaRepository;

    public FranquiciaService(FranquiciaRepository franquiciaRepository) {
        this.franquiciaRepository = franquiciaRepository;
    }

    public Franquicia create(Franquicia franquicia) {
        return franquiciaRepository.save(franquicia);
    }

    public Franquicia findById(Long id) {
        return franquiciaRepository.findById(id).get();
    }

    public List<Franquicia> findAll() {
        return franquiciaRepository.findAll();
    }

    public void delete(Long id) {
        franquiciaRepository.deleteById(id);
    }

    public Franquicia update(Franquicia franquicia) {
        return franquiciaRepository.save(franquicia);
    }



}
