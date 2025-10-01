package com.ponto.digital.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;

@Entity
public class FolhaMensal {
    
    private Long id;

    @ManyToOne
    private Usuario usuario;

    private int mes;
    private int ano;
    private Enum status;
    private String horasTrabalhadas;
}
