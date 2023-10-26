package codilities;

import java.util.HashSet;

public class MissingInteger {
    //Find the smallest positive integer that does not occur in a given sequence.
    public int solution(int[] A){
        HashSet<Integer> list = new HashSet<>();
        for(int i = 1; i<= A.length +1; i++){
            list.add(i);
        }

        for(int a: A){
            list.remove(a);
        }

        return list.iterator().next();
    }

    public static void main(String[] args){
        MissingInteger missingInteger = new MissingInteger();
        System.out.println(missingInteger.solution(new int[] {1,3,7,4,1,2}));
        System.out.println(missingInteger.solution(new int[] {-1,-3}));

    }
}
