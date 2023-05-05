package case_study.repository;

import case_study.model.Booking;
import case_study.model.Contract;
import case_study.utils.ReadAndWriteToFIleContract;

import java.util.*;

public class ContactRepository implements IContactRepository{
    private static final String PATH_CONTRACT_FILE = "src/case_study/data/contracts.csv";
    private List<Contract> contractList = ReadAndWriteToFIleContract.read(PATH_CONTRACT_FILE);
    private TreeSet<Booking> bookings = new TreeSet<>(Comparator.comparing(Booking::getDateBooking));
    private Queue<Booking> bookingQueue = new LinkedList<>();
    private BookingRepository bookingRepository = new BookingRepository();

    @Override
    public void createNewContract(Contract contract) {
            contractList.add(contract);
            ReadAndWriteToFIleContract.write(contractList,PATH_CONTRACT_FILE);
    }

    @Override
    public List<Contract> displayContract() {
        return contractList;
    }

    @Override
    public void editContract() {
        ReadAndWriteToFIleContract.write(contractList,PATH_CONTRACT_FILE);
    }

    @Override
    public int checkIdContract(String id) {
        int size = contractList.size();
        for (int i = 0; i < size; i++) {
            if (contractList.get(i).getContractNumber().equals(id)){
                return i;
            }
        }
        return -1;
    }

    public Queue<Booking> idBooking() {
        bookings = bookingRepository.getListBooking();
        bookingQueue.addAll(bookings);
        return bookingQueue;
    }
}
