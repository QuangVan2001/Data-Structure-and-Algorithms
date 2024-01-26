package stream;

import java.util.*;

public class Client {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1,"van");
        map.put(2, "tung");
        map.put(3,"Lam");

        map.values().stream()
                .forEach(System.out::println);




        int[] a  = {10,25,35,30,40,40};

        List<String> list = new ArrayList<>();
        list.add("We");
        list.add("are");
        list.add("amily");

        //anyMatch, allMatch, noneMatch
//        boolean flag = list.stream().anyMatch(x -> x.startsWith("a"));
//        System.out.println(flag);

        //reduce
//        OptionalInt reduce = Arrays.stream(a).reduce((d, b) -> d+b);
//        System.out.println(reduce.getAsInt());


        //stream is parallel
//        boolean flag = Arrays.stream(a).parallel().isParallel();
//        System.out.println(flag);


        //stream is sequential
//        boolean flag = Arrays.stream(a).isParallel();
//        System.out.println(flag);

        //Min
//        int min =Arrays.stream(a)
//                .min().getAsInt();
//        System.out.println(min);

        //display even number
//        Arrays.stream(a)
//                .filter(x -> x%2 != 0)
//                .forEach(System.out::println);

        //Avarage
//        OptionalDouble average =  Arrays.stream(a).average();
//        System.out.println(average.getAsDouble());

        //sum
//        int sum =Arrays.stream(a).sum();
//        System.out.println(sum);


        //How to remove duplicates in arrays
//        Arrays.stream(a).distinct().sorted().forEach(System.out::println);



//        Arrays interation
//        Arrays.stream(a).forEach(System.out::println);



        //convert Array to Stream
//        long count = Arrays.stream(a).count();
//        System.out.println(count);



    }
}
