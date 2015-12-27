package spring.repository;

import spring.model.Customer;

import java.util.ArrayList;
import java.util.List;

public class HibernateCustomerRepositoryImpl implements CustomerRepository {

    public List<Customer> findAll(){
        List<Customer> customers = new ArrayList<>();
        Customer customer = new Customer();
        customer.setFirstName("Saurabh");
        customer.setLastName("Patel");
        customers.add(customer);
        return customers;
    }

}
