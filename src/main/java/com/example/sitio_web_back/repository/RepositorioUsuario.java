package com.example.sitio_web_back.repository;

import com.example.sitio_web_back.entity.EntidadUsuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositorioUsuario extends JpaRepository<EntidadUsuario, Long> {

}
