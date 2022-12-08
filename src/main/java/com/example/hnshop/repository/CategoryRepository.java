/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.hnshop.repository;

import com.example.hnshop.entity.CategoryEntity;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Admin
 */
public interface CategoryRepository extends JpaRepository<CategoryEntity, Long>{
    
}
