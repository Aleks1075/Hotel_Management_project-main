package RoomImpl;

public class LuxurySingleRoom extends StandardSingleRoom
{
    boolean isLuxury;

    public LuxurySingleRoom(int ID, String roomType, String floor, int floorNumber, int price)
    {
        super(ID, roomType, floor, floorNumber, price);
    }
}