package id.sinaukoding.latihan.repository;

import id.sinaukoding.latihan.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Integer> {
}