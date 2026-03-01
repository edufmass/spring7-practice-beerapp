package ar.edufmass.spring7beerapp.services;

import ar.edufmass.spring7beerapp.model.Beer;

import java.util.UUID;

public interface BeerService {
    Beer getBeerById(UUID id);
}
