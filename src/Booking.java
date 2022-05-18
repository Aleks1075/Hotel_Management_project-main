import java.util.ArrayList;
import java.util.Scanner;

public class Booking {
    private String guestName;
    private String nationality;
    private boolean gender;
    private int roomID;
    private int guestNumber;
    private int duration;
    private boolean checkStatus;
    private int age;
    private int phoneNumber;
    int roomNumber;

    public Booking(int roomID, String guestName, int duration, int phoneNumber, int age, boolean gender, String nationality, int roomNumber) {
        this.guestName = guestName;
        this.nationality = nationality;
        this.gender = gender;
        this.roomID = roomNumber;
        this.guestNumber = guestNumber;
        this.duration = duration;
        this.checkStatus = checkStatus;
        this.age = age;
        this.roomNumber = roomNumber;
        this.phoneNumber = phoneNumber;
    }

    public void setDuration() {
    }

    public void check() {
    }

    public String getFormattedBooking ()
    {
        return guestName + "," + duration + "," + phoneNumber + "," + age + "," + nationality + "," + roomNumber;
    }

    @Override
    public String toString ()
    {
        return "De indtaste informationer er: " + "\n" +
                        "Fuld navn: " + guestName + "\n" +
                        "Nationalitet: " + nationality + "\n" +
                        "Værelsesnummer: " + roomID + "\n" +
                        "Kontaktnummer: " + phoneNumber + "\n" +
                        "Antal overnatninger: " + duration + "\n";
    }
}
