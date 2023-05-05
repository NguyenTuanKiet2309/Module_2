package case_study.service;

import case_study.model.Booking;
import case_study.model.Customer;
import case_study.repository.BookingRepository;
import case_study.repository.CustomerRepository;
import case_study.repository.FacilityRepository;
import case_study.utils.ValidateFurama;

import java.util.List;
import java.util.Scanner;
import java.util.TreeSet;

public class BookingService implements IBookingService {
    Scanner sc = new Scanner(System.in);
    private BookingRepository bookingRepository = new BookingRepository();
    private FacilityRepository facilityRepository = new FacilityRepository();
    private CustomerRepository customerRepository = new CustomerRepository();

    @Override
    public void showBookingList() {
        TreeSet<Booking> bookings = bookingRepository.getListBooking();
        for (Booking b : bookings) {
            System.out.println(b);
        }
    }

    @Override
    public void addBooking() {
        String idBooking;
        do {
            System.out.println("Nhập mã booking: ");
            idBooking = sc.nextLine();
            if (ValidateFurama.validateBookingId(idBooking)) {
                System.out.println("Thêm thành công");
            } else {
                System.out.println("Nhập sai định dạng BK-YYYY");
            }
        } while (!ValidateFurama.validateBookingId(idBooking));

        String dayBooking;
        do {
            System.out.println("Nhập ngày booking: ");
            dayBooking = sc.nextLine();
            if (ValidateFurama.checkDayOfBirth(dayBooking)) {
                System.out.println("Thêm thành công");
            } else {
                System.err.println("Nhập sai định dạng YYYY-MM-DD\n" +
                        "Vui lòng nhập lại!!!");
            }
        } while (!ValidateFurama.checkDayOfBirth(dayBooking));

        String dayStart;
        do {
            System.out.println("Nhập ngày bắt đầu: ");
            dayStart = sc.nextLine();
            if (ValidateFurama.checkDayOfBirth(dayStart)) {
                System.out.println("Thêm thành công");
            } else {
                System.err.println("Nhập sai định dạng YYYY-MM-DD\n" +
                        "Vui lòng nhập lại!!!");
            }
        } while (!ValidateFurama.checkDayOfBirth(dayStart));

        String dayEnd;
        do {
            System.out.println("Nhập ngày kết thúc: ");
            dayEnd = sc.nextLine();
            if (ValidateFurama.checkDayOfBirth(dayEnd)) {
                System.out.println("Thêm thành công");
            } else {
                System.err.println("Nhập sai định dạng YYYY-MM-DD\n" +
                        "Vui lòng nhập lại!!!");
            }
        } while (!ValidateFurama.checkDayOfBirth(dayEnd));

        boolean check = true;
        String idCustomer;
        do {
            List<Customer> customerList = customerRepository.getCustomerList();
            for (Customer c : customerList) {
                System.out.println(c);
            }
            System.out.println("Nhập mã khách hàng: ");
            idCustomer = sc.nextLine();
            int index = customerRepository.findIdCustomer(idCustomer);
            if (index >= 0) {
                System.out.println("Thêm thành công!!");
                check = false;
            } else {
                System.out.println("Mã không tồn tại\n" +
                        "Vui lòng nhập lại!!!");
            }
        } while (check);

        System.out.println("Nhập mã dịch vụ: ");
        String idService = sc.nextLine();

        Booking booking = new Booking(idBooking, dayBooking, dayStart, dayEnd, idCustomer, idService);
        bookingRepository.addBooking(booking);
        facilityRepository.updateBooking(idService);
    }
}
