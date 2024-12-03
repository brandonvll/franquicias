package com.practicanequi.apirestful.franquicias.repository;

import com.practicanequi.apirestful.franquicias.entity.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductoRepository extends JpaRepository<Producto, Long> {

}
