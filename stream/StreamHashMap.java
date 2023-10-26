package stream;

import javax.swing.*;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamHashMap {


    Map<String, Integer> someMap = new HashMap<>();


    Set<Map.Entry<String, Integer>> entries = someMap.entrySet();

    Set<String> keySet = someMap.keySet();

    Collection<Integer> values = someMap.values();

    Stream<Map.Entry<String, Integer>> entryStream = entries.stream();
    Stream<Integer> valueStream = values.stream();
    Stream<String> keyStream = keySet.stream();


    Map<String, String> books = new HashMap<>();
    {
        books.put(
                "978-0201633610", "Design patterns : elements of reusable object-oriented software");
        books.put(
                "978-1617291999", "Java 8 in Action: Lambdas, Streams, and functional-style programming");
        books.put("978-0134685991", "Effective Java");
    }


    List<String> isbnCode= books.entrySet().stream()
            .filter(e -> e.getValue().startsWith("Effective Java"))
            .map(Map.Entry:: getKey)
            .collect(Collectors.toList());





}
