package ar.edufmass.spring7beerapp.mappers;

import ar.edufmass.spring7beerapp.entities.Beer;
import ar.edufmass.spring7beerapp.model.BeerDTO;
import org.mapstruct.Mapper;

@Mapper
public interface BeerMapper {

    Beer beerDtoToBeer(BeerDTO dto);

    BeerDTO beerToBeerDto(Beer beer);

}
