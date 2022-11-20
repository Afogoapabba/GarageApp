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


    public void park(Vehicle[] parkingLot, int parkingSpot)
    {

        startEngine();
        accelerate();
        brake();
        stopEngine();
        parkingLot[parkingSpot] = this;

        System.out.println("The "+getColor()+" "+getType()+" "+this.getClass().getSimpleName()+ " has been parked.");


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
        return "RoadLegalVehicle{" +
                "regNo='" + regNo + '\'' +
                ", color='" + color + '\'' +
                ", yearOfManufacturing=" + yearOfManufacturing +
                ", engineType='" + engineType + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
