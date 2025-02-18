package com.ecommerce.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "products")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long productId;

    @Column(name = "name")
    private String productName;

    @Column(name = "price")
    private double price;

    @Column(name = "stock")
    private int stock;

    @Column(name = "brand_id")
    private Long brandId;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;

    @ManyToOne
    @JoinColumn(name = "brand_id")
    private Brand brand;

    @Column(name = "description")
    private String description;

    @Column(name = "created_at")
    private Date createdAt;

}
