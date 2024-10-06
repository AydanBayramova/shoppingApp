package az.edu.shopping.shoppingapp.domain.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class ReviewEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private int rating;

    @Column(length = 1000)
    private String comment;

    @ManyToOne
    private UserEntity user;

    @ManyToOne
    private ProductEntity product;
}
