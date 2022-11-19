package garage;

public class Garage
{

    public Garage(int parkingSize)
    {
        this.parkingLot = new Vehicle[parkingSize];
    }

    Vehicle[] parkingLot;


    public void checkAvailableSpots()
    {
        int availableSpots = 0;
        for (Vehicle vehicle: parkingLot )
        {
            if (vehicle==null)
            {
                availableSpots++;
            }
        }
        System.out.println("¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤");
        System.out.println("Available spots: "+ availableSpots);
        System.out.println("¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤");
    }
    public Vehicle getVehicleByRegNo(String regNo)
    {
        for (Vehicle vehicle: parkingLot)
        {
            if (vehicle.regNo.equals(regNo))
            {
                return  vehicle;
            }
        }
        System.out.println("Could not find vehicle.");
        return null;
    }
    public void unParkVehicle(Vehicle vehicle)
    {
        for (int i = 0; i < this.parkingLot.length; i++)
        {


        }

        System.out.println("Here is the "+vehicle.getColor()+" "+vehicle.getType()+" with RegNo:"+vehicle.getRegNo());
    }

}
