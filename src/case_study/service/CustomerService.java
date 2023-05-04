package case_study.service;

import case_study.model.Customer;
import case_study.repository.CustomerRepository;
import case_study.utils.ValidateFurama;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

public class CustomerService implements ICustomerService {
    Scanner sc = new Scanner(System.in);
    private CustomerRepository customerRepository = new CustomerRepository();

    @Override
    public void addCustomer() {
        String idCustomer;
        do {
            System.out.print("Enter Id Customer: ");
            idCustomer = sc.nextLine();
            if (!ValidateFurama.checkIdCustomer(idCustomer)) {
                System.out.println("You input invalid format(KH-XXXX)");
            }
        } while (!ValidateFurama.checkIdCustomer(idCustomer));

        String nameCustomer;
        do {
            System.out.print("Enter Name Customer: ");
            nameCustomer = sc.nextLine();
            if (!ValidateFurama.checkName(nameCustomer)) {
                System.out.println("You input invalid format(Capitalize first letter)");
            }
        } while (!ValidateFurama.checkName(nameCustomer));

        String dayOfBirthCustomer;
        boolean checkAge = true;
        do {
            System.out.print("Enter Day Of Birth Customer(dd/mm/yyyy): ");
            dayOfBirthCustomer = sc.nextLine();
            LocalDate localDate = LocalDate.parse(dayOfBirthCustomer);
            if (ValidateFurama.checkDayOfBirth(dayOfBirthCustomer) && ValidateFurama.checkAge(localDate) >= 18) {
               checkAge = false;
            } else {
                System.out.println("You input invalid format or under 18 age.");
            }
        } while (checkAge);

        String genderCustomer = "";
        boolean flag1 = true;
        do {
            System.out.print("Enter Gender Customer \n" +
                    "1. Male \n" +
                    "2. Female \n" +
                    "Enter your choice: ");
            String choiceGender = sc.nextLine();
            switch (choiceGender) {
                case "1":
                    genderCustomer = "Male";
                    flag1 = false;
                    break;
                case "2":
                    genderCustomer = "Female";
                    flag1 = false;
                    break;
                default:
                    System.out.println("No choice - Enter your choice again!");
                    flag1 = true;
            }
        } while (flag1);

        String identilyCardCustomer;
        do {
            System.out.print("Enter Identity for Customer: ");
            identilyCardCustomer = sc.nextLine();
            if (!ValidateFurama.checkIdentity(identilyCardCustomer)) {
                System.out.println("You input invalid format(9 or 12 numbes)");
            }
        } while (!ValidateFurama.checkIdentity(identilyCardCustomer));

        String phoneNumberCustomer;
        do {
            System.out.print("Enter Phone Number Customer: ");
            phoneNumberCustomer = sc.nextLine();
            if (!ValidateFurama.checkPhone(phoneNumberCustomer)) {
                System.out.println("You input invalid format(Start with number 0 and has 10 numbers)");
            }
        } while (!ValidateFurama.checkPhone(phoneNumberCustomer));

        System.out.print("Enter Email Customer: ");
        String emailCustomer = sc.nextLine();

        String typeCustomer = "";
        boolean flag2 = true;
        do {
            System.out.print("Please select customer type: \n" +
                    "1. Diamond \n" +
                    "2. Platinum \n" +
                    "3. Gold \n" +
                    "4. Silver\n" +
                    "5. Member \n" +
                    "Enter your choice: ");
            String choiceTypeCustomer = sc.nextLine();
            switch (choiceTypeCustomer) {
                case "1":
                    typeCustomer = "Diamond";
                    flag2 = false;
                    break;
                case "2":
                    typeCustomer = "Platinum";
                    flag2 = false;
                    break;
                case "3":
                    typeCustomer = "Gold";
                    flag2 = false;
                    break;
                case "4":
                    typeCustomer = "Silver";
                    flag2 = false;
                    break;
                case "5":
                    typeCustomer = "Member";
                    flag2 = false;
                    break;
                default:
                    System.out.println("No choice - Enter your choice again!");
                    flag2 = true;
            }
        } while (flag2);

        System.out.print("Enter address Customer: ");
        String addressCustomer = sc.nextLine();

        Customer customer = new Customer(idCustomer, nameCustomer, dayOfBirthCustomer, genderCustomer, identilyCardCustomer,
                phoneNumberCustomer, emailCustomer, typeCustomer, addressCustomer);
        customerRepository.addCustomer(customer);
        System.out.println("Add New Customer Successful");

    }

