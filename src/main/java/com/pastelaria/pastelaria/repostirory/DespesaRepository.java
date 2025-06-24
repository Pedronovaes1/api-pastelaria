package com.pastelaria.pastelaria.repostirory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pastelaria.pastelaria.entity.Despesa;

@Repository
public interface DespesaRepository extends JpaRepository<Despesa, Long> {}
