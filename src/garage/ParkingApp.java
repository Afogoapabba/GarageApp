package garage;

import java.time.LocalDate;
import java.util.Scanner;

public class ParkingApp
{

    //¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤
    public static void main(String[] args)
    {
        Garage myGarage = new Garage(5);
        Vehicle[] parkingLot = myGarage.parkingLot;
        Scanner scanner = new Scanner(System.in);

        Car car1 = new Car("123abc","Green",1999,"boxer" ,"Porsche");
        Car car2 = new Car();
        System.out.println(car2.yearOfManufacturing);
        System.out.println(car2.regNo);


        boolean run = true;
        while (run)
        {
            parkingMenu();
            int input = scanner.nextInt();
            switch (input)
            {
                case 1: // Create vehicle
                    createVehicle();
                    break;
                case 2:// Park vehicle
                    break;
                case 3:// Un-park vehicle
                    break;
                case 0:// Exit.
                    scanner.close();
                    System.exit(0);
                    break;
            }
        }


    }
    //¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤
    public static void parkingMenu()
    {
        System.out.println("What would you like to do?"
                + "\n1: Create a vehicle."
                + "\n2: Park a vehicle."
                + "\n3: Un-park a vehicle."
                + "\n0: Exit");
    }
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
        int input = scanner.nextInt();

        switch (input)
        {
            case 1: //Airplane
                Airplane airplane = new Airplane();
                airplane.drinkMenu = new String[]{"Wine","Beer","Vodka","Raki"};
                setGeneric(airplane);

                break;
            case 2:// Boat
                break;
            case 3:// Bus
                break;
            case 4:// Car

                break;
            case 5:// MC
                break;
            case 0:// Exit
                break;
            default:
                System.out.println(input+" was not a valid choice");
        }


        return null;
    }

    public static String pickColor()
    {
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine(); //clear scanner
        System.out.println("Choose a color"
                + "\n1: White"
                + "\n2: Black"
                + "\n3: Chrome"
                + "\n4: Red"
                + "\n5: Green");

        int input = scanner.nextInt();
        switch (input)
        {
            case 1:
                return "White";

            case 2:
                return "Black";

            case 3:
                return "Chrome";

            case 4:
                return "Red";

            case 5:
                return "Green";

            default:
                return "Base-Colored";
        }

    }
    public static String stringInput(String prompt)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println(prompt);
        String input = scanner.nextLine();
        if (input!=null)
        {
            return input;
        }

        System.out.println("no valid input found, returning null");
        scanner.nextLine(); //clear scanner
        return null;
    }
    public static int pickYear()
    {
        Scanner scanner = new Scanner(System.in);
        int currentYear= LocalDate.now().getYear();
        System.out.println("Acceptable year range = 1900-"+ currentYear);
        int input = scanner.nextInt();
        if (input>1899 && input<=currentYear)
        {
            return input;
        }

        System.out.println("no valid input found, returning -1");
        scanner.nextLine(); //clear scanner
        return -1;
    }
    public static void setGeneric(Vehicle vehicle)
    {
        vehicle.color = pickColor();
        vehicle.yearOfManufacturing = pickYear();
        vehicle.engineType= stringInput("What kind of engine?");
        vehicle.type = stringInput("What type of "+vehicle.getClass().getSimpleName()+"?");
        System.out.println(vehicle.toString());

    }

}
