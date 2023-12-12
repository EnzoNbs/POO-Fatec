package com.proj.shoes.services;

import java.util.List;
import java.util.Optional;

import com.proj.shoes.models.dto.ShoesDto;

public interface ShoesServices { // Operações Crud
    ShoesDto save(ShoesDto shoes);

    List<ShoesDto> findAll();

    Optional<ShoesDto> findById(Long id);

    ShoesDto update(ShoesDto shoes);

    void deleteById(Long id);
}
