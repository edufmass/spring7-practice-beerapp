package ar.edufmass.spring7beerapp.mappers;

import ar.edufmass.spring7beerapp.entities.Customer;
import ar.edufmass.spring7beerapp.model.CustomerDTO;
import org.mapstruct.Mapper;

@Mapper
public interface CustomerMapper {

    Customer customerDtoToCustomer(CustomerDTO dto);

    CustomerDTO customerToCustomerDto(Customer customer);
}
