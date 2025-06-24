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
@Table(name = "tb_despesas")
public class Despesa {

    @Id
    @GeneratedValue(strategy = jakarta.persistence.GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private LocalDate dataDespesa;
    @Column(nullable = false)
    private String descricao;
    @Column(nullable = false)
    private Long valor;
    @Column(nullable = false)
    private String tipo; // Exemplo: "Aluguel", "Conta de Luz", etc.
    @ForeignKey(name = "trabalhador_id")
    private Long trabalhadorId;
    @ForeignKey(name = "mercadoria_id")
    private Long mercadoriaId;
}
