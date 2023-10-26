package leetcode.leetcode75.array_string;

public class GreatestCommonDivisorOfStrings {

    public String gcdOfStrings(String string1, String string2){
        if(string2.length() > string1.length()){
            return gcdOfStrings(string2, string1);
        }

        if(string2.equals(string1)){
            return string2;
        }
        if(string1.startsWith(string2)){
            return gcdOfStrings(string1.substring(string2.length()), string2);
        }
        return "";
    }


    public static void main(String[] args) {
        GreatestCommonDivisorOfStrings gcd = new GreatestCommonDivisorOfStrings();
        String string1 = "ABABAB";
        String string2 = "ABAB";

        long startTime = System.currentTimeMillis();
        String result = gcd.gcdOfStrings(string1, string2);
        long endTime = System.currentTimeMillis();
        System.out.println("Result: " + result);
        System.out.println("Execution time: " + (endTime - startTime) + " milliseconds");


    }
}
