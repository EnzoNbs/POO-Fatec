package com.proj.shoes.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.proj.shoes.models.dto.ShoesDto;
import com.proj.shoes.services.ShoesServiceImpl;

import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;


@RestController
@RequestMapping("/Shoes")

public class ShoesController {
    @Autowired
    private ShoesServiceImpl services;

    @GetMapping
    public List<ShoesDto> Read() {
        System.out.println("Calçados listados");
        return services.findAll();
    }

    @GetMapping(value="/{id}")
    public Optional<ShoesDto> ReadId(@PathVariable Long id) {
        System.out.println("Calçado mostrado");
        return services.findById(id);
    }

    @PostMapping
    public ShoesDto Create(@RequestBody ShoesDto shoes) {
        System.out.println("Calçado cadastrado com sucesso!");
        return services.save(shoes);
    }

    @PutMapping
    public ShoesDto Update(@RequestBody ShoesDto shoes) {
        System.out.println("Calçado atualizado com sucesso!");
        return services.update(shoes);
    }

    @DeleteMapping(value="/{id}")
    public void Delete(@PathVariable Long id) {
        System.out.println("Calçado removido com sucesso!");
        services.deleteById(id);
    }
    
}
