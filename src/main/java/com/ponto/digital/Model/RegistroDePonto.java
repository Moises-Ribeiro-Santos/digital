package com.ponto.digital.Model;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;

@Entity
public class RegistroDePonto {
    
    private Long id;
    private Usuario usuario;
    private LocalDateTime dataHora;
    private Enum tipo;
    private String localizacao;
}
