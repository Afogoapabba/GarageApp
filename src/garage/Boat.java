package garage;

public class Boat extends Vehicle implements CanFloat
{
    boolean hasSail;
    int sleepingSpots;

    public Boat(String color, String engineType, String type, boolean hasSail, int sleepingSpots)
    {
        super(color, engineType, type);
        this.hasSail = hasSail;
        this.sleepingSpots = sleepingSpots;
    }

    public Boat()
    {

    }

    @Override
    public void park(Vehicle[] parkingLot ,int parkingSpot ,boolean silent)

    {
        floating();
        System.out.println();
        System.out.println("Vehicle not allowed for parking. Not added to parking-queue");
        System.out.println();
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
