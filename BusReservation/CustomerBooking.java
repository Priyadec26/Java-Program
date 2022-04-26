package RedBusBooking;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class CustomerBooking {
    String passengerName;
    int busno;
    Date date;
    CustomerBooking()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter name of passenger");
        passengerName = scanner.next();
        System.out.println("Enter Bus number :");
        busno = scanner.nextInt();
        System.out.println("Enter Date dd/MM/yyyy :");
        String dateInput = scanner.next();
        SimpleDateFormat dateformat = new SimpleDateFormat("dd-MM-yyyy");
        try {
            date = dateformat.parse(dateInput);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }

    }

    public boolean isAvailable(ArrayList<CustomerBooking> booking, ArrayList<BusDetails> buses) {
        int capacity = 0;
        for(BusDetails bus:buses) {
            if(bus.getbusno() == busno)
                capacity = bus.getCapacity();
        }

        int booked = 0;
        for(CustomerBooking b:booking) {
            if(b.busno == busno && b.date.equals(date)) {
                booked++;
            }
        }

        return booked<capacity?true:false;

    }
}

