package garage;

import java.lang.reflect.Array;
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

    public Vehicle(String regNo, String color, int yearOfManufacturing, String engineType, String type)
    {
        Random rnd = new Random();
        this.regNo = "ABC"+rnd.nextInt(899) +100; //Does not ensure uniqueness but for mock regno.
        this.color = color;
        this.yearOfManufacturing = LocalDate.now().getYear();
        this.engineType = engineType;
        this.type = type;

        ;
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

    public int findParkingSpot(Vehicle[] parkingLot)
    {
        for (int i = 0; i <parkingLot.length ; i++)
        {
            if (parkingLot[i] == null)
            {
                return i;
            }
        }
        return -1;
    };
    public abstract void parkVehicle(Vehicle[] parkingLot);
    public abstract void unParkVehicle(Vehicle[] parkingLot);

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


}
