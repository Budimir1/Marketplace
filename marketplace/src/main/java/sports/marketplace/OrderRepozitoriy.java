package sports.marketplace;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface OrderRepozitoriy extends JpaRepository {
    Optional<Order> findByUserId(Long userId);
}
