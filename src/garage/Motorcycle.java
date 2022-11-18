package garage;

public class Motorcycle extends RoadLegalVehicle
{
    boolean hasSideCar;

    public Motorcycle(String regNo, String color, int yearOfManufacturing, String engineType, String type, boolean hasSideCar)
    {
        super(regNo, color, yearOfManufacturing, engineType, type);
        this.hasSideCar = hasSideCar;
    }
}
