/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.hnshop.service;

import com.example.hnshop.entity.CategoryEntity;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author Admin
 */
public interface ICategoryService {
    public List<CategoryEntity> getAll();
    public Optional<CategoryEntity> getByID(long id);
    
}
