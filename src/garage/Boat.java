package garage;

public class Boat extends Vehicle implements CanFloat
{
    boolean hasSail;
    int sleepingSpots;

    public Boat(String regNo, String color, int yearOfManufacturing, String engineType, String type, boolean hasSail, int sleepingSpots)
    {
        super(regNo, color, yearOfManufacturing, engineType, type);
        this.hasSail = hasSail;
        this.sleepingSpots = sleepingSpots;
    }

    public Boat()
    {

    }

    @Override
    public void park(Vehicle[] parkingLot ,int parkingSpot)
    {
        floating();
    }


    @Override
    public String toString()
    {
        return "Boat{" +
                "hasSail=" + hasSail +
                ", sleepingSpots=" + sleepingSpots +
                ", regNo='" + regNo + '\'' +
                ", color='" + color + '\'' +
                ", yearOfManufacturing=" + yearOfManufacturing +
                ", engineType='" + engineType + '\'' +
                ", type='" + type + '\'' +
                '}';
    }

    @Override
    public void floating()
    {
        System.out.println("You sadly float around wishing you where a park-able car...");
    }
}
