package com.ecommerce.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "brands")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Brand {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int brandId;

    @Column(name = "name")
    private String brandName;

    @OneToMany(mappedBy = "brand")
    private List<Product> products;

}
