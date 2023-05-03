package com.example.sitio_web_back.controller;

import com.example.sitio_web_back.model.Contacto;
import com.example.sitio_web_back.services.ServicioContacto;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://localhost:3000/")
@RestController
@RequestMapping("/api/v1/")
public class ControladorContacto {
    private final ServicioContacto servicioContacto;

    public ControladorContacto(ServicioContacto servicioContacto) {
        this.servicioContacto = servicioContacto;
    }

    @PostMapping("/save_contact")
    public Contacto guardarContacto(@RequestBody Contacto contacto){
        return servicioContacto.guardarContacto(contacto);
    }
}
