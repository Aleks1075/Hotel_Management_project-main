public class Room
{
    protected int ID;
    protected String roomType;
    protected String floor;
    protected int floorNumber;
    protected int price;
    private boolean status;
    private boolean isOccupied;

    public Room(int ID, String roomType, String floor, int floorNumber, int price, boolean status)
    {
        this.ID = ID;
        this.roomType = roomType;
        this.floor = floor;
        this.floorNumber = floorNumber;
        this.price = price;
        this.status = status;
        isOccupied = false;
    }

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