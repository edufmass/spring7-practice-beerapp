package ar.edufmass.spring7beerapp.repositories;

import ar.edufmass.spring7beerapp.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface CustomerRepository extends JpaRepository<Customer, UUID> {
}
