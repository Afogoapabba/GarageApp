package garage;

import java.util.Arrays;

public class Airplane extends Vehicle implements CanFly
{
    String[] drinkMenu;
    boolean wings;


    public Airplane(String color, String engineType, String type)
    {
        super(color, engineType, type);
        this.drinkMenu = new String[]{"Wine","Beer","Vodka","Raki"};
        this.wings = true;
    }

    public Airplane()
    {
        this.wings =true;
    }

    @Override
    public void park(Vehicle[] parkingLot ,int parkingSpot,boolean silent)

    {
        flying();
        System.out.println("Vehicle not allowed for parking. Not added to parking-queue");
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

    @Override
    public void flying()
    {
        System.out.println("You sadly fly around wishing you where a park-able car...");
    }
}
