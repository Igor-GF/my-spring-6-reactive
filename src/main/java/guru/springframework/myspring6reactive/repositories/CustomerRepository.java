package guru.springframework.myspring6reactive.repositories;

import guru.springframework.myspring6reactive.domain.Customer;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface CustomerRepository extends ReactiveCrudRepository<Customer, Integer> {
}
