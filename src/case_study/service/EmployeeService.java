package case_study.service;

import case_study.model.Employee;
import case_study.repository.EmployeeRepository;
import case_study.utils.ReadAndWriteToFileEmployee;
import case_study.utils.ValidateFurama;

import java.util.List;
import java.util.Scanner;

public class EmployeeService implements IEmployeeService {
    Scanner sc = new Scanner(System.in);
    private EmployeeRepository employeeRepository = new EmployeeRepository();
    private static final String EMPLOYEE_PATH = "src/case_study/data/employee.csv";
    List<Employee> employeeList = employeeRepository.getEmployeeList();

    @Override
    public void addEmployee() {
        String idEmployee;
        do {
            System.out.println("Mời bạn nhập mã nhân viên");
            idEmployee = sc.nextLine();
            if (ValidateFurama.checkIdEmployee(idEmployee)) {
                System.out.println("Nhập thành công");
            } else {
                System.out.println("Bạn nhập không đúng định dạng (NV-XXXX).");
            }
        } while (!ValidateFurama.checkIdEmployee(idEmployee));

        String nameEmployee;
        do {
            System.out.println("Mời bạn nhâp tên nhân viên: ");
            nameEmployee = sc.nextLine();
            if (ValidateFurama.checkName(nameEmployee)) {
                System.out.println("Nhập thành công");
            } else {
                System.out.println("Bạn nhập không đúng định dạng (Viết hoa chữ cái đầu)");
            }
        } while (!ValidateFurama.checkName(nameEmployee));

        String dayOfBirthEmployee;
        do {
            System.out.println("Mời bạn nhâp ngày sinh nhân viên (dd/mm/yyyy): ");
            dayOfBirthEmployee = sc.nextLine();
            if (ValidateFurama.checkDayOfBirth(dayOfBirthEmployee)) {
                System.out.println("Nhập thành công");
            } else {
                System.out.println("Bạn nhập không đúng định dạng");
            }
        } while (!ValidateFurama.checkDayOfBirth(dayOfBirthEmployee));

        String genderEmployee = "";
        boolean flag1 = true;
        do {
            System.out.println("Mời bạn chọn giới tính nhân viên \n" +
                    "1. Nam \n" +
                    "2. Nữ");
            String choiceGender = sc.nextLine();
            switch (choiceGender) {
                case "1":
                    genderEmployee = "Nam";
                    flag1 = false;
                    break;
                case "2":
                    genderEmployee = "Nữ";
                    flag1 = false;
                    break;
                default:
                    System.out.println("Không có lựa chọn");
                    flag1 = true;
            }
        } while (flag1);

        String identilyCardEmployee;
        do {
            System.out.println("Mời bạn nhâp CMND nhân viên: ");
            identilyCardEmployee = sc.nextLine();
            if (ValidateFurama.checkIdentity(identilyCardEmployee)) {
                System.out.println("Nhập thành công");
            } else {
                System.out.println("Bạn nhập không đúng định dang (9 hoặc 12 số)");
            }
        } while (!ValidateFurama.checkIdentity(identilyCardEmployee));

        String phoneNumberEmployee;
        do {
            System.out.println("Mời bạn nhâp SDT nhân viên: ");
            phoneNumberEmployee = sc.nextLine();
            if (ValidateFurama.checkPhone(phoneNumberEmployee)) {
                System.out.println("Nhập thành công");
            } else {
                System.out.println("Bạn nhâp không đúng định dạng(Bắt đầu bằng số 0 và có 10 số)");
            }
        } while (!ValidateFurama.checkPhone(phoneNumberEmployee));
        System.out.println("Mời bạn nhâp email nhân viên: ");
        String emailEmployee = sc.nextLine();

        String educationEmployee = "";
        boolean flag2 = true;
        do {
            System.out.println("Mời bạn chọn trình độ nhân viên \n" +
                    "1. Trung Cấp \n" +
                    "2. Cao Đẳng \n" +
                    "3. Đại Học \n" +
                    "4. Sau Đại Học");
            String choiceEducation = sc.nextLine();
            switch (choiceEducation) {
                case "1":
                    educationEmployee = "Trung Cấp";
                    flag2 = false;
                    break;
                case "2":
                    educationEmployee = "Cao Đẳng";
                    flag2 = false;
                    break;
                case "3":
                    educationEmployee = "Đại Học";
                    flag2 = false;
                    break;
                case "4":
                    educationEmployee = "Sau Đại Học";
                    flag2 = false;
                    break;
                default:
                    System.out.println("Không có lựa chọn");
                    flag2 = true;
            }
        } while (flag2);
        String locationEmployee = "";
        boolean flag3 = true;
        do {
            System.out.println("Mời bạn chọn vị trí nhân viên \n" +
                    "1. Lễ Tân \n" +
                    "2. Phục Vụ \n" +
                    "3. Chuyên Viên \n" +
                    "4. Giám sát \n" +
                    "5. Quản Lý \n" +
                    "6. Giám Đốc");
            String choiceLocation = sc.nextLine();
            switch (choiceLocation) {
                case "1":
                    locationEmployee = "Lễ Tân";
                    flag3 = false;
                    break;
                case "2":
                    locationEmployee = "Phục Vụ";
                    flag3 = false;
                    break;
                case "3":
                    locationEmployee = "Chuyên Viên";
                    flag3 = false;
                    break;
                case "4":
                    locationEmployee = "Giám sát";
                    flag3 = false;
                    break;
                case "5":
                    locationEmployee = "Quản Lý";
                    flag3 = false;
                    break;
                case "6":
                    locationEmployee = "Giám Đốc";
                    flag3 = false;
                    break;
                default:
                    System.out.println("Không có lựa chọn");
                    flag3 = true;
            }
        } while (flag3);
        System.out.println("Mời bạn nhập lương nhân viên:");
        double salaryEmployee = sc.nextDouble();
        if (salaryEmployee < 0 || salaryEmployee == 0) {
            System.out.println("Mời bạn nhập lại lương nhân viên (phải lớn hơn 0)");
        } else {
            System.out.println("Nhập thành công");
        }
        Employee employee = new Employee(idEmployee, nameEmployee, dayOfBirthEmployee, genderEmployee, identilyCardEmployee, phoneNumberEmployee
                , emailEmployee, educationEmployee, locationEmployee, salaryEmployee);
        employeeRepository.addEmployee(employee);
        System.out.println("Thêm mới thành công");
    }


