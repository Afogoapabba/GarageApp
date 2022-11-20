package garage;

import java.util.Scanner;

public class ParkingApp
{

    //¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤
    public static void main(String[] args)
    {
        Garage myGarage = new Garage(20);
        Garage outSideQueue = new Garage(10);
        Car testCar = new Car("abc123","Red",2022,"Electric","Sport",true,true);
        testCar.park(outSideQueue.parkingLot, 0);

        Scanner scanner = new Scanner(System.in);


        boolean run = true;

        int input;


        while (true)
        {
            ParkingUI.parkingMenu();
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
                    var newVehicle= createVehicle(); //create a vehicle
                    if (newVehicle ==null)
                    {
                        break;
                    }
                    System.out.println(outSideQueue.getAvailableSpot());
                    newVehicle.park(outSideQueue.parkingLot, outSideQueue.getAvailableSpot());

                    break;
                case 2:// Park vehicle

                    outSideQueue.listVehicles();
                    String regNo = ParkingUI.stringInput("Enter Reg No");
                    Vehicle vehicleToPark = outSideQueue.getVehicleByRegNo(regNo);

                    myGarage.parkVehicle(vehicleToPark);

                    break;
                case 3:// Un-park vehicle

                    myGarage.unParkVehicle(myGarage.getVehicleByRegNo(ParkingUI.stringInput("Enter the registration number of the vehicle")));

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



        int attempt = 0;

        while (attempt < 3)
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
                    break;
                case 2:// Boat
                    Boat boat = new Boat();
                    boat.hasSail = ParkingUI.booleanInput("Does the boat have a sail? Y/N");
                    boat.sleepingSpots = ParkingUI.intInput("How many sleeping spots?");
                    ParkingUI.setGeneric(boat);
                    break;
                case 3:// Bus
                    Bus bus = new Bus();
                    bus.hasLuggageSpace = ParkingUI.booleanInput("Does the bus have luggage space? Y/N");
                    bus.onBoardToilets = ParkingUI.intInput("How many onboard toilets?");
                    ParkingUI.setGeneric(bus);
                    break;
                case 4:// Car
                    Car car = new Car();
                    car.hasAndroidAuto = ParkingUI.booleanInput("Does it have Android Auto? Y/N");
                    car.hasAppleCarPlay = ParkingUI.booleanInput("Does it have Apple CarPlay? Y/N");
                    ParkingUI.setGeneric(car);
                    break;
                case 5:// MC
                    Motorcycle mc = new Motorcycle();
                    mc.hasSideCar = ParkingUI.booleanInput("Does it have a sidecar?");
                    ParkingUI.setGeneric(mc);
                    break;
                case 0:// Exit
                    return null;

                default:
                    scanner.nextLine(); //clear scanner
                    System.out.println(input+" was not a valid choice. Attempt: "+attempt+" of 3.");
            }
        }




        return null;
    }






}
