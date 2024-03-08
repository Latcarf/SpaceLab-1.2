package Collection.VehicleNumber;

import java.util.regex.Pattern;

public class VehicleNumber {
    private final static Pattern VEHICLE_NUMBER = Pattern.compile("^[A-Z]{2}\\d{4}[A-Z]{2}$");
    private String vehicleNumber;
    private String owner;

    public VehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }
    public VehicleNumber(String vehicleNumber, String owner) {
        this.vehicleNumber = vehicleNumber;
        this.owner = owner;
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public void setVehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    public String getOwner() {
        return owner;
    }

    public static boolean isCorrectNumber(String vehicleNumber) {
        return VEHICLE_NUMBER.matcher(vehicleNumber).matches();
    }
}
