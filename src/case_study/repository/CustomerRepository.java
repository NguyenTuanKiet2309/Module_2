package case_study.repository;

import case_study.model.Customer;
import case_study.model.Employee;
import case_study.utils.ReadAndWriteToFileCustomer;
import case_study.utils.ReadAndWriteToFileEmployee;

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
    public int editCustomer(String input) {
        int size = customersList.size();
        for (int i = 0; i < size; i++) {
            if (customersList.get(i).getIdCustomer().equals(input)) {
                return i;
            }
        }
        return -1;
    }
}
