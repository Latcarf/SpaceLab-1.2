package Collection.Task6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<User> users = new ArrayList<>();
        users.add(new User(5, "FirstName5", "LastName5", 25));
        users.add(new User(2, "FirstName2", "LastName2", 22));
        users.add(new User(4, "FirstName4", "LastName4", 24));
        users.add(new User(3, "FirstName3", "LastName3", 23));
        users.add(new User(1, "FirstName1", "LastName1", 21));
        users.add(new User(10, "FirstName10", "LastName10", 30));
        users.add(new User(8, "FirstName8", "LastName8", 28));
        users.add(new User(6, "FirstName6", "LastName6", 26));
        users.add(new User(7, "FirstName7", "LastName7", 27));
        users.add(new User(9, "FirstName9", "LastName9", 29));

        System.out.println("Before sorting:");
        for (User user : users) {
            System.out.println(user);
        }

        Collections.sort(users);

        System.out.println("\nAfter sorting with Comparable:");
        for (User user : users) {
            System.out.println(user);
        }

        users.sort(Comparator.comparing(User::getFirstName));

        System.out.println("\nAfter sorting with Comparator (by firstName):");
        for (User user : users) {
            System.out.println(user);
        }
    }
}
