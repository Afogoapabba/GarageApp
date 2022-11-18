package garage;

public class Car extends RoadLegalVehicle
{
    public Car(String regNo, String color, int yearOfManufacturing, String engineType, String type)
    {
        super(regNo, color, yearOfManufacturing, engineType, type);
    }

    public Car()
    {
        super();
    }
}
