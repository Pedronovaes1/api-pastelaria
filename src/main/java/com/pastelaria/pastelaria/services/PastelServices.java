package com.pastelaria.pastelaria.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.pastelaria.pastelaria.entity.Pastel;
import com.pastelaria.pastelaria.repostirory.PastelRepository;

@Service
public class PastelServices {
    
    private final PastelRepository pastelRepository;

    public PastelServices(PastelRepository pastelRepository) {
        this.pastelRepository = pastelRepository;
    }

    public List<Pastel> findAll(){
        return pastelRepository.findAll();
    }

    public Pastel findById(Long id){
    return pastelRepository.findById(id).orElse(null);
    }

    public Pastel save(Pastel pastel){
        return pastelRepository.save(pastel);
    }

    public void deleteById(Long id){
        pastelRepository.deleteById(id);
    }

}
