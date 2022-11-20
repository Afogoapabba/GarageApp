package garage;

public class RoadLegalVehicle extends Vehicle
{
    public RoadLegalVehicle(String color, String engineType, String type)
    {
        super( color, engineType, type);
    }

    public RoadLegalVehicle()
    {
        super();
    }


    public void park(Vehicle[] parkingLot, int parkingSpot,boolean silent)
    {
        if (!silent)
        {
            startEngine();
            accelerate();
            brake();
            stopEngine();
            System.out.println("The "+getColor()+" "+getType()+" "+this.getClass().getSimpleName()+ " has been parked.");
        }
        System.out.println(this.getClass().getSimpleName()+" Created.");
        parkingLot[parkingSpot] = this;





    }




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
        return "RoadLegalVehicle {" +
                "regNo='" + regNo + '\'' +
                ", color='" + color + '\'' +
                ", yearOfManufacturing=" + yearOfManufacturing +
                ", engineType='" + engineType + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
