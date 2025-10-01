package com.ponto.digital.Model;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Assinatura {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private FolhaMensal folhaMensal;
    private String assinaturaColaborador;
    private LocalDateTime dataAssinaturaColaborador;
    private String ipAssinaturaColaborador;
    private String assinaturaSupervisor;
    private LocalDateTime dataAssinaturaSupervisor;
    private String ipAssinaturaSupervisor;
}
