package spring.service;

import spring.model.Customer;


import java.util.List;

/**
 * Created by SAM on 12/27/2015.
 */
public interface CustomerService {
    List<Customer> findAll();
}
