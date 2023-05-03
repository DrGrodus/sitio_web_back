package com.example.sitio_web_back.model;

import lombok.Data;

@Data
public class Usuario {

    private long id;
    private String nombreUsuario;
    private String email;
    private String contrasena;
}
