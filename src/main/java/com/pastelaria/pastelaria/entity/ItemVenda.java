package com.pastelaria.pastelaria.entity;

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
@Table(name = "tb_itens_venda")
public class ItemVenda {
    
    @Id
    @GeneratedValue(strategy = jakarta.persistence.GenerationType.IDENTITY)
    private Long id;

    @ForeignKey(name = "venda_id")
    private Long vendaId;
    @ForeignKey(name = "pastel_id")
    private Long pastelId;

    @Column(nullable = false)
    private int quantidade;
    @Column(nullable = false)
    private Long subTotal;
}
