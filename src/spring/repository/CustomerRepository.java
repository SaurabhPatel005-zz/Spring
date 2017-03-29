package spring.repository;

import spring.model.Customer;

import java.util.List;

/**
 * Created by SAM on 12/27/2015.
 */
//hello from b
public interface CustomerRepository {
    List<Customer> findAll();
}
