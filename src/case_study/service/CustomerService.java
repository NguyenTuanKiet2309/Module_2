package case_study.service;

import case_study.model.Customer;
import case_study.model.Employee;
import case_study.repository.CustomerRepository;
import case_study.utils.ReadAndWriteToFileCustomer;
import case_study.utils.ReadAndWriteToFileEmployee;
import case_study.utils.ValidateFurama;

import java.util.List;
import java.util.Scanner;

public class CustomerService implements ICustomerService {
    Scanner sc = new Scanner(System.in);
    private CustomerRepository customerRepository = new CustomerRepository();
    private static final String CUSTOMER_PATH = "src/case_study/data/customer.csv";
    List<Customer> customerList = customerRepository.getCustomerList();

    @Override
    public void addCustomer() {
        String idCustomer;
        do {
            System.out.println("Mời bạn nhập mã khách hàng");
            idCustomer = sc.nextLine();
            if (ValidateFurama.checkIdCustomer(idCustomer)) {
                System.out.println("Nhập thành công");
            } else {
                System.out.println("Bạn nhập không đúng định dạng (KH-XXXX).");
            }
        } while (!ValidateFurama.checkIdCustomer(idCustomer));

        String nameCustomer;
        do {
            System.out.println("Mời bạn nhâp tên khách hàng: ");
            nameCustomer = sc.nextLine();
            if (ValidateFurama.checkName(nameCustomer)) {
                System.out.println("Nhập thành công");
            } else {
                System.out.println("Bạn nhập không đúng định dạng (Viết hoa chữ cái đầu)");
            }
        } while (!ValidateFurama.checkName(nameCustomer));

        String dayOfBirthCustomer;
        do {
            System.out.println("Mời bạn nhâp ngày sinh khách hàng (dd/mm/yyyy): ");
            dayOfBirthCustomer = sc.nextLine();
            if (ValidateFurama.checkDayOfBirth(dayOfBirthCustomer)) {
                System.out.println("Nhập thành công");
            } else {
                System.out.println("Bạn nhập không đúng định dạng");
            }
        } while (!ValidateFurama.checkDayOfBirth(dayOfBirthCustomer));

        String genderCustomer = "";
        boolean flag1 = true;
        do {
            System.out.println("Mời bạn chọn giới tính khách hàng \n" +
                    "1. Nam \n" +
                    "2. Nữ");
            String choiceGender = sc.nextLine();
            switch (choiceGender) {
                case "1":
                    genderCustomer = "Nam";
                    flag1 = false;
                    break;
                case "2":
                    genderCustomer = "Nữ";
                    flag1 = false;
                    break;
                default:
                    System.out.println("Không có lựa chọn");
                    flag1 = true;
            }
        } while (flag1);

        String identilyCardCustomer;
        do {
            System.out.println("Mời bạn nhâp CMND khách hàng: ");
            identilyCardCustomer = sc.nextLine();
            if (ValidateFurama.checkIdentity(identilyCardCustomer)) {
                System.out.println("Nhập thành công");
            } else {
                System.out.println("Bạn nhập không đúng định dang (9 hoặc 12 số)");
            }
        } while (!ValidateFurama.checkIdentity(identilyCardCustomer));

        String phoneNumberCustomer;
        do {
            System.out.println("Mời bạn nhâp SDT khách hàng: ");
            phoneNumberCustomer = sc.nextLine();
            if (ValidateFurama.checkPhone(phoneNumberCustomer)) {
                System.out.println("Nhập thành công");
            } else {
                System.out.println("Bạn nhâp không đúng định dạng(Bắt đầu bằng số 0 và có 10 số)");
            }
        } while (!ValidateFurama.checkPhone(phoneNumberCustomer));

        System.out.println("Mời bạn nhâp email khách hàng: ");
        String emailCustomer = sc.nextLine();

        String typeCustomer = "";
        boolean flag2 = true;
        do {
            System.out.println("Mời bạn chọn loại khách hàng \n" +
                    "1. Diamond \n" +
                    "2. Platinum \n" +
                    "3. Gold \n" +
                    "4. Silver\n" +
                    "5. Member");
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
                    System.out.println("Không có lựa chọn");
                    flag2 = true;
            }
        } while (flag2);

