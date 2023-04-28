package case_study.repository;

import case_study.model.Customer;
import case_study.utils.ReadAndWriteToFileCustomer;

import java.util.ArrayList;
import java.util.List;

public class CustomerRepository implements ICustomerRepository {
    private static List<Customer> customersList = new ArrayList<>();
    private static final String CUSTOMER_PATH = "src/case_study/data/customer.csv";

    @Override
    public List<Customer> getCustomerList() {
        customersList = ReadAndWriteToFileCustomer.readFile(CUSTOMER_PATH);
        return customersList;
    }

    @Override
    public void addCustomer(Customer customer) {
        customersList.add(customer);
        ReadAndWriteToFileCustomer.writeFile(customersList, CUSTOMER_PATH);
    }

    @Override
    public int findIdCustomer(String idCustomer) {
        int size = customersList.size();
        for (int i = 0; i < size; i++) {
            if (customersList.get(i).getIdCustomer().equals(idCustomer)) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public void editCustomer(Customer customer) {
        customersList.set(findIdCustomer(customer.getIdCustomer()), customer);
        ReadAndWriteToFileCustomer.writeFile(customersList, CUSTOMER_PATH);
    }
}
