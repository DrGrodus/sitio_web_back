package com.example.sitio_web_back.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "contacto")
public class EntidadContacto {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String nombrePersona;
    private String email;
    private String numeroTel;

    private String mensaje;
}
