package spring.service;

import spring.model.Customer;
import spring.repository.CustomerRepository;
import spring.repository.HibernateCustomerRepositoryImpl;

import java.util.List;

/**
 * Created by SAM on 12/27/2015.
 */
public class CustomerServiceImpl implements CustomerService {
    private CustomerRepository customerRepository = new HibernateCustomerRepositoryImpl();

    @Override
    public List<Customer> findAll(){
        return customerRepository.findAll();
    }
}
