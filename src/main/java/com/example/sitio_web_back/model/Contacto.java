package com.example.sitio_web_back.model;

import lombok.Data;

@Data
public class Contacto {
    private long id;
    private String nombrePersona;
    private String email;
    private String numeroTel;
    private String mensaje;
}
