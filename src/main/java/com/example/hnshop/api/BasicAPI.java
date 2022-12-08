/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.hnshop.api;

import com.example.hnshop.dto.CategoryDTO;
import com.example.hnshop.entity.CategoryEntity;
import com.example.hnshop.entity.ProductEntity;
import com.example.hnshop.entity.UserEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api")
public class BasicAPI {
//    
//    @GetMapping("test4")
//    public String testAPI4() {
//        return "hung";
//    }
//    
//    @GetMapping("category")
//    public CategoryEntity getCategories() {
//        CategoryEntity ce = new CategoryEntity();
//        return ce;
//    }
//    
//    @PostMapping("category")
//    public CategoryDTO addCategory(@RequestBody CategoryDTO model) {
//        return model;
//    }
//    
//    @GetMapping("test2")
//    public UserEntity testAPI2() {
//        UserEntity ue = new UserEntity();
//        return ue;
//    }
//    @GetMapping("product")
//    public ProductEntity testAPI3() {
//        ProductEntity pe = new ProductEntity();
//        return pe;
//    }
}
