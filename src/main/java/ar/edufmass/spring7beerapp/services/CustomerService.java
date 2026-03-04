package ar.edufmass.spring7beerapp.services;

import ar.edufmass.spring7beerapp.model.Customer;

import java.util.List;
import java.util.UUID;

public interface CustomerService {

    Customer getCustomerById(UUID uuid);

    List<Customer> getAllCustomers();

}
