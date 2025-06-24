package com.pastelaria.pastelaria.repostirory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pastelaria.pastelaria.entity.Pastel;

@Repository
public interface PastelRepository extends JpaRepository<Pastel, Long> {
}