    @Override
    public void editCustomer() {
        System.out.print("Enter the id of the customer code that needs to be edited: ");
        String idCustomer = sc.nextLine();
        int flag = customerRepository.findIdCustomer(idCustomer);
        if (flag == -1) {
            System.out.println("Customer code not found");
        } else {
            String idEdit = idCustomer;
            String nameEdit;
            do {
                System.out.print("Enter Name for Customer again: ");
                nameEdit = sc.nextLine();
                if (ValidateFurama.checkName(nameEdit)) {
                    System.out.println("Update Successful");
                } else {
                    System.out.println("You input invalid format(Capitalize first letter)");
                }
            } while (!ValidateFurama.checkName(nameEdit));

            String dayOfBirthEdit;
            boolean checkAge = true;
            do {
                System.out.print("Enter Date Of Birth for Customer again(yyyy-mm-dd): ");
                dayOfBirthEdit = sc.nextLine();
                LocalDate localDate = LocalDate.parse(dayOfBirthEdit);
                if (ValidateFurama.checkDayOfBirth(dayOfBirthEdit)&& ValidateFurama.checkAge(localDate) >= 18) {
                    checkAge = false;
                    System.out.println("Update Successful");
                } else {
                    System.out.println("You input invalid format(yyyy-mm-dd)");
                }
            } while (checkAge);

            String genderEdit = "";
            boolean flag6 = true;
            do {
                System.out.print("Please select customer gender \n" +
                        "1. Male \n" +
                        "2. Female \n" +
                        "Enter your choice: ");
                String choiceGender = sc.nextLine();
                switch (choiceGender) {
                    case "1":
                        genderEdit = "Male";
                        flag6 = false;
                        break;
                    case "2":
                        genderEdit = "Female";
                        flag6 = false;
                        break;
                    default:
                        System.out.println("No choice - Enter your choice again!");
                        flag6 = true;
                }
                System.out.println("Update Successful");
            } while (flag6);

            String identilyCardEdit;
            do {
                System.out.print("Enter Customer ID Card again: ");
                identilyCardEdit = sc.nextLine();
                if (ValidateFurama.checkIdentity(identilyCardEdit)) {
                    System.out.println("Update Successful");
                } else {
                    System.out.println("You input invalid format(9 or 12 numbers)");
                }
            } while (!ValidateFurama.checkIdentity(identilyCardEdit));
            String phoneNumberEdit;
            do {
                System.out.print("Enter Phone Number for Customer again: ");
                phoneNumberEdit = sc.nextLine();
                if (ValidateFurama.checkPhone(phoneNumberEdit)) {
                    System.out.println("Update Successful");
                } else {
                    System.out.println("You input invalid format(Start with number 0 and has 10 numbers)");
                }
            } while (!ValidateFurama.checkPhone(phoneNumberEdit));

            System.out.print("Enter Email for Customer again: ");
            String emailEdit = sc.nextLine();

            String typeCustomerEdit = "";
            boolean flag7 = true;
            do {
                System.out.print("Please select the customer type again \n" +
                        "1. Diamond \n" +
                        "2. Platinum \n" +
                        "3. Gold \n" +
                        "4. Silver\n" +
                        "5. Member \n" +
                        "Enter your choice: ");
                String choiceTypeCustomer = sc.nextLine();
                switch (choiceTypeCustomer) {
                    case "1":
                        typeCustomerEdit = "Diamond";
                        flag7 = false;
                        break;
                    case "2":
                        typeCustomerEdit = "Platinum";
                        flag7 = false;
                        break;
                    case "3":
                        typeCustomerEdit = "Gold";
                        flag7 = false;
                        break;
                    case "4":
                        typeCustomerEdit = "Silver";
                        flag7 = false;
                        break;
                    case "5":
                        typeCustomerEdit = "Member";
                        flag7 = false;
                        break;
                    default:
                        System.out.println("No choice - Enter your choice again!");
                        flag7 = true;
                }
                System.out.println("Update Successful");
            } while (flag7);

            String addressEdit = "";
            try{
                System.out.print("Enter address for Customer again:");
                addressEdit = sc.nextLine();
            } catch (IndexOutOfBoundsException e){
                e.getStackTrace();
            }

            Customer customer = new Customer(idEdit, nameEdit, dayOfBirthEdit, genderEdit, identilyCardEdit,
                    phoneNumberEdit, emailEdit, typeCustomerEdit, addressEdit);
            customerRepository.editCustomer(customer);
            System.out.println("Update Successful!");
        }
}

    @Override
    public void showCustomerList() {
        List<Customer> list = customerRepository.getCustomerList();
        for (Customer c : list) {
            System.out.println(c);
        }
    }
}

