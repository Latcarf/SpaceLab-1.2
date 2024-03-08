package Collection.Task5;

import java.util.List;
import java.util.Random;

public class OperatingSpeed {

    public void fillList(List<Integer> list, int size) {
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            list.add(random.nextInt());
        }
    }

    public void testListPerformance(List<Integer> list) {
        AddToEnd(list);
        AddToFirstHalf(list);
        GetFromEnd(list);
        GetFromFirstHalf(list);
        RemoveFromEnd(list);
        RemoveFromFirstHalf(list);
    }

    private void AddToEnd(List<Integer> list) {
        long startTime = System.nanoTime();
        list.add(-1);
        long endTime = System.nanoTime();
        System.out.println("Add to end: " + (endTime - startTime) + " ns");
    }

    private void AddToFirstHalf(List<Integer> list) {
        long startTime = System.nanoTime();
        list.add(list.size() / 2, 1);
        long endTime = System.nanoTime();
        System.out.println("Add to first half: " + (endTime - startTime) + " ns");
    }

    private void GetFromEnd(List<Integer> list) {
        long startTime = System.nanoTime();
        list.get(list.size() - 1);
        long endTime = System.nanoTime();
        System.out.println("Get from end: " + (endTime - startTime) + " ns");
    }

    private void GetFromFirstHalf(List<Integer> list) {
        long startTime = System.nanoTime();
        list.get(list.size() / 2);
        long endTime = System.nanoTime();
        System.out.println("Get from first half: " + (endTime - startTime) + " ns");
    }

    private void RemoveFromEnd(List<Integer> list) {
        long startTime = System.nanoTime();
        list.remove(list.size() - 1);
        long endTime = System.nanoTime();
        System.out.println("Remove from end: " + (endTime - startTime) + " ns");
    }

    private void RemoveFromFirstHalf(List<Integer> list) {
        long startTime = System.nanoTime();
        list.remove(list.size() / 2);
        long endTime = System.nanoTime();
        System.out.println("Remove from first half: " + (endTime - startTime) + " ns");
    }
}
