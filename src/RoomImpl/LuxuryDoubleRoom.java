package RoomImpl;

public class LuxuryDoubleRoom extends StandardDoubleRoom
{
    boolean isLuxury;

    public LuxuryDoubleRoom(int ID, String roomType, String floor, int floorNumber, int price)
    {
        super(ID, roomType, floor, floorNumber, price);
    }
}