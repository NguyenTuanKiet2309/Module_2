package case_study.utils;

import java.util.regex.Pattern;

public class ValidateFurama {
    static final String ID_EMPLOYEE_REGEX = "^(NV)-[0-9]{4}$";
    static final String ID_CUSTOTMER_REGEX = "^(KH)-[0-9]{4}$";
    static final String NAME_REGEX = "^([A-Z]{1}[a-z ]+){2,5}$";
    static final String AGE_REGEX = "^\\d{1,2}[-|/]\\d{1,2}[-|/]\\d{4}$";
    static final String IDENTITY_REGEX = "^([0-9]{9}|[0-9]{12})$";
    static final String PHONE_REGEX = "^(0){1}[0-9]{9}$";

    public static boolean checkIdEmployee(String idEmployee) {
        return Pattern.matches(ID_EMPLOYEE_REGEX,idEmployee);
    }

    public static boolean checkIdCustomer(String idCustomer) {
        return Pattern.matches(ID_CUSTOTMER_REGEX,idCustomer);
    }

    public static boolean checkIdentity(String identity) {
         return Pattern.matches(IDENTITY_REGEX, identity);
    }

    public static boolean checkPhone(String phone) {
        return Pattern.matches(PHONE_REGEX,phone);
    }

    public static boolean checkDayOfBirth(String age) {
        return Pattern.matches(AGE_REGEX,age);
    }

    public static boolean checkName(String name){
        return Pattern.matches(NAME_REGEX,name);
    }

}
