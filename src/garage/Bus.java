package garage;

public class Bus extends RoadLegalVehicle
{
    int onBoardToilets;
    boolean hasLuggageSpace;

    public Bus(String regNo, String color, int yearOfManufacturing, String engineType, String type, int onBoardToilets, boolean hasLuggageSpace)
    {
        super(regNo, color, yearOfManufacturing, engineType, type);
        this.onBoardToilets = onBoardToilets;
        this.hasLuggageSpace = hasLuggageSpace;
    }

    public Bus()
    {
    }
}
