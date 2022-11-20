package garage;

public class Motorcycle extends RoadLegalVehicle
{
    boolean hasSideCar;



    public Motorcycle(String color, String engineType, String type, boolean hasSideCar)
    {
        super(color, engineType, type);
        this.hasSideCar = hasSideCar;
    }



    public Motorcycle()
    {
    }

    @Override
    public String toString()
    {
        return "Motorcycle {" +
                "hasSideCar=" + hasSideCar +
                ", regNo='" + regNo + '\'' +
                ", color='" + color + '\'' +
                ", yearOfManufacturing=" + yearOfManufacturing +
                ", engineType='" + engineType + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
