package com.proj.shoes.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.proj.shoes.models.dto.ShoesDto;
import com.proj.shoes.repository.ShoesRepository;

@Service
public class ShoesServiceImpl implements ShoesServices { 
    private ShoesRepository shoesRep;

    //Regra de negócio
    @Override
    public ShoesDto save(ShoesDto shoes) {
        return shoesRep.save(shoes);
    }

    @Override
    public List<ShoesDto> findAll() {
        return shoesRep.findAll();
    }

    @Override
    public Optional<ShoesDto> findById(Long id) {
        return shoesRep.findById(id);
    }
    
    @Override
    public ShoesDto update(ShoesDto shoes) {
        return shoesRep.save(shoes);
    }

    @Override
    public void deleteById(Long id) {
        shoesRep.deleteById(id);
    }
    
}
