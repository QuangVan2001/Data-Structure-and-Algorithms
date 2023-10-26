package classicAlgorithm;

import java.util.Arrays;
import java.util.Collections;

public class ReverseString {
    public String solution(String string){
        String reverString ="";
        for(int i = 0; i < string.length(); i++){
            char ch = string.charAt(i);
            reverString = ch + reverString;
        }
        return reverString;
    }


    public String solution2(String s){
        if(s.isEmpty()){
            return s;
        }
        return s.charAt(s.length()-1) + solution2(s.substring(0, s.length() -1));
    }

    public String reverse(String s){
        if(s.isEmpty()){
            return s;

        }
        return s.charAt(s.length() -1) + reverse(s.substring(0, s.length()-1));
    }











    public static void main(String[] args) {
//        long startTime= System.currentTimeMillis();
//        System.out.println(new ReverseString().solution("Pham Quang Van"));
//        long endtime = System.currentTimeMillis();
//        System.out.println("time : " + (endtime - startTime));

        System.out.println();
        long startTime2= System.currentTimeMillis();
        System.out.println(new ReverseString().solution2("quangvan"));
        long endtime2 = System.currentTimeMillis();
        System.out.println("time : " + (endtime2 - startTime2));


        String s ="ban";
        System.out.println(s.substring(0, s.length()-1));


    }
}
