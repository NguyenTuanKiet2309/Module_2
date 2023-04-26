package case_study.utils;

public class ValidateFurama {
    static final String ID_EMPLOYEE_REGEX = "^(NV)-[0-9]{4}$";
    static final String ID_CUSTOTMER_REGEX = "^(KH)-[0-9]{4}$";
    static final String NAME_REGEX = "";
    static final String AGE_REGEX = "";
    static final String IDENTITY_REGEX = "^([0-9]{9}|[0-9]{12})$";
    static final String PHONE_REGEX = "^(0){1}[0-9]{9}$";
    static final String SALARY_REGEX = "$";

    public static boolean checkIdEmployee(String idEmployee) {
        return idEmployee.matches(ID_EMPLOYEE_REGEX) ? true : false;
    }

    public static boolean checkIdCostomer(String idCustomer) {
        return idCustomer.matches(ID_CUSTOTMER_REGEX) ? true : false;
    }

    public static boolean checkIdentity(String identity) {
        return identity.matches(IDENTITY_REGEX) ? true : false;
    }
    public static boolean checkPhone(String phone){
        return phone.matches(PHONE_REGEX) ? true : false;
    }
}
