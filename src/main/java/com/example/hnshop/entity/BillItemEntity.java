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
@Table(name = "billitem")
@Getter
@Setter
@NoArgsConstructor
public class BillItemEntity extends BaseEntity{
    
    @Column
    private int productid;
    
    @Column
    private int amount;
    
    @ManyToOne
    @JoinColumn(name = "billid")
    private BillEntity bill;
    
    
}
