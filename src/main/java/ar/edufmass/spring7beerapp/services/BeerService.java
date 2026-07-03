package ar.edufmass.spring7beerapp.services;

import ar.edufmass.spring7beerapp.model.BeerDTO;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface BeerService {
    List<BeerDTO> listBeers();
    Optional<BeerDTO> getBeerById(UUID id);
    BeerDTO saveNewBeer(BeerDTO beer);
    Optional<BeerDTO> updateBeerById(UUID beerId, BeerDTO beer);
    void patchBeerById(UUID beerId, BeerDTO beer);
    void deleteById(UUID beerId);
}
