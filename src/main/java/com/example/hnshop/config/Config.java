/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.hnshop.config;

import com.example.hnshop.entity.CategoryEntity;
import com.example.hnshop.repository.CategoryRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author Admin
 */
@Configuration
public class Config {
    public static final Logger logger = LoggerFactory.getLogger(Config.class);
    
    @Bean
    CommandLineRunner initDatabase(CategoryRepository repository){
        return new CommandLineRunner(){
            @Override
            public void run(String... args) throws Exception {
//                CategoryEntity cate1 = new CategoryEntity("quan ao");
//                CategoryEntity cate2 = new CategoryEntity("mu non");
//                logger.info("inserted "+repository.save(cate1));
//                logger.info("inserted "+repository.save(cate2));
            }
        };
    }
}
