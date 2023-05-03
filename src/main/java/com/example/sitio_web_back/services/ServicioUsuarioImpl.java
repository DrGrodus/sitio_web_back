package com.example.sitio_web_back.services;

import com.example.sitio_web_back.entity.EntidadUsuario;
import com.example.sitio_web_back.model.Usuario;
import com.example.sitio_web_back.repository.RepositorioUsuario;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

@Service
public class ServicioUsuarioImpl implements ServicioUsuario {

    private RepositorioUsuario repositorioUsuario;

    public ServicioUsuarioImpl(RepositorioUsuario repositorioUsuario) {
        this.repositorioUsuario = repositorioUsuario;
    }

    @Override
    public Usuario crearUsuario(Usuario usuario) {
        EntidadUsuario entidadUsuario = new EntidadUsuario();
        BeanUtils.copyProperties(usuario, entidadUsuario);
        repositorioUsuario.save(entidadUsuario);
        return usuario;
    }
}
