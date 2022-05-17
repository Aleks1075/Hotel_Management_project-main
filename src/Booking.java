import java.util.ArrayList;

public class Booking
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

    public ArrayList<Booking> BookingList;

    public Booking(int roomID, String guestName, int duration, int phoneNumber, int age, boolean gender, String nationality, int roomNumber)
    {
        this.guestName = guestName;
        this.nationality = nationality;
        this.gender = gender;
        this.roomID = roomNumber;
        this.guestNumber = guestNumber;
        this.duration = duration;
        this.checkStatus = checkStatus;
        this.age = age;
        this.roomNumber = roomNumber;
    }

        /*
        roomNumber = Room.getRoomID;
        guestID = Guest.getGuestID;
        duration = Guest.getGuestDuration;
        checkStatus = Room.getAvailable;
        */


    public void bookRoom(Booking booking)
    {
        BookingList.add(booking);
        BookingList.remove(booking);
    }

    public void setDuration(int duration)
    {
    }

    public void check(boolean check)
    {
    }

    public void cancelBooking(Booking booking)
    {
        BookingList.remove(booking);
    }

    public String getFormattedBooking(){
        return guestName+","+duration+","+phoneNumber+","+age+","+nationality+","+roomNumber;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "fullName='" + guestName + '\'' +
                ", nationality='" + nationality + '\'' +
                ", roomID=" + roomID +
                ", guestID=" + guestNumber +
                ", duration=" + duration +
                '}';
    }
}

