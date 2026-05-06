package guru.springframework.myspring6reactive.repositories;

import guru.springframework.myspring6reactive.config.DatabaseConfig;
import guru.springframework.myspring6reactive.domain.Beer;
import guru.springframework.myspring6reactive.model.BeerDTO;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.data.r2dbc.test.autoconfigure.DataR2dbcTest;
import org.springframework.context.annotation.Import;
import tools.jackson.databind.ObjectMapper;

import java.math.BigDecimal;

@DataR2dbcTest
@Import(DatabaseConfig.class)
class BeerRepositoryTest {

    @Autowired
    BeerRepository beerRepository;

    @Test
    void testCreateJson() {
        ObjectMapper objectMapper = new ObjectMapper();

        System.out.println(objectMapper.writeValueAsString(getTestBeer()));
    }

    @Test
    void saveNewBeer() {
        beerRepository.save(getTestBeer())
                .subscribe(beer ->
                        System.out.println(beer.toString())
                );
    }

    Beer getTestBeer() {
        return Beer.builder()
                .beerName("Space Dust")
                .beerStyle("IPA")
                .price(BigDecimal.TEN)
                .quantityOnHand(12)
                .upc("12321")
                .build();
    }
}