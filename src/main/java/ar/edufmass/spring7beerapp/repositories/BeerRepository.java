package ar.edufmass.spring7beerapp.repositories;

import ar.edufmass.spring7beerapp.entities.Beer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface BeerRepository extends JpaRepository<Beer, UUID> {
}
