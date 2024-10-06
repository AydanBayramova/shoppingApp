package az.edu.shopping.shoppingapp.domain.entity;


import jakarta.persistence.*;

import lombok.Data;

import java.math.BigDecimal;


@Data
@Entity
public class ProductEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(length = 1000)
    private String description;

    @Column(nullable = false)
    private BigDecimal price;

    @Column(nullable = false)
    private int stock;

    @ManyToOne
    private CategoryEntity category;

    private String imageUrl;
}
