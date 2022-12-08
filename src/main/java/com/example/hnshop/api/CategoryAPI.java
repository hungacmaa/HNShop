/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.hnshop.api;

import com.example.hnshop.entity.CategoryEntity;
import com.example.hnshop.entity.ResponseObject;
import com.example.hnshop.service.ICategoryService;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Admin
 */
@RestController
@RequestMapping(value = "api/category")
public class CategoryAPI {
    @Autowired
    private ICategoryService categoryService;
    
    @GetMapping("")
    ResponseEntity<ResponseObject> getAllCategory(){
        return ResponseEntity.status(HttpStatus.OK).body(
                new ResponseObject("ok", "query category success", categoryService.getAll())
        );
    }
    
    @GetMapping("/{id}")
    ResponseEntity<ResponseObject> getCategoryById(@PathVariable long id){
        
        Optional<CategoryEntity> foundCategory = categoryService.getByID(id);
        
        return foundCategory.isPresent()
                ? ResponseEntity.status(HttpStatus.OK).body(
                        new ResponseObject("ok", "query category success", foundCategory)
                )
                : ResponseEntity.status(HttpStatus.NOT_FOUND).body(
                        new ResponseObject("failed", "cannot find category with id = "+id, "")
                );
    }
    
    @DeleteMapping("/{id}")
    ResponseEntity<ResponseObject> deleteCatetoryById(@PathVariable long id){
        return ResponseEntity.status(HttpStatus.OK).body(new ResponseObject("ok", "ok", ""));
    }
}
