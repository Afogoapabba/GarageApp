package garage;

import java.util.Arrays;

public class Airplane extends Vehicle
{
    String[] drinkMenu;
    boolean wings;

    public Airplane(String regNo, String color, int yearOfManufacturing, String engineType, String type)
    {
        super(regNo, color, yearOfManufacturing, engineType, type);
        this.drinkMenu = new String[]{"Wine","Beer","Vodka","Raki"};
        this.wings = true;
    }

    public Airplane()
    {
        this.wings =true;
    }

    @Override
    public void parkVehicle(Vehicle[] parkingLot)
    {
        System.out.println("Vehicle not allowed to park at the garage");

    }

    @Override
    public void unParkVehicle(Vehicle[] parkingLot)
    {
        System.out.println("Vehicle is not parked.");
    }

    @Override
    public String toString()
    {
        return "Airplane{" +
                "drinkMenu=" + Arrays.toString(drinkMenu) +
                ", wings=" + wings +
                ", regNo='" + regNo + '\'' +
                ", color='" + color + '\'' +
                ", yearOfManufacturing=" + yearOfManufacturing +
                ", engineType='" + engineType + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
