package com.example.sitio_web_back.controller;

import com.example.sitio_web_back.model.Usuario;
import com.example.sitio_web_back.services.ServicioUsuario;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://localhost:3000/")
@RestController
@RequestMapping("/api/v1/")
public class ControladorUsuario {

    private final ServicioUsuario servicioUsuario;

    public ControladorUsuario(ServicioUsuario servicioUsuario) {
        this.servicioUsuario = servicioUsuario;
    }

    @PostMapping("/save_usuario")
    public Usuario crearUsuario(@RequestBody Usuario usuario){
        return servicioUsuario.crearUsuario(usuario);
    }


}
