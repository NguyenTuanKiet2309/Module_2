package case_study.repository;

import case_study.model.Booking;

public interface IBookingRepository {
    void addBooking(Booking booking);

    void displayBooking();

    boolean checkIdCustomer(String id);
}
