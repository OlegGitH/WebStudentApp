package webapp.oleg.dao;

import webapp.oleg.entity.Customer;

import java.util.List;

public interface CustomerDAO {

    public List<Customer> getCustomer();

    void saveCustomer(Customer theCustomer);

    Customer getCustomer(int theId);

    void deleteCustomer(int theId);

    List<Customer> searchCustomer(String theSearchName);
}
