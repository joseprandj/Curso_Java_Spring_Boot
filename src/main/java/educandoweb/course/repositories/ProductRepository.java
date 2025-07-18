package educandoweb.course.repositories;

import educandoweb.course.entities.Category;
import educandoweb.course.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
