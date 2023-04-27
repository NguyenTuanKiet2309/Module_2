package case_study.repository;

import case_study.model.Customer;

import java.util.List;

public interface ICustomerRepository{
    List<Customer> getCustomerList();

    void addCustomer(Customer customer);

    int editCustomer(String input);
}
