/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.hnshop.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "product")
@Getter
@Setter
@NoArgsConstructor

public class ProductEntity extends BaseEntity {

    @Column
    private String name;
    
    @Column
    private String avatar;
    
    @Column
    private float price;
    
    @Column
    private int discount;
    
    @Column
    private String description;
    
    @Column
    private int amount;
    
    @Column
    private Date createdate;
    
    @ManyToOne 
    @JoinColumn(name = "categoryid")
    private CategoryEntity category;
    
    @OneToMany(mappedBy = "product")
    private List<ImageEntity> images = new ArrayList<>();
    
    @OneToMany(mappedBy = "product")
    private List<CartItemEntity> cartitems = new ArrayList<>();
    
    @OneToMany(mappedBy = "product")
    private List<RatingEntity> ratings = new ArrayList<>();
    

}
