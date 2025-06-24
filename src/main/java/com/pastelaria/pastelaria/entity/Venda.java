package com.pastelaria.pastelaria.entity;

import java.time.LocalDate;

import org.hibernate.annotations.ForeignKey;

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
@Table(name = "tb_vendas")
public class Venda {
    
    @Id
    @GeneratedValue(strategy = jakarta.persistence.GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private LocalDate dataVenda;
    @Column(nullable = false)
    private Long valorTotal;
    @Column(nullable = false)
    private String formaPagamento; // Exemplo: "Dinheiro", "Cartão de Crédito", etc.
    @ForeignKey(name = "trabalhador_id")
    private Long trabalhadorId; // ID do trabalhador que realizou a venda
}
