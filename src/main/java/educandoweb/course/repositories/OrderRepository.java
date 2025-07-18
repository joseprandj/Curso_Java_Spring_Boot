package educandoweb.course.repositories;

import educandoweb.course.entities.Order;
import educandoweb.course.entities.OrderItem;
import educandoweb.course.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
