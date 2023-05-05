package case_study.service;

import case_study.model.Booking;
import case_study.model.Contract;
import case_study.repository.ContactRepository;
import case_study.utils.ValidateFurama;

import java.util.*;

public class ContactService implements IContactService {
    Scanner sc = new Scanner(System.in);
    private ContactRepository contactRepository = new ContactRepository();
    private Queue<Booking> bookingQueue = contactRepository.idBooking();

    @Override
    public void createNewContract() {
        if (!bookingQueue.isEmpty()) {
            String idContract;
            do {
                System.out.println("Enter code Contract: ");
                idContract = sc.nextLine();
                if (ValidateFurama.validateContractId(idContract)) {
                    System.out.println("Create Successful!");
                } else {
                    System.out.println("Input wrong format (CT-YYYY)");
                }
            } while (!ValidateFurama.validateContractId(idContract));

            for (Booking b : bookingQueue) {
                System.out.println(b);
            }
            String idBooking = bookingQueue.poll().getCodeBooking();
            System.out.println("Enter advance deposit: ");
            String advandeDeposit = sc.nextLine();
            System.out.println("Enter total payment: ");
            String totalPayment = sc.nextLine();
            Contract contract = new Contract(idContract, idBooking, advandeDeposit, totalPayment);
            contactRepository.createNewContract(contract);
            System.out.println("Create Successful!");
        } else {
            System.out.println("Now, it's not Booking!!!");
        }
    }

    @Override
    public void showContractList() {
        List<Contract> contractList = contactRepository.displayContract();
        for (Contract c : contractList) {
            System.out.println(c);
        }
    }

    @Override
    public void editContract() {
        System.out.print("Enter contract number to edit: ");
        String contractNumber = sc.nextLine();
        int check = contactRepository.checkIdContract(contractNumber);
        int input = -1;
        if (check == -1) {
            System.out.println("Contract Number not found!");
        } else {
            System.out.println("Enter to edit: \n" +
                    "1. Deposit\n" +
                    "2. AmountOfContract");
            do {
                input = Integer.parseInt(sc.nextLine());
                if (input > 3) {
                    System.out.println("Only 1 or 2");
                }
            } while (input > 3);
        }
        switch (input) {
            case 1:
                System.out.println("Enter advance deposit: ");
                String deposit = sc.nextLine();
                contactRepository.displayContract().get(check).setAdvanceDeposit(deposit);
                break;
            case 2:
                System.out.println("Enter total payment: ");
                String amount = sc.nextLine();
                contactRepository.displayContract().get(check).setTotalPayment(amount);
                break;
            default:
                break;
        }
    }
}