    @Override
    public void editEployee() {
        System.out.println("Nhập tên mã nhân viên cần sửa: ");
        String input = sc.nextLine();
        int flag = employeeRepository.editEmployee(input);
        if (flag == -1) {
            System.out.println("Không tìm thấy mã nhân viên");
        } else {
            String idEdit;
            do {
                System.out.println("Mời bạn nhập mã nhân viên");
                idEdit = sc.nextLine();
                if (ValidateFurama.checkIdEmployee(idEdit)) {
                    System.out.println("Update thành công");
                } else {
                    System.out.println("Bạn nhập không đúng định dạng (NV-XXXX).");
                }
            } while (!ValidateFurama.checkIdEmployee(idEdit));

            String nameEdit;
            do {
                System.out.println("Mời bạn nhâp tên nhân viên: ");
                nameEdit = sc.nextLine();
                if (ValidateFurama.checkName(nameEdit)) {
                    System.out.println("Update thành công");
                } else {
                    System.out.println("Bạn nhập không đúng định dạng (Viết hoa chữ cái đầu)");
                }
            } while (!ValidateFurama.checkName(nameEdit));
            String dayOfBirthEdit;
            do {
                System.out.println("Mời bạn nhâp ngày sinh nhân viên (dd/mm/yyyy): ");
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
                System.out.println("Mời bạn chọn giới tính nhân viên \n" +
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
                System.out.println("Mời bạn nhâp CMND nhân viên: ");
                identilyCardEdit = sc.nextLine();
                if (ValidateFurama.checkIdentity(identilyCardEdit)) {
                    System.out.println("Update thành công");
                } else {
                    System.out.println("Bạn nhập không đúng định dang (9 hoặc 12 số)");
                }
            } while (!ValidateFurama.checkIdentity(identilyCardEdit));
            String phoneNumberEdit;
            do {
                System.out.println("Mời bạn nhâp SDT nhân viên: ");
                phoneNumberEdit = sc.nextLine();
                if (ValidateFurama.checkPhone(phoneNumberEdit)) {
                    System.out.println("Update thành công");
                } else {
                    System.out.println("Bạn nhâp không đúng định dạng(Bắt đầu bằng số 0 và có 10 số)");
                }
            } while (!ValidateFurama.checkPhone(phoneNumberEdit));

            System.out.println("Mời bạn nhâp email nhân viên: ");
            String emailEdit = sc.nextLine();
            System.out.println("Update thành công");
            String educationEdit = "";
            boolean flag4 = true;
            do {
                System.out.println("Mời bạn chọn trình độ nhân viên \n" +
                        "1. Trung Cấp \n" +
                        "2. Cao Đẳng \n" +
                        "3. Đại Học \n" +
                        "4. Sau Đại Học");
                String choiceEducation = sc.nextLine();
                switch (choiceEducation) {
                    case "1":
                        educationEdit = "Trung Cấp";
                        flag4 = false;
                        break;
                    case "2":
                        educationEdit = "Cao Đẳng";
                        flag4 = false;
                        break;
                    case "3":
                        educationEdit = "Đại Học";
                        flag4 = false;
                        break;
                    case "4":
                        educationEdit = "Sau Đại Học";
                        flag4 = false;
                        break;
                    default:
                        System.out.println("Không có lựa chọn");
                        flag4 = true;
                }
            } while (flag4);
            String locationEdit = "";
            boolean flag5 = true;
            do {
                System.out.println("Mời bạn chọn vị trí nhân viên \n" +
                        "1. Lễ Tân \n" +
                        "2. Phục Vụ \n" +
                        "3. Chuyên Viên \n" +
                        "4. Giám sát \n" +
                        "5. Quản Lý \n" +
                        "6. Giám Đốc");
                String choiceLocation = sc.nextLine();
                switch (choiceLocation) {
                    case "1":
                        locationEdit = "Lễ Tân";
                        flag5 = false;
                        break;
                    case "2":
                        locationEdit = "Phục Vụ";
                        flag5 = false;
                        break;
                    case "3":
                        locationEdit = "Chuyên Viên";
                        flag5 = false;
                        break;
                    case "4":
                        locationEdit = "Giám sát";
                        flag5 = false;
                        break;
                    case "5":
                        locationEdit = "Quản Lý";
                        flag5 = false;
                        break;
                    case "6":
                        locationEdit = "Giám Đốc";
                        flag5 = false;
                        break;
                    default:
                        System.out.println("Không có lựa chọn");
                        flag5 = true;
                }
            } while (flag5);
            System.out.println("Mời bạn nhập lương nhân viên:");
            double salaryEdit = sc.nextDouble();
            if (salaryEdit < 0 || salaryEdit == 0) {
                System.out.println("Mời bạn nhập lại lương nhân viên (phải lớn hơn 0)");
            } else {
                System.out.println("Update thành công");
            }
            Employee employee = new Employee(idEdit, nameEdit, dayOfBirthEdit, genderEdit, identilyCardEdit, phoneNumberEdit,
                    emailEdit, educationEdit, locationEdit, salaryEdit);
            employeeList.set(flag, employee);
            ReadAndWriteToFileEmployee.writeFile(employeeList, EMPLOYEE_PATH);
        }
    }

    @Override
    public void showEmployeeList() {
        List<Employee> list = employeeRepository.getEmployeeList();
        for (Employee e : list) {
            System.out.println(e);
        }
    }
}
