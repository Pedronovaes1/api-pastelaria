package com.pastelaria.pastelaria.repostirory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pastelaria.pastelaria.entity.Venda;

@Repository
public interface VendaRepository extends JpaRepository<Venda, Long> {
}
