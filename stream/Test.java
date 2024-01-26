package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test {
    public static void main(String[] args) {
//        List<Integer> nums = Arrays.asList(6,5,2,8,1,7);
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
