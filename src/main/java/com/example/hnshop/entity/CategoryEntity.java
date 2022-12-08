/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.hnshop.entity;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 *
 * @author Admin
 */
@Entity
@Table(name = "category")
@Getter
@Setter
@NoArgsConstructor
public class CategoryEntity extends BaseEntity{
    
    @Column
    private String name;
    
    @OneToMany(mappedBy = "category")
    private List<ProductEntity> products = new ArrayList<>();

    public CategoryEntity(String name) {
        this.name = name;
    }
    
    
}
