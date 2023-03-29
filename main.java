import java.awt.print.Book;
import java.util.ArrayList;
import java.util.Arrays;
import java .util.Scanner;

public class Govi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Bus> buses = new ArrayList<Bus>();
        buses.add(new Bus(1, 3));
        buses.add(new Bus(2, 5));
        for (Bus b : buses) {
            b.getBusInfo();
        }
        ArrayList<Booking> bookings = new ArrayList<Booking>();
        int t = 1;
        while (t == 1) {
            System.out.println("enter 1 to booking 0 is exit");
            t = sc.nextInt();
            if (t == 1) {
                Booking booking = new Booking();
                if (booking.isAvailable(bookings,buses)) {
                    bookings.add(booking);
                    System.out.println("Your ticket is booked :)");
                }
            }
            else if (t == 10) {
                    System.out.println("this is work");
                System.out.println("enter the busno: ");
                int a = sc.nextInt();
                    for (Booking book: bookings) {
                        if (book.busno == a) {
                            System.out.println("name: " + book.name + "    " + "age: " + book.age + "  " + "date: " + book.dateS);
                        }
                    }
                } else {
                    System.out.println("your seat alred full  :(");
                }
            }
            System.out.println(" thanks for booking");
        }
    }