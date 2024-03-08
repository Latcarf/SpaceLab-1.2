package Collection.VehicleNumber;

import Collection.VehicleNumber.VehicleNumber;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Task2 {
    private List<VehicleNumber> stateNumbers = new LinkedList<>();
    private Scanner scanner = new Scanner(System.in);

    public void linkedListVehicleNumber() {
        while (true) {
            System.out.println("\nEnter the vehicle registration number,\nor 'LIST' to display a list, 'STOP' to complete: ");
            String numberInput = scanner.nextLine();

            if ("STOP".equalsIgnoreCase(numberInput)) {
                System.out.println("The program is completed.");
                break;

            } else if ("LIST".equalsIgnoreCase(numberInput)) {
                if (stateNumbers.isEmpty()) {
                    System.out.println("The list is empty.");
                } else {
                    System.out.println("List of all license plates of cars in the parking lot:");
                    for (VehicleNumber number : stateNumbers) {
                        System.out.println(number.getVehicleNumber());
                    }
                }

            } else if (VehicleNumber.isCorrectNumber(numberInput)) {
                System.out.println("Enter the position (index starts at 0) where the number should be added, or any number greater than the current list size to add at the end:");
                int position = Integer.parseInt(scanner.nextLine());
                if (position < 0 || position > stateNumbers.size()) {
                    stateNumbers.add(new VehicleNumber(numberInput));
                    System.out.println("The state number has been added to the end of the list.");
                } else {
                    stateNumbers.add(position, new VehicleNumber(numberInput));
                    System.out.println("The state number has been added to the list at position " + position + ".");
                }
            } else {
                System.out.println("Invalid format. Please try again.");
            }
        }
    }
}
