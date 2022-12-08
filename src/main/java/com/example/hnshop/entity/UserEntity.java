/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.hnshop.entity;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.lang.Nullable;

/**
 *
 * @author Admin
 */
@Entity
@Table(name = "user")
@Getter
@Setter
@NoArgsConstructor
public class UserEntity extends BaseEntity {
    
    @Column
    private String username;
    
    @Column
    private String password;
    
    @Column
    private String fullname;
    
    @Column
    private String email;
    
    @Column
    private String country;
    
    @Column
    private int isadmin;
    
    @OneToMany(mappedBy = "user")
    List<BillEntity> bills = new ArrayList<>();
    
    @OneToMany(mappedBy = "user")
    List<CartItemEntity> cartitems = new ArrayList<>();
    
    @OneToMany(mappedBy = "user")
    List<RatingEntity> ratings = new ArrayList<>();
    
}
