package BusReserve;

import java.util.Scanner; //nested package/ hierarchical package
import java.util.ArrayList;

public class BusDemo {
    public static void main(String[] args)throws Exception {

    	BusDAO busdao=new BusDAO();
        busdao.displayBusInfo();
      int userOpt = 1;
        Scanner input = new Scanner(System.in);

        

       while(userOpt==1) {
            System.out.println("Enter 1 to Book and 2 to exit");
           userOpt = input.nextInt();
            if(userOpt == 1) {
                Booking booking = new Booking();
               if(booking.isAvailable(bookings,buses)) {
                  bookings.add(booking);
                    System.out.println("Your booking is confirmed");
                } else {
                   System.out.println("Sorry. Bus is full. Try another bus or date.");
              }
           }
        }
    }
}
