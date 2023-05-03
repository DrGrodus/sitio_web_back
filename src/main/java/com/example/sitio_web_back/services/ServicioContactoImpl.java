package com.example.sitio_web_back.services;

import com.example.sitio_web_back.entity.EntidadContacto;
import com.example.sitio_web_back.model.Contacto;
import com.example.sitio_web_back.repository.RepositorioContacto;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

@Service
public class ServicioContactoImpl implements ServicioContacto {

    private RepositorioContacto repositorioContacto;

    public ServicioContactoImpl(RepositorioContacto repositorioContacto){
        this.repositorioContacto = repositorioContacto;
    }

    @Override
    public Contacto guardarContacto(Contacto contacto) {
        EntidadContacto entidadContacto = new EntidadContacto();
        BeanUtils.copyProperties(contacto, entidadContacto);
        repositorioContacto.save(entidadContacto);
        return contacto;
    }
}
