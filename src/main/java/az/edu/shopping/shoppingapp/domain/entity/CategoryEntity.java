package az.edu.shopping.shoppingapp.domain.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class CategoryEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String name;

}
