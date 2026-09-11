package sports.marketplace;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;


public interface CartRepozitoriy extends JpaRepository{
    Optional<Cart> findByUserId(Long userId);
}
