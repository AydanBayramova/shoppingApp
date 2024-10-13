package az.edu.shopping.shoppingapp.domain.repository;

import az.edu.shopping.shoppingapp.domain.entity.BasketEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BasketRepository extends JpaRepository<BasketEntity,Long> {
}
