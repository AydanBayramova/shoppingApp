package az.edu.shopping.shoppingapp.domain.repository;

import az.edu.shopping.shoppingapp.domain.entity.ReviewEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReviewRepository extends JpaRepository<ReviewEntity, Long> {
}
