package garage;

import java.util.Arrays;
import java.util.Scanner;

public class ParkingApp
{

    //¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        Garage myGarage = new Garage(20);
        Garage outSideQueue = new Garage(10);
        Bus testBus = new Bus("Grey","Diesel","Public transport",0,false);
        Car testCar = new Car("Orange","Electric","Sport",true,true);
        Motorcycle testMotorcycle = new Motorcycle("Red","4-stroke","Enduro",false);

        System.out.println("Creating park-able test-subjects..##################");
        outSideQueue.parkVehicle(testBus,true);
        outSideQueue.parkVehicle(testCar,true);
        outSideQueue.parkVehicle(testMotorcycle,true);
        System.out.println("#########################################");

        String menu = "What would you like to do?"
                + "\n1: Create a vehicle."
                + "\n2: Park a vehicle."
                + "\n3: Un-park a vehicle."
                + "\n4: Show vehicles in queue for parking"
                + "\n5: Show vehicles in the parking lot"
                + "\n0: Exit";

        int input;
        String genericError = "Something terrible has happen";


        while (true)
        {
            ParkingUI.parkingMenu(menu);
            if (scanner.hasNextInt())
            {
                input = scanner.nextInt();
            }
            else
            {
                input = -1;
            }
            switch (input)
            {
                case 1: // Create vehicle
                    try
                    {
                        var newVehicle= createVehicle(); //create a vehicle
                        if (newVehicle ==null)
                        {
                            break;
                        }
                        newVehicle.park(outSideQueue.parkingLot, outSideQueue.getAvailableSpot(),true);
                    }
                    catch (Exception e) {System.out.println(genericError);System.out.println(e.toString());}
                    break;
                case 2:// Park vehicle
                    try
                    {
                        outSideQueue.listVehicles();
                        String regNo = ParkingUI.stringInput("Enter Reg No");
                        Vehicle vehicleToPark = outSideQueue.getVehicleByRegNo(regNo);
                        if (vehicleToPark==null)
                        {
                            System.out.println("Invalid RegNo");
                            break;
                        }
                        myGarage.parkVehicle(vehicleToPark,false);
                        outSideQueue.unParkVehicle(vehicleToPark);
                    }
                    catch (Exception e) {System.out.println(genericError);System.out.println(e.toString());}
                    break;
                case 3:// Un-park vehicle
                    try
                    {
                        Vehicle vehicle = myGarage.getVehicleByRegNo(ParkingUI.stringInput("Enter the registration number of the vehicle"));
                        if (vehicle==null)
                        {
                            System.out.println("Invalid RegNo");
                            break;
                        }
                        myGarage.unParkVehicle(vehicle);
                    }
                    catch (Exception e) {System.out.println(genericError);System.out.println(e.toString());}
                    break;
                case 4:// List vehicles in parking queue
                    try
                    {
                        outSideQueue.listVehicles();
                    }
                    catch (Exception e) {System.out.println(genericError);System.out.println(e.toString());}
                    break;
                case 5:// List vehicles in parking queue
                    try
                    {
                        myGarage.listVehicles();
                    }
                    catch (Exception e) {System.out.println(genericError);System.out.println(e.toString());}

                    break;
                case 0:// Exit.
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    scanner.nextLine();
                    System.out.println("no valid input found.");
                    break;
            }
        }


    }
    //¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤

    public static Vehicle createVehicle()
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What type of vehicle would you like to create?"
                + "\n1: an Airplane"
                + "\n2: a Boat"
                + "\n3: a Bus"
                + "\n4: a Car"
                + "\n5: a Motorcycle"
                + "\n0: Exit");
        int input;


        while (true)
        {
            if (scanner.hasNextInt())
            {
                input = scanner.nextInt();
            }
            else
            {
                input = -1;
            }
            switch (input)
            {
                case 1: //Airplane
                    Airplane airplane = new Airplane();
                    airplane.drinkMenu = new String[]{"Wine","Beer","Vodka","Raki"};
                    ParkingUI.setGeneric(airplane);
                    System.out.println(airplane.getClass().getSimpleName()+" Created.");
                    return airplane;

                case 2:// Boat
                    Boat boat = new Boat();
                    boat.hasSail = ParkingUI.booleanInput("Does the boat have a sail? Y/N");
                    boat.sleepingSpots = ParkingUI.intInput("How many sleeping spots?");
                    ParkingUI.setGeneric(boat);
                    System.out.println(boat.getClass().getSimpleName()+" Created.");
                    return boat;
                case 3:// Bus
                    Bus bus = new Bus();
                    bus.hasLuggageSpace = ParkingUI.booleanInput("Does the bus have luggage space? Y/N");
                    bus.onBoardToilets = ParkingUI.intInput("How many onboard toilets?");
                    ParkingUI.setGeneric(bus);
                    System.out.println(bus.getClass().getSimpleName()+" Created.");
                    return bus;
                case 4:// Car
                    Car car = new Car();
                    car.hasAndroidAuto = ParkingUI.booleanInput("Does it have Android Auto? Y/N");
                    car.hasAppleCarPlay = ParkingUI.booleanInput("Does it have Apple CarPlay? Y/N");
                    ParkingUI.setGeneric(car);
                    System.out.println(car.getClass().getSimpleName()+" Created.");
                    return car;
                case 5:// MC
                    Motorcycle mc = new Motorcycle();
                    mc.hasSideCar = ParkingUI.booleanInput("Does it have a sidecar? Y/N");
                    ParkingUI.setGeneric(mc);
                    System.out.println(mc.getClass().getSimpleName()+" Created.");
                    return mc;
                case 0:// Exit
                    return null;

                default:
                    scanner.nextLine(); //clear scanner
                    System.out.println(input+" was not a valid choice.");
            }
        }


    }


}
