package com.pastelaria.pastelaria.repostirory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pastelaria.pastelaria.entity.Mercadoria;

@Repository
public interface MercadoriaRepository extends JpaRepository<Mercadoria, Long> {
}
