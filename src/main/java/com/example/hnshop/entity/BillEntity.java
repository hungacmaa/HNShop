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
import javax.persistence.JoinTable;
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
@Table(name = "bill")
@Getter
@Setter
@NoArgsConstructor

public class BillEntity extends BaseEntity{
    
    @Column
    private Date makedate;
    
    @ManyToOne
    @JoinColumn(name = "userid")
    private UserEntity user;
    
    @OneToMany(mappedBy = "bill")
    List<BillItemEntity> billitems = new ArrayList<>();
    
}
