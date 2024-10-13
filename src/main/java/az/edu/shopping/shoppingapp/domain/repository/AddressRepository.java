package az.edu.shopping.shoppingapp.domain.repository;

import az.edu.shopping.shoppingapp.domain.entity.AddressEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressRepository extends JpaRepository<AddressEntity,Long> {
}
