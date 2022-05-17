package RoomImpl;

public abstract class Room
{
    protected int ID;
    protected String roomType;
    protected String floor;
    protected int floorNumber;
    protected int price;

    public Room(int ID, String roomType, String floor, int floorNumber, int price)
    {
        this.ID = ID;
        this.roomType = roomType;
        this.floor = floor;
        this.floorNumber = floorNumber;
        this.price = price;
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