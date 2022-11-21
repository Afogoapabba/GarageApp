package garage;

import java.util.List;

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
            if (vehicle!=null && vehicle.regNo.equals(regNo.toUpperCase()))
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
            if (this.parkingLot[i]!=null && this.parkingLot[i].equals(vehicle))
            {
                this.parkingLot[i] = null;
                return;
            }

        }


    }
    public boolean listVehicles ()
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
            return false;
        }

        return true;
    }

    public void listVehiclesByType (String type)
    {
        int searchCount = 0;
        if (this.parkingLot == null)
        {
            System.out.println("### No vehicles in the parking lot###");
        }
        for (Vehicle vehicle:this.parkingLot)
        {
            if (vehicle !=null && vehicle.type.toUpperCase().equals(type))
            {
                searchCount++;
                System.out.println(vehicle);

            }
        }
        System.out.println("End of list, found "+searchCount+" result(s)");
        System.out.println();
    }


}
