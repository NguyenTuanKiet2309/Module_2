package case_study.service;

import case_study.model.Booking;
import case_study.repository.BookingRepository;
import case_study.repository.FacilityRepository;

import java.util.Scanner;

public class BookingService implements IBookingService {
    Scanner sc = new Scanner(System.in);
    private BookingRepository bookingRepository = new BookingRepository();
    private FacilityRepository facilityRepository = new FacilityRepository();

    @Override
    public void showBookingList() {
        bookingRepository.displayBooking();
    }

    @Override
    public void addBooking() {
        System.out.println("Nhập vào mã booking");
        String idBooking = sc.nextLine();
        System.out.println("Nhập vào ngày booking");
        String dateBooking = sc.nextLine();
        System.out.println("Nhập vào ngày bắt đầu");
        String dateOfStart = sc.nextLine();
        System.out.println("Nhập vào ngày kết thúc");
        String dateOfEnd = sc.nextLine();
        System.out.print("Nhập vào id khách hàng ");
        String idCustomer;
        do {
            idCustomer = sc.nextLine();
            if (!bookingRepository.checkIdCustomer(idCustomer)) {
                System.out.println("Không tồn tại ID này");
            }
        } while (!bookingRepository.checkIdCustomer(idCustomer));
//        facilityRepository.getFacilityList();
        System.out.print("Nhập vào id dịch vụ");
        String idService = sc.nextLine();
        Booking booking = new Booking(idBooking, dateBooking, dateOfStart, dateOfEnd, idCustomer, idService);
        bookingRepository.addBooking(booking);
    }
}
