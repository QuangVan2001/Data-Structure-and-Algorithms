package classicAlgorithm;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MostAppearances {
    public static int findMostAppearances(int[] list) {
        Map<Integer, Integer> countMap = new HashMap<>();
        int maxCount = 0;

        // Count each number's appearances
        for (int num : list) {
            int count = countMap.getOrDefault(num, 0) + 1;
            countMap.put(num, count);
            maxCount = Math.max(maxCount, count);
        }

        // Sum the numbers with the most appearances
        int sum = 0;
        for (int num : countMap.keySet()) {
            if (countMap.get(num) == maxCount) {
                sum += num;
            }
        }

        return sum;
    }

    public static int test(int[] nums){
        List<Integer> list = Arrays.stream(nums).boxed().toList();

        return list.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .max(Comparator.comparingLong(Map.Entry::getValue))
                .map(Map.Entry::getKey)
                .orElseThrow(() -> new IllegalStateException("Array is empty"));

    }




    public static void main(String[] args) {
        // Example usage:
        int[] list = {1, 2, 2, 3, 3,4,4}; // Replace with actual numbers
        System.out.println("The sum of the numbers with the most appearances is: " + findMostAppearances(list));
        System.out.println("The sum of the numbers with the most appearances is: " + test(list));

    }
}
