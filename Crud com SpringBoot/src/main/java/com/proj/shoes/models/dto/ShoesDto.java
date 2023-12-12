package com.proj.shoes.models.dto;

import com.proj.shoes.models.entity.Shoes;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter //Gerar getter e setter usando Lombok
@Setter

public class ShoesDto {
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

    public ShoesDto() {
    }

    public ShoesDto(Long id, String name, String category, String brand, float price) {
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

    public Shoes toEntity(){ // Conversor para entidade
        Shoes shoes = new Shoes();
        shoes.setId(this.id);
        shoes.setModelName(this.modelName);
        shoes.setCategory(this.category);
        shoes.setBrand(this.brand);
        shoes.setPrice(this.price);
        return shoes;
    }
}
