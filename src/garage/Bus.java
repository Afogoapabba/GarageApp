package garage;

public class Bus extends RoadLegalVehicle
{
    int onBoardToilets;
    boolean hasLuggageSpace;

    public Bus(String color, String engineType, String type, int onBoardToilets, boolean hasLuggageSpace)
    {
        super(color, engineType, type);
        this.onBoardToilets = onBoardToilets;
        this.hasLuggageSpace = hasLuggageSpace;
    }

    public Bus()
    {
    }

    @Override
    public String toString()
    {
        return "Bus {" +
                "hasLuggageSpace=" + hasLuggageSpace +
                ", regNo='" + regNo + '\'' +
                ", color='" + color + '\'' +
                ", yearOfManufacturing=" + yearOfManufacturing +
                ", engineType='" + engineType + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
