import java.awt.print.Book;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class FileIO implements IO
{
    private String guestName;
    private String nationality;
    private boolean gender;
    private int roomID;
    private int guestNumber;
    private int duration;
    private boolean checkStatus;
    private int age;
    private int phoneNumber;
    private int roomNumber;

    Room room = new Room();
    ArrayList<Room> rooms = new ArrayList<>();
    ArrayList<Booking> bookingList = new ArrayList<>();

    public void checkAvailableRoom()
    {
        for (int a = 0; a < rooms.size(); a++) {
            if(!rooms.get(a).isStatus()){
            System.out.println(rooms.get(a).toString());
            }
        }
    }


    public void checkGuestIn() {

    }

    public void checkGuestOut() {

    }


    public void changeBooking() {

    }

    public void bookRoom()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Indtast venligst fuldenavn på gæsten");
        guestName = scanner.nextLine();
        System.out.println("Indtast venligst antal overnatninger");
        duration = scanner.nextInt();
        System.out.println("Indtast venligst kontaktnummer på gæsten");
        phoneNumber = scanner.nextInt();
        System.out.println("Indtast venligst alder på gæsten");
        age = scanner.nextInt();
        System.out.println("Indtast venligst nationalitet");
        nationality = scanner.next();
        System.out.println("Indtast venligst værelsesnummer til gæsten");
        room.printRoomData();
        roomNumber = scanner.nextInt();
        Booking booking = new Booking(roomID, guestName, duration, phoneNumber, age, gender, nationality, roomNumber);
        bookingList.add(booking);
        System.out.println(booking);
    }

    public void cancelBooking() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Room Number: ");
        int roomNum = in.nextInt();
        for (int a = 0; a < bookingList.size(); a++) {
            if (bookingList.get(a).roomNumber == roomNum) {
                bookingList.remove(a);
            }
        }
    }

    @Override
    public void saveData()
    {
        try {
            PrintWriter pw = new PrintWriter(new FileWriter("src/Bookings.csv", true));
            for (Booking booking : bookingList) {
                pw.write(booking.getFormattedBooking());
                pw.write("\n");
            }
            pw.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}