package garage;

public class RoadLegalVehicle extends Vehicle
{
    public RoadLegalVehicle(String regNo, String color, int yearOfManufacturing, String engineType, String type)
    {
        super(regNo, color, yearOfManufacturing, engineType, type);
    }

    public RoadLegalVehicle()
    {
        super();
    }

    @Override
    public void parkVehicle(Vehicle[] parkingLot)
    {
        int parkingSpot = findParkingSpot(parkingLot);
        if (parkingSpot<0)
        {
            System.out.println("no available parking spots...");
            return;
        }
        startEngine();
        accelerate();
        brake();
        stopEngine();
        parkingLot[parkingSpot] = this;

        System.out.println("The "+getColor()+" "+getType()+" has been parked at the spot labeled: "+parkingSpot);


    }

/*    @Override
    public void unParkVehicle(Vehicle[] ParkingLot)
    {
        for (int i = 0; i < ParkingLot.length; i++)
        {


        }
        startEngine();
        accelerate();
        brake();
        stopEngine();
        System.out.println("Here is the "+getColor()+" "+getType()+" with RegNo:"+getRegNo());
    }*/


    public void accelerate()
    {
        System.out.println("Vroooom.. you being to accelerate");
    }


    public void brake()
    {
        System.out.println("Squeal!!!.. you brake to a full stop");
    }

    @Override
    public String toString()
    {
        return "RoadLegalVehicle{" +
                "regNo='" + regNo + '\'' +
                ", color='" + color + '\'' +
                ", yearOfManufacturing=" + yearOfManufacturing +
                ", engineType='" + engineType + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
