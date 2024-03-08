package Collection.VehicleNumber;

import Collection.VehicleNumber.VehicleNumber;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task1 {
    List<VehicleNumber> stateNumbers = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    public void arrayListVehicleNumber() {
        while (true) {
            System.out.println("\nEnter the vehicle registration number\nor 'LIST' to display a list, 'STOP' to complete: ");
            String input = scanner.nextLine();

            if ("STOP".equalsIgnoreCase(input)) {
                System.out.println("The program is completed.");
                break;

            } else if ("LIST".equalsIgnoreCase(input)) {
                if (stateNumbers.isEmpty()) {
                    System.out.println("The list is empty.");
                } else {
                    System.out.println("List of all license plates of cars in the parking lot:");
                    for (VehicleNumber number : stateNumbers) {
                        System.out.println(number.getVehicleNumber());
                    }
                }
            } else if (VehicleNumber.isCorrectNumber(input)) {
                stateNumbers.add(new VehicleNumber(input));
                System.out.println("The state number has been added to the list.");

            } else {
                System.out.println("Invalid format. Please try again.");
            }
        }
    }
}