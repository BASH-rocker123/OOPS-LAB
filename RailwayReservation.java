import java.util.InputMismatchException;
import java.util.Scanner;

class SeatAlreadyBookedException extends Exception {
    SeatAlreadyBookedException(String msg) {
        super(msg);
    }
}

class Reservation {
    boolean[] seats = new boolean[5];

    void reserveSeat(int seatNo) throws SeatAlreadyBookedException {
        if (seatNo < 1 || seatNo > 5) {
            throw new IllegalArgumentException("Invalid seat number! Choose between 1 and 5.");
        }
        
        if (seats[seatNo - 1]) {
            throw new SeatAlreadyBookedException("Seat is already booked.");
        }
        seats[seatNo - 1] = true;
        System.out.println("Seat " + seatNo + " reserved successfully.");
    }
}

public class RailwayReservation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Reservation r = new Reservation();

        try {
            System.out.println("Enter seat number (1-5):");
            int seat = sc.nextInt();
            r.reserveSeat(seat);
        } catch (SeatAlreadyBookedException | IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } catch (InputMismatchException e) {
            System.out.println("Incorrect Input! Please enter a valid number.");
        } finally {
            System.out.println("Transaction Completed!");
            sc.close();
        }
    }
}

 

