package com.proj.shoes.models.entity;

import com.proj.shoes.models.dto.ShoesDto;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity(name="shoes")
@Table(name="shoes")
@Getter //Gerar getter e setter usando Lombok
@Setter

public class Shoes {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long id;

    @Column(name="modelName")
    private String modelName;

    @Column(name="category")
    private String category;

    @Column(name="brand")
    private String brand;

    @Column(name="price")
    private float price;

    public Shoes() {
    }

    public Shoes(Long id, String name, String category, String brand, float price) {
        setId(id);
        setModelName(name);
        setCategory(category);
        setBrand(brand);
        setPrice(price);
    }

    @Override
    public String toString() {
        return "Produto = {id: " + id + "nome: " + modelName + "categoria: " + category + "marca: " + brand + "preço: " + price + "}";
    }

    public ShoesDto toDto(){ // Conversor 
        ShoesDto shoesDto = new ShoesDto();
        shoesDto.setId(this.id);
        shoesDto.setModelName(this.modelName);
        shoesDto.setCategory(this.category);
        shoesDto.setBrand(this.brand);
        shoesDto.setPrice(this.price);
        return shoesDto;
    }
}