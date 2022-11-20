package garage;

import java.time.LocalDate;
import java.util.Scanner;

public class ParkingUI
{

    public static String pickColor()
    {
        Scanner scanner = new Scanner(System.in);
        int input=-1;


        System.out.println("Choose a color"
                + "\n1: White"
                + "\n2: Black"
                + "\n3: Chrome"
                + "\n4: Red"
                + "\n5: Green");

        if (scanner.hasNextInt())
        {
            input = scanner.nextInt();
        }

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
                System.out.println("invalid input selecting base-coat");
                return "Base-coat";
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
    public static int intInput(String prompt) // Allows only positive integers
    {
        Scanner scanner = new Scanner(System.in);

        int input = -1;



        while(true)
        {
            System.out.println(prompt);
            if (scanner.hasNextInt())
            {
                input = scanner.nextInt();
            }
            if (input >= 0)
            {
                return input;
            }
            else
            {

                scanner.nextLine(); //clear scanner
                System.out.println("invalid input.");
                break;
            }

        }

        System.out.println("no valid input found, returning null");
        scanner.nextLine(); //clear scanner
        return -1;
    }
    public static boolean booleanInput(String prompt)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println(prompt);


        while (true)
        {
            String input = scanner.nextLine().toUpperCase();
            if (input.equals("Y"))
            {
                return true;
            }
            else if (input.equals("N"))
            {
                return false;
            }
            else
            {

                System.out.println("invalid input. 'Y' or 'N'  only valid inputs");
            }
        }


    }
    public static int pickYear()
    {
        Scanner scanner = new Scanner(System.in);
        int currentYear= LocalDate.now().getYear();
        int input =-1;
        System.out.println("Acceptable year range = 1900-"+ currentYear);
        if (scanner.hasNextInt())
        {
            input = scanner.nextInt();
        }


        if (input>1899 && input<=currentYear)
        {
            return input;
        }
        scanner.nextLine(); //clear scanner
        System.out.println("no valid input found, returning "+currentYear);

        return currentYear;
    }
    public static void setGeneric(Vehicle vehicle)
    {
        vehicle.color = pickColor();
        vehicle.yearOfManufacturing = pickYear();
        vehicle.engineType= stringInput("What kind of engine?");
        vehicle.type = stringInput("What type of "+vehicle.getClass().getSimpleName()+"?");
        System.out.println(vehicle.toString());

    }
    public static void parkingMenu(String menu)
    {
        System.out.println(menu);
    }

}
