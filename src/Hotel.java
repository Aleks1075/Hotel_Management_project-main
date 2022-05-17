import IOImpl.FileIO;
import RoomImpl.*;

import java.io.File;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

class Hotel
{
    int roomNumber;
    String guestName;
    int duration;
    boolean bookingStatus;
    int phoneNumber;
    int age;
    boolean gender;
    String nationality;
    int roomID;
    boolean checkStatus;

    static ArrayList<Booking> bookingList = new ArrayList<>();

    Hotel hotel;
    private FileIO fileIO = new FileIO();

    Room[] rooms = new Room[40];
    String[] data;

    public Hotel()
    {
        hotelSetup();
    }

    private void hotelSetup()
    {
        String[] roomData = fileIO.readRoomData();
        //System.out.println(roomData.length);
        createRooms(roomData);
        //printRooms();
        //hotel = new Hotel(roomData);
    }

    private void printRooms() {
        for (int i = 0; i < rooms.length; i++)
        {
            System.out.println(rooms[i]);
        }
    }


    public void createRooms(String[] data)
    {
        for(int i = 0; i < data.length; i++){
            String[] tmpData = data[i].split(",");
            int ID = Integer.parseInt(tmpData[0]);
            String roomType = tmpData[1];
            String floor = tmpData[2];
            int floorNumber = Integer.parseInt(tmpData[3]);
            int price = Integer.parseInt(tmpData[4]);
            Room room = null;
            //System.out.println(roomType);
            switch(roomType){
                case "StandardSingleRoom":
                    room = new StandardSingleRoom(ID, tmpData[1], floor, floorNumber, price);
                    break;
                case "StandardDoubleRoom":
                    room = new StandardDoubleRoom(ID, tmpData[1], floor, floorNumber, price);
                    break;
                case "LuxurySingleRoom":
                    room = new LuxurySingleRoom(ID, tmpData[1], floor, floorNumber, price);
                    break;
                case "LuxuryDoubleRoom":
                    room = new LuxuryDoubleRoom(ID, tmpData[1], floor, floorNumber, price);
                    break;
            }
            rooms[i] = room;
        }
    }
    static Scanner scanner = new Scanner(System.in);

    public void HotelManagement()
    {
        while(true) {
            System.out.println("Velkommen til booking system");
            System.out.println("-------------------------------");
            System.out.println("1. Book et værelse");
            System.out.println("2. Check in værelse");
            System.out.println("3. Check ud værelse");
            System.out.println("4. Afbestil reservation");
            System.out.println("5. Listeoversigt over alle rum");
            System.out.println("6. Listeoversigt over alle reservationer");
            System.out.println("7. Gem & Afslut");
            System.out.println("Indtast dit valg: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    guestName = scanner.nextLine();
                    System.out.println("Indtast venligst fuldenavn på gæsten");
                    guestName = scanner.nextLine();
                    System.out.println("Indtast venligst antal overnatninger");
                    duration = scanner.nextInt();
                    System.out.println("Indtast venligst kontaktnummer på gæsten");
                    phoneNumber = scanner.nextInt();
                    System.out.println("Indtast venligst alder på gæsten");
                    age = scanner.nextInt();
                /*System.out.println("Indtast venligst kønet til gæsten");
                gender = scanner.nextBoolean();*/
                    System.out.println("Indtast venligst nationalitet");
                    nationality = scanner.next();
                    System.out.println("Indtast venligst værelsesnummer til gæsten");
                    roomNumber = scanner.nextInt();
                    System.out.println("De indtaste informationer er: " + "\n" + "Fuld navn: " + guestName + "\n" + "Nationalitet: " + nationality + "\n" + "Værelsesnummer: " + roomNumber + "\n" +
                            "Kontaktnummer: " + phoneNumber + "\n" + "Antal overnatninger: " + duration + "\n");
                    Booking booking = new Booking(roomID, guestName, duration, phoneNumber, age, gender, nationality, roomNumber);
                    bookingList.add(booking);
                    System.out.println(booking);
                    break;
                case 2:
                    //CheckIn();
                    break;
                case 3:
                    //CheckOut();
                    break;
                case 4:
                    //CancelBooking();
                    break;
                case 5:
                    //ListAllRooms();
                    break;
                case 6:
                    //ListAllBookings();
                    break;
                case 7:
                    saveData();
                    System.out.println("Tak fordi du bruger booking system");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Ugyldigt valg");
                    break;
            }
        }
    }
    private static void saveData() {
        try {
            PrintWriter pw = new PrintWriter(new File("src/Bookings.csv"));
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
