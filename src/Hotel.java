import java.util.Scanner;

class Hotel
{
    FileIO fileIO = new FileIO();

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
            Scanner scanner = new Scanner(System.in);
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    fileIO.bookRoom();
                    break;
                case 2:
                    //CheckIn();
                    break;
                case 3:
                    //CheckOut();
                    break;
                case 4:
                    fileIO.cancelBooking();
                    break;
                case 5:
                    //fileIO.checkAvailableRoom();
                    //fileIO.displayRooms();
                    break;
                case 6:
                    //ListAllBookings();
                    break;
                case 7:
                    fileIO.saveData();
                    System.out.println("----------------------------------");
                    System.out.println("Tak fordi du bruger booking system");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Ugyldigt valg");
                    break;
            }
        }
    }
}
