package codilities;

import java.util.HashSet;

public class PermMissingElem {
    // Phuong phap 1 ~ đúng được tầm 80% test case
    public int solution(int[] A){
        int sum = 0;
        int sumArrayIfHaveEnoughElement = ((A.length + 1 )* (A.length +2)) / 2;

        for (int i = 0; i <A.length; i++){
            sum += A[i];

        }
        return sumArrayIfHaveEnoughElement - sum;
    }

    // Phuong phap đúng 100% testcase
    public  int solution2(int[] A){
        HashSet<Integer> set = new HashSet<>();
        for (int i = 1; i <= A.length+1; i++){
            set.add(i);
        }
        for(int i = 0; i< A.length; i++){
            set.remove(A[i]);
        }
        return set.iterator().next();
    }

    public static void main(String[] args) {
        int[] A = {1,3,4,5};
        PermMissingElem permMissingElem = new PermMissingElem();
        System.out.println(permMissingElem.solution2(A));
    }
}
