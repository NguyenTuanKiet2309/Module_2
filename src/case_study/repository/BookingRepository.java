package case_study.repository;

import case_study.model.Booking;
import case_study.utils.ReadAndWriteToFIleBooking;

import java.util.Comparator;
import java.util.TreeSet;

public class BookingRepository implements IBookingRepository {
    private static TreeSet<Booking> setBooking = new TreeSet<>(Comparator.comparing(Booking::getDayStart).thenComparing(Booking::getDayEnd));

    private static final String PATH_BOOKING_FILE = "src/case_study/data/booking.csv";

    static {
        setBooking.add(new Booking("BK-0001", "03", "04", "10", "KH-0001", "SVHO-0001"));
        setBooking.add(new Booking("BK-0002", "04", "04", "05", "KH-0002", "SVHO-0002"));
        setBooking.add(new Booking("BK-0003", "05", "06", "08", "KH-0003", "SVHO-0003"));
        setBooking.add(new Booking("BK-0004", "06", "08", "10", "KH-0004", "SVHO-0004"));
        setBooking.add(new Booking("BK-0005", "03", "05", "10", "KH-0005", "SVHO-0005"));
    }

    @Override
    public void addBooking(Booking booking) {
        setBooking.add(booking);
        ReadAndWriteToFIleBooking.writeToFile(setBooking,PATH_BOOKING_FILE);
    }

    @Override
    public TreeSet<Booking> getListBooking() {
        ReadAndWriteToFIleBooking.writeToFile(setBooking,PATH_BOOKING_FILE);
        return ReadAndWriteToFIleBooking.readToFile(PATH_BOOKING_FILE);
    }
}
