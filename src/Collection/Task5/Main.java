package Collection.Task5;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int size = 1_000_000;
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();
        OperatingSpeed operatingSpeed = new OperatingSpeed();

        operatingSpeed.fillList(arrayList, size);
        operatingSpeed.fillList(linkedList, size);

        System.out.println("ArrayList Performance:");
        operatingSpeed.testListPerformance(arrayList);

        System.out.println("⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡⚡");

        System.out.println("LinkedList Performance:");
        operatingSpeed.testListPerformance(linkedList);
    }
}