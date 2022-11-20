package garage;

public class Car extends RoadLegalVehicle
{
    boolean hasAppleCarPlay;
    boolean hasAndroidAuto;

    public Car( String color, String engineType, String type, boolean hasAppleCarPlay, boolean hasAndroidAuto)
    {
        super(color, engineType, type);
        this.hasAppleCarPlay = hasAppleCarPlay;
        this.hasAndroidAuto = hasAndroidAuto;
    }

    public Car()
    {
    }

    @Override
    public String toString()
    {
        return "Car {" +
                "hasAppleCarPlay=" + hasAppleCarPlay +
                ", hasAndroidAuto=" + hasAndroidAuto +
                ", regNo='" + regNo + '\'' +
                ", color='" + color + '\'' +
                ", yearOfManufacturing=" + yearOfManufacturing +
                ", engineType='" + engineType + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
