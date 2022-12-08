/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.hnshop.service.impl;

import com.example.hnshop.entity.CategoryEntity;
import com.example.hnshop.entity.ResponseObject;
import com.example.hnshop.repository.CategoryRepository;
import com.example.hnshop.service.ICategoryService;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

/**
 *
 * @author Admin
 */
@Service
public class CategoryService implements ICategoryService{
    
    @Autowired
    private CategoryRepository repository;

    @Override
    public List<CategoryEntity> getAll() {
        List<CategoryEntity> listCate = repository.findAll();
        return listCate;
    }

    @Override
    public Optional<CategoryEntity> getByID(long id) {
        return repository.findById(id);
        
    }
}
