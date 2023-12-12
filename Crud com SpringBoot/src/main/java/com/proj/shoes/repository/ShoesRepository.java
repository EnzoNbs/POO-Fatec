package com.proj.shoes.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.proj.shoes.models.dto.ShoesDto;

public interface ShoesRepository extends JpaRepository<ShoesDto, Long> {
    
}
