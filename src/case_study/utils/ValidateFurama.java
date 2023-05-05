package case_study.utils;

import java.time.LocalDate;
import java.time.Period;
import java.util.regex.Pattern;

public class ValidateFurama {
    static final String ID_EMPLOYEE_REGEX = "^(NV)-[0-9]{4}$";
    static final String ID_CUSTOTMER_REGEX = "^(KH)-[0-9]{4}$";
    static final String NAME_REGEX = "^([\\p{Lu}][\\p{Ll}]{1,8})(\\s([\\p{Lu}]|[\\p{Lu}][\\p{Ll}]{1,10})){0,5}$";
    static final String DOB_REGEX = "^\\d{4}-(0[1-9]|1[0-2])-(0[1-9]|1[0-9]|2[0-9]|3[0-1])$";
    static final String IDENTITY_REGEX = "^([0-9]{9}|[0-9]{12})$";
    static final String PHONE_REGEX = "^(0){1}[0-9]{9}$";
    static final String ID_VILLA_REGEX = "^(SVVL)-[0-9]{4}$";
    static final String ID_HOUSE_REGEX = "^(SVHO)-[0-9]{4}$";
    static final String ID_ROOM_REGEX = "^(SVRO)-[0-9]{4}$";
    static final String NAME_SERVICE = "^[A-Z]{1}[a-z]+$";
    static final String ID_BOOKING_REGEX = "^(BK-)\\d{4}$";
    static final String ID_CONTRACT_REGEX = "^(CT-)\\d{4}$";

    public static boolean checkIdEmployee(String idEmployee) {
        return Pattern.matches(ID_EMPLOYEE_REGEX, idEmployee);
    }

    public static boolean checkIdCustomer(String idCustomer) {
        return Pattern.matches(ID_CUSTOTMER_REGEX, idCustomer);
    }

    public static boolean checkIdentity(String identity) {
        return Pattern.matches(IDENTITY_REGEX, identity);
    }

    public static boolean checkPhone(String phone) {
        return Pattern.matches(PHONE_REGEX, phone);
    }

    public static boolean checkDayOfBirth(String dayOfBirth) {
        return Pattern.matches(DOB_REGEX, dayOfBirth);
    }

    public static int checkAge(LocalDate day) {
        LocalDate localDate = LocalDate.now();
        if (day != null) {
            return Period.between(day, localDate).getYears();
        }
        return -1;
    }

    public static boolean checkName(String name) {
        return Pattern.matches(NAME_REGEX, name);
    }

    public static boolean checkIdVilla(String idVilla) {
        return Pattern.matches(ID_VILLA_REGEX, idVilla);
    }

    public static boolean checkIdHouse(String idHouse) {
        return Pattern.matches(ID_HOUSE_REGEX, idHouse);
    }

    public static boolean checkIdRoom(String idRoom) {
        return Pattern.matches(ID_ROOM_REGEX, idRoom);
    }

    public static boolean checkNameService(String name) {
        return Pattern.matches(NAME_SERVICE, name);
    }

    public static boolean validateBookingId(String bookingId) {
        return Pattern.matches(ID_BOOKING_REGEX, bookingId);
    }

    public static boolean validateContractId(String contractId) {
        return Pattern.matches(ID_CONTRACT_REGEX, contractId);
    }
}
