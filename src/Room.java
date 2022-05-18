import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Room
{
    protected int ID;
    protected String roomType;
    protected String floor;
    protected int floorNumber;
    protected int price;
    private boolean status;
    private boolean isOccupied;

    /*public Room(int ID, String roomType, String floor, int floorNumber, int price, boolean status)
    {
        this.ID = ID;
        this.roomType = roomType;
        this.floor = floor;
        this.floorNumber = floorNumber;
        this.price = price;
        this.status = status;
        isOccupied = false;
    }*/

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public boolean isOccupied()
    {
        return isOccupied;
    }

    public void printRoomData()
    {
        try
        {
            File file = new File("src/rooms.csv");
            Scanner input = new Scanner(file);
            while (input.hasNext())
            {
                System.out.println(input.nextLine());
            }
        }
        catch (FileNotFoundException e)
        {
            System.out.println("File not found");
        }
    }


    @Override
    public String toString()
    {
        return "Room{" +
                "ID=" + ID +
                ", roomType='" + roomType + '\'' +
                ", floor='" + floor + '\'' +
                ", floorNumber=" + floorNumber +
                ", price=" + price +
                '}';
    }
}