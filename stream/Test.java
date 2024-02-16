package stream;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(69,29,2,8,29,27,27);
        // Print Duplicate Numbers using Streams
        Set<Integer> dulicated = nums.stream()
                .filter(n -> Collections.frequency(nums, n) >1).collect(Collectors.toSet());
        System.out.println(dulicated);

        // Print Not Duplicate Numbers using Streams
        List<Integer> notDuplicated = nums.stream()
                .filter(n -> Collections.frequency(nums, n) ==1).collect(Collectors.toList());
        System.out.println(notDuplicated);

        //Print Numbers Starts With Prefix 2 using Streams
        List<Integer> list1 = nums.stream()
                .map(String::valueOf)
                .filter(n -> n.startsWith("2"))
                .map(Integer::valueOf)
                .collect(Collectors.toList());

        System.out.println(list1);
//        int valueRemove = 8;
//        nums.remove(Integer.valueOf(valueRemove));
//
//
//        List<Integer> list=nums.stream()
//                .map(n -> n+2)
//                .filter(n-> n>1)
//                .sorted()
//                .toList();
//        System.out.println(list);



        // Tạo danh sách ban đầu
        List<Integer> originalList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            originalList.add(i);
        }

        // Sao chép danh sách và xóa một phần tử
        List<Integer> shuffledList = new ArrayList<>(originalList);
        shuffledList.remove(5); // ví dụ xóa phần tử thứ 5
        Collections.shuffle(shuffledList);

        // Tìm phần tử bị xóa
        originalList.removeAll(shuffledList);
        System.out.println("Phần tử đã bị xóa: " + originalList);
    }
}
