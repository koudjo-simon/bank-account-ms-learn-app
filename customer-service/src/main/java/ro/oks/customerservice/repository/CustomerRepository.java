package ro.oks.customerservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ro.oks.customerservice.entities.Customer;


public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
