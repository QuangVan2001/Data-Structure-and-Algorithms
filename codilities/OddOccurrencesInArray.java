package codilities;

import java.util.HashSet;

public class OddOccurrencesInArray {

    public int solution(int[] A){
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0; i < A.length; i++){
            int value = A[i];
            if(set.contains(value)){
                set.remove(value);
            } else{
                set.add(value);
            }
        }
        return set.iterator().next();
    }




    public static void main(String[] args) {
        int[] A = {9,3,9,3,9,6,9};
        OddOccurrencesInArray occurrencesInArray = new OddOccurrencesInArray();
        System.out.println(occurrencesInArray.solution(A));
    }
}
