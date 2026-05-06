package guru.springframework.myspring6reactive.mappers;

import guru.springframework.myspring6reactive.domain.Customer;
import guru.springframework.myspring6reactive.model.CustomerDTO;
import org.mapstruct.Mapper;

@Mapper
public interface CustomerMapper {
    Customer customerDtoToCustomer(CustomerDTO dto);
    CustomerDTO customerToCustomerDto(Customer customer);
}
