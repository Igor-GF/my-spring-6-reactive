package guru.springframework.myspring6reactive.mappers;

import guru.springframework.myspring6reactive.domain.Beer;
import guru.springframework.myspring6reactive.model.BeerDTO;
import org.mapstruct.Mapper;

@Mapper
public interface BeerMapper {
    Beer beerDtoToBeer(BeerDTO dto);
    BeerDTO beerToBeerDto(Beer beer);
}