package case_study.repository;

import case_study.model.Booking;
import case_study.model.Customer;
import case_study.utils.ReadAndWriteToFileCustomer;

import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;

public class BookingRepository implements IBookingRepository {
    private static TreeSet<Booking> setBooking = new TreeSet<>(Comparator.comparing(Booking::getDayStart).thenComparing(Booking::getDayEnd));
    private List<Customer> customerList = ReadAndWriteToFileCustomer.readFile("src/case_study/data/customer.csv");


    static {
        setBooking.add(new Booking("1", "04-05-2023", "04-05-2023", "05-05-2023", "KH-1111", "SVVL-1111"));
        setBooking.add(new Booking("2", "04-05-2023", "04-05-2023", "05-05-2023", "KH-2222", "SVVL-2222"));
        setBooking.add(new Booking("3", "04-05-2023", "04-05-2023", "05-05-2023", "KH-3333", "SVVL-3333"));
    }

    @Override
    public void addBooking(Booking booking) {
        setBooking.add(booking);
    }

    @Override
    public void displayBooking() {
        for (Booking b : setBooking) {
            System.out.println(b);
        }
    }

    @Override
    public boolean checkIdCustomer(String id) {
        for (Customer c : customerList) {
            if (c.getIdCustomer().equals(id)) {
                return true;
            }
        }
        return false;
    }
}
