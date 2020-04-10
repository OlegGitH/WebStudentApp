package webapp.oleg.service;

import webapp.oleg.entity.Customer;

import java.util.List;

public interface CustomerService {

    List<Customer> getCustomer();

    void saveCustomer(Customer theCustomer);

    Customer getCustomer(int theId);

    void deleteCustomer(int theId);

    List<Customer> searchCustomer(String theSearchName);
}
