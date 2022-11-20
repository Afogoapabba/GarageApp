package garage;

import java.time.LocalDate;
import java.util.List;
import java.util.Random;

public abstract class Vehicle
{
    String regNo;
    String color;
    int yearOfManufacturing;
    String engineType;
    String type;

    public Vehicle( String color, String engineType, String type)
    {
        Random rnd = new Random();
        this.regNo = "ABC"+(rnd.nextInt(899) +100); //Does not ensure uniqueness but for mock regno.
        this.color = color;
        this.yearOfManufacturing = LocalDate.now().getYear();
        this.engineType = engineType;
        this.type = type;


    }

    public Vehicle()
    {
        Random rnd = new Random();

        this.regNo = "ABC"+(rnd.nextInt(899) +100); //Does not ensure uniqueness but for mock regno.
        this.yearOfManufacturing = LocalDate.now().getYear();


    }

    public String getRegNo()
    {
        return regNo;
    }

    public String getColor()
    {
        return color;
    }

    public int getYearOfManufacturing()
    {
        return yearOfManufacturing;
    }

    public String getEngineType()
    {
        return engineType;
    }

    public String getType()
    {
        return type;
    }


    public abstract void park(Vehicle[] parkingLot ,int parkingSpot , boolean silent);


    public List<String> listVehicleByType(String type, Vehicle[] vehicles)
    {
        return null;
    }


    public void startEngine()
    {
        System.out.println("Engine starts..");
    }
    public void stopEngine()
    {
        System.out.println("Engine stops..");
    }

    @Override
    public String toString()
    {
        return "Vehicle {" +
                "regNo='" + regNo + '\'' +
                ", color='" + color + '\'' +
                ", yearOfManufacturing=" + yearOfManufacturing +
                ", engineType='" + engineType + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
