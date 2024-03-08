package Collection.VehicleNumber;

import Collection.VehicleNumber.VehicleNumber;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Task4 {
    Map<String, VehicleNumber> stateNumbers = new HashMap<>();
    Scanner scanner = new Scanner(System.in);

    public void HashMapVehicleNumber() {
        while (true) {
            System.out.println("\nEnter the vehicle registration number and than owner's name\nor 'LIST' to display a list, 'STOP' to complete");
            String vehicleNumber = scanner.nextLine();

            if ("STOP".equalsIgnoreCase(vehicleNumber)) {
                System.out.println("The program is completed.");
                break;

            } else if ("LIST".equalsIgnoreCase(vehicleNumber)) {
                if (stateNumbers.isEmpty()) {
                    System.out.println("The list is empty.");
                } else {
                    System.out.println("List of all license plates of cars with their owners:");
                    for (VehicleNumber number : stateNumbers.values()) {
                        System.out.println(number.getVehicleNumber() + " - " + number.getOwner());
                    }
                }

            } else {
                if (!VehicleNumber.isCorrectNumber(vehicleNumber)) {
                    System.out.println("Invalid format of the vehicle number. Please try again.");
                    continue;
                }

                System.out.println("Enter the owner's name: ");
                String owner = scanner.nextLine().trim();

                stateNumbers.put(vehicleNumber, new VehicleNumber(vehicleNumber, owner));
                System.out.println("The state number and owner have been added in the list.");
            }
        }
    }
}
