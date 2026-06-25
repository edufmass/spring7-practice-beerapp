package ar.edufmass.spring7beerapp.services;

import ar.edufmass.spring7beerapp.model.CustomerDTO;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface CustomerService {
    Optional<CustomerDTO> getCustomerById(UUID uuid);
    List<CustomerDTO> getAllCustomers();
    CustomerDTO saveNewCustomer(CustomerDTO customer);
    void updateCustomerById(UUID customerId, CustomerDTO customer);
    void patchCustomerById(UUID customerId, CustomerDTO customer);
    void deleteCustomerById(UUID customerId);
}
