package Collection.VehicleNumber;

import java.util.*;

public class Task3 {
    Set<VehicleNumber> stateNumbers = new HashSet<>();
    Scanner scanner = new Scanner(System.in);

    public void HashSetVehicleNumber() {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Task3 task3 = (Task3) o;
        return Objects.equals(stateNumbers, task3.stateNumbers) && Objects.equals(scanner, task3.scanner);
    }

    @Override
    public int hashCode() {
        return Objects.hash(stateNumbers, scanner);
    }
}
