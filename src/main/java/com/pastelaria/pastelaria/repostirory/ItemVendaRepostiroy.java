package com.pastelaria.pastelaria.repostirory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pastelaria.pastelaria.entity.ItemVenda;

@Repository
public interface ItemVendaRepostiroy extends JpaRepository<ItemVenda, Long> {}
