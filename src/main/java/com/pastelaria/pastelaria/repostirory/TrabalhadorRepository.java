package com.pastelaria.pastelaria.repostirory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pastelaria.pastelaria.entity.Trabalhador;

@Repository
public interface TrabalhadorRepository extends JpaRepository<Trabalhador, Long> {
  
}
