package com.example.sitio_web_back.repository;

import com.example.sitio_web_back.entity.EntidadContacto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositorioContacto extends JpaRepository<EntidadContacto, Long> {
}