        System.out.println("Nhập địa chỉ khách hàng : ");
        String addressCustomer = sc.nextLine();
        Customer customer = new Customer(idCustomer, nameCustomer, dayOfBirthCustomer, genderCustomer, identilyCardCustomer, phoneNumberCustomer,
                emailCustomer, typeCustomer, addressCustomer);
        customerRepository.addCustomer(customer);
        System.out.println("Thêm mới thành công");

    }

    @Override
    public void editCustomer() {
        System.out.println("Nhập tên mã khách hàng cần sửa: ");
        String input = sc.nextLine();
        int flag = customerRepository.editCustomer(input);
        if (flag == -1) {
            System.out.println("Không tìm thấy mã khách hàng");
        } else {
            String idEdit;
            do {
                System.out.println("Mời bạn nhập mã khách hàng");
                idEdit = sc.nextLine();
                if (ValidateFurama.checkIdCustomer(idEdit)) {
                    System.out.println("Update thành công");
                } else {
                    System.out.println("Bạn nhập không đúng định dạng (NV-XXXX).");
                }
            } while (!ValidateFurama.checkIdCustomer(idEdit));

            String nameEdit;
            do {
                System.out.println("Mời bạn nhâp tên khách hàng ");
                nameEdit = sc.nextLine();
                if (ValidateFurama.checkName(nameEdit)) {
                    System.out.println("Update thành công");
                } else {
                    System.out.println("Bạn nhập không đúng định dạng (Viết hoa chữ cái đầu)");
                }
            } while (!ValidateFurama.checkName(nameEdit));

            String dayOfBirthEdit;
            do {
                System.out.println("Mời bạn nhâp ngày sinh khách hàng (dd/mm/yyyy): ");
                dayOfBirthEdit = sc.nextLine();
                if (ValidateFurama.checkDayOfBirth(dayOfBirthEdit)) {
                    System.out.println("Update thành công");
                } else {
                    System.out.println("Bạn nhập không đúng định dạng");
                }
            } while (!ValidateFurama.checkDayOfBirth(dayOfBirthEdit));

            String genderEdit = "";
            boolean flag6 = true;
            do {
                System.out.println("Mời bạn chọn giới tính khách hàng \n" +
                        "1. Nam \n" +
                        "2. Nữ");
                String choiceGender = sc.nextLine();
                switch (choiceGender) {
                    case "1":
                        genderEdit = "Nam";
                        flag6 = false;
                        break;
                    case "2":
                        genderEdit = "Nữ";
                        flag6 = false;
                        break;
                    default:
                        System.out.println("Không có lựa chọn");
                        flag6 = true;
                }
            } while (flag6);

            String identilyCardEdit;
            do {
                System.out.println("Mời bạn nhâp CMND khách hàng: ");
                identilyCardEdit = sc.nextLine();
                if (ValidateFurama.checkIdentity(identilyCardEdit)) {
                    System.out.println("Update thành công");
                } else {
                    System.out.println("Bạn nhập không đúng định dang (9 hoặc 12 số)");
                }
            } while (!ValidateFurama.checkIdentity(identilyCardEdit));
            String phoneNumberEdit;
            do {
                System.out.println("Mời bạn nhâp SDT khách hàng: ");
                phoneNumberEdit = sc.nextLine();
                if (ValidateFurama.checkPhone(phoneNumberEdit)) {
                    System.out.println("Update thành công");
                } else {
                    System.out.println("Bạn nhâp không đúng định dạng(Bắt đầu bằng số 0 và có 10 số)");
                }
            } while (!ValidateFurama.checkPhone(phoneNumberEdit));

            System.out.println("Mời bạn nhâp email khách hàng: ");
            String emailEdit = sc.nextLine();
            System.out.println("Update thành công");

            String typeCustomerEdit = "";
            boolean flag7 = true;
            do {
                System.out.println("Mời bạn chọn lại loại khách hàng \n" +
                        "1. Diamond \n" +
                        "2. Platinum \n" +
                        "3. Gold \n" +
                        "4. Silver\n" +
                        "5. Member");
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
                        System.out.println("Không có lựa chọn");
                        flag7 = true;
                }
            } while (flag7);

            String addressEdit = "";
            try{
                System.out.println("Nhập lại địa chỉ khách hàng:");
                 addressEdit = sc.nextLine();
            } catch (IndexOutOfBoundsException e){
                e.getStackTrace();
            }

            Customer customer = new Customer(idEdit, nameEdit, dayOfBirthEdit, genderEdit, identilyCardEdit,
                    phoneNumberEdit, emailEdit, typeCustomerEdit, addressEdit);
            customerList.set(flag, customer);
            ReadAndWriteToFileCustomer.writeFile(customerList, CUSTOMER_PATH);
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

