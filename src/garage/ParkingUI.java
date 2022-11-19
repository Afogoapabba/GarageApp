package garage;

import java.time.LocalDate;
import java.util.Scanner;

public class ParkingUI
{

    public static String pickColor()
    {
        Scanner scanner = new Scanner(System.in);

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
    public static int intInput(String prompt) // Allows only positive integers
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println(prompt);
        int input = scanner.nextInt();
        int attempt =0;
        while(attempt < 3)
        {
            if (input >= 0)
            {
                return input;
            }
            else
            {
                attempt++;
                scanner.nextLine(); //clear scanner
                System.out.println("invalid input. Attempt: "+attempt+" of 3");
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
        String input = scanner.nextLine().toUpperCase();
        int attempt = 0;
        while (attempt <3)
        {
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
                attempt++;
                scanner.nextLine(); //clear scanner
                System.out.println("invalid input. 'Y' or 'N'  only valid inputs. Attempt: "+attempt+" of 3");

            }
        }
        scanner.nextLine(); //clear scanner
        System.out.println("no valid input found, returning false");
        return false;


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
        scanner.nextLine(); //clear scanner
        System.out.println("no valid input found, returning -1");

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
    public static void parkingMenu()
    {
        System.out.println("What would you like to do?"
                + "\n1: Create a vehicle."
                + "\n2: Park a vehicle."
                + "\n3: Un-park a vehicle."
                + "\n0: Exit");
    }

}
