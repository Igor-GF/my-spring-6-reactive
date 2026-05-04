package guru.springframework.myspring6reactive.repositories;

import guru.springframework.myspring6reactive.domain.Beer;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface BeerRepository extends ReactiveCrudRepository<Beer, Integer> {

}
