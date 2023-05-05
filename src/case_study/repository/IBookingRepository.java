package case_study.repository;

import case_study.model.Booking;

import java.util.TreeSet;

public interface IBookingRepository {
    void addBooking(Booking booking);

    TreeSet<Booking> getListBooking();
}
