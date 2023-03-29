import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.*;
public class Booking {
    Scanner sc = new Scanner(System.in);
    String name;
    int age;
    int busno;
    static Date date;
    String dateS;

    Booking() {
        System.out.println("Enter your name: ");
        name = sc.nextLine();
        System.out.println("Enter your age: ");
        age = sc.nextInt();
        System.out.println("Enter the bus no: ");
        busno = sc.nextInt();
        System.out.println("Enter the date in dd-mm-yyyy:");
        {
            sc.nextLine();
            dateS = sc.nextLine();
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd MM yyyy");
            try {
                date = dateFormat.parse(dateS);
            } catch (ParseException e) {
                throw new RuntimeException(e);
            }
        }
    }

     public boolean isAvailable(ArrayList<Booking> bookings, ArrayList<Bus> buses) {
            int capacity = 0;
            for (Bus bus : buses) {
                if (bus.getBusno() == busno) {
                    capacity = bus.getCapacity();
                }
            }
                int booked = 0;
                for (Booking b : bookings) {
                    if (b.busno == busno && b.date.equals(date)) {
                        booked++;
                    }
                }


                return booked < capacity ? true : false;
            }

        }
