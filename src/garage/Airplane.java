package garage;

import java.util.Arrays;

public class Airplane extends Vehicle implements CanFly
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
    public void park(Vehicle[] parkingLot ,int parkingSpot)
    {
        flying();
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
