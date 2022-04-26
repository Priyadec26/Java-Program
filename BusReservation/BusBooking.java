package BusReservation;

import java.util.ArrayList;
import java.util.Scanner;

public class BusBooking {

    public static void main(String[] args) {

        ArrayList<BusDetails> buses = new ArrayList<BusDetails>();
        ArrayList<CustomerBooking> booking = new ArrayList<CustomerBooking>();

        buses.add(new BusDetails(1, true, 1));
        buses.add(new BusDetails(2, false, 46));
        buses.add(new BusDetails(3, true, 47));

        int useroption = 1;
        Scanner scanner = new Scanner(System.in);

        for (BusDetails b : buses) {
            b.displaybusinfo();
        }

        while (useroption == 1) {
            System.out.println("Enter 1 or 2 For Booking");
            useroption = scanner.nextInt();

            if (useroption == 1) {
                CustomerBooking cbooking = new CustomerBooking();
                if (cbooking.isAvailable(booking, buses)) {
                    booking.add(cbooking);
                    System.out.println("Your booking is confirmed");
                } else {
                    System.out.println("Sorry. Bus is full. Try another bus or date.");

                }
            }
        }
    }
}
