package classicAlgorithm;

import java.util.*;
import java.util.stream.Collectors;

public class CountAppearance {

    //input: "phama", 'm';
    //output: 1

    public int solution1(String s, char character){
        int count = 0;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == character){
                count++;
            }
        }
        return count;
    }




    //input: "phama";
    //output: [1,1,2,1];
    public static int[] solution2(String s){
        HashMap<Character, Integer> countMap= new LinkedHashMap<>();
        for(char c: s.toCharArray()){
            countMap.put(c, countMap.getOrDefault(c, 0) + 1);
        }
        int[] result = new int[countMap.size()];
        int i = 0;
        for (Integer count: countMap.values()){
            result[i++] = count;
        }
        return result;
    }


    //input: "phama";
    //output: [1,1,2,1];
    public static int[] solution3(String s){
        HashMap<Character, Integer> countMap= new LinkedHashMap<>();
        for(char c: s.toCharArray()){
            countMap.put(c, countMap.getOrDefault(c, 0) + 1);
        }

        return countMap.values().stream()
                .mapToInt(Integer::intValue)
                .toArray();
    }

    //input: "phama";
    //output: [p,h,a,m];
    public static char[] solution(String s) {
        Character[] characterArray = s.chars()  // Convert String to IntStream
                .mapToObj(c -> (char) c)       // Convert int to char
                .distinct()                    // Remove duplicates
                .toArray(Character[]::new);    // Convert to Character array

        char[] charArray = new char[characterArray.length];
        for (int i = 0; i < characterArray.length; i++) {
            charArray[i] = characterArray[i];
        }

        return charArray;
    }








    public static void main(String[] args) {
        System.out.println(new CountAppearance().solution1("phama", 'm'));
        System.out.println();

        String s ="phama";
        int[] result = solution3(s);
        System.out.println(Arrays.toString(result));
        System.out.println();

        String se ="phama";
        char[] results = solution(se);
        System.out.println(Arrays.toString(results));

    }

}
