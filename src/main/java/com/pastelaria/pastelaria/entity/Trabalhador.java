package com.pastelaria.pastelaria.entity;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "tb_trabalhadores")
public class Trabalhador {
    
    @Id
    @GeneratedValue(strategy = jakarta.persistence.GenerationType.IDENTITY) 
    private Long id;

    @Column(nullable = false)
    private String nome;

    @Column(nullable = false)
    private String cpf;

    @Column(nullable = false)
    private String cargo;

    @Column(nullable = false)
    private Long salario;

    @Column(nullable = false)
    private LocalDate dataContratacao;
}
