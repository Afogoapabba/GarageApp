package garage;

public class Garage
{

    public Garage(int parkingSize)
    {
        this.parkingLot = new Vehicle[parkingSize];
    }

    Vehicle[] parkingLot;


    public int getAvailableSpot()
    {
        int availableSpot =-1;
        for (Vehicle vehicle: parkingLot )
            for (int i = 0; i < parkingLot.length; i++)
            {
                if (parkingLot[i] == null)
                {
                    availableSpot = i;
                    return availableSpot;
                }
            }
        return availableSpot;



    }
    public Vehicle getVehicleByRegNo(String regNo)
    {
        for (Vehicle vehicle: parkingLot)
        {
            if (vehicle ==null) {break;}
            if (vehicle.regNo.equals(regNo))
            {
                return  vehicle;
            }
        }
        System.out.println("Could not find vehicle.");
        return null;
    }
    public void parkVehicle(Vehicle vehicle,boolean silent)
    {
        int availableSpot= getAvailableSpot();
        vehicle.park(this.parkingLot,availableSpot,silent);


    }
    public void unParkVehicle(Vehicle vehicle)
    {
        for (int i = 0; i < this.parkingLot.length; i++)
        {
            if (this.parkingLot[i].equals(vehicle))
            {
                //System.out.println("Here is the "+vehicle.getColor()+" "+vehicle.getType()+" with RegNo:"+vehicle.getRegNo());
                this.parkingLot[i] = null;
                return;
            }

        }


    }
    public void listVehicles ()
    {
        System.out.println("Available vehicles:");

        int count = 0;
        for (int i = 0; i < this.parkingLot.length; i++)
        {
            if (this.parkingLot[i] != null)
            {
                System.out.println(this.parkingLot[i].toString());
                System.out.println("--------------------------------------------------------------------------------");
                count++;
            }

        }
        if (count <1)
        {
            System.out.println("### No vehicles was found ###");
        }


    }


}
