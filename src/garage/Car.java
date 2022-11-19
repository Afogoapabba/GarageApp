package garage;

public class Car extends RoadLegalVehicle
{
    boolean hasAppleCarPlay;
    boolean hasAndroidAuto;

    public Car(String regNo, String color, int yearOfManufacturing, String engineType, String type, boolean hasAppleCarPlay, boolean hasAndroidAuto)
    {
        super(regNo, color, yearOfManufacturing, engineType, type);
        this.hasAppleCarPlay = hasAppleCarPlay;
        this.hasAndroidAuto = hasAndroidAuto;
    }

    public Car()
    {
    }
}
