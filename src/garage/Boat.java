package garage;

public class Boat extends Vehicle
{
    boolean hasSail;
    int sleepingSpots;

    public Boat(String regNo, String color, int yearOfManufacturing, String engineType, String type, boolean hasSail, int sleepingSpots)
    {
        super(regNo, color, yearOfManufacturing, engineType, type);
        this.hasSail = hasSail;
        this.sleepingSpots = sleepingSpots;
    }

    @Override
    public void parkVehicle(Vehicle[] parkingLot)
    {

    }

    @Override
    public void unParkVehicle(Vehicle[] parkingLot)
    {

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
}
