/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.hnshop.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 *
 * @author Admin
 */
@Entity
@Table(name = "image")
@Getter
@Setter
@NoArgsConstructor

public class ImageEntity extends BaseEntity{
    
    @Column
    private String src;
    
    @ManyToOne
    @JoinColumn(name = "productid")
    private ProductEntity product;
    
}
