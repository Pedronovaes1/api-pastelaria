package com.pastelaria.pastelaria.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.pastelaria.pastelaria.entity.Pastel;
import com.pastelaria.pastelaria.services.PastelServices;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/pastel-services")
public class PastelController {
    
    public final PastelServices pastelServices;

    public PastelController(PastelServices pastelServices) {
        this.pastelServices = pastelServices;
    }
    
    @GetMapping
    public ResponseEntity<List<Pastel>> findAll(){
        List<Pastel> pasteis = pastelServices.findAll();
        return ResponseEntity.ok(pasteis);
    }

    @PostMapping
    public ResponseEntity<Object> createPastel(@RequestBody Pastel pastel) {
        pastelServices.save(pastel);
        return ResponseEntity.ok("Pastel criado com sucesso!!");
    }

    @GetMapping("/{id}")
    public ResponseEntity<Pastel> findById(@PathVariable(value = "id") Long id){
        Pastel pastel = pastelServices.findById(id);
        if (pastel != null){
            return ResponseEntity.ok(pastel);
        } else{
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Object> deleteById(@PathVariable(value = "id") Long id){
        Pastel pastel = pastelServices.findById(id);
        if (pastel != null){
            pastelServices.deleteById(id);
            return ResponseEntity.ok("Pastel deletado com sucesso!!");
        }else{
            return ResponseEntity.notFound().build();
        }
    }
    
}
