package codilities;

public class TapeEquilibrium {
    public static void main(String[] args) {
        System.out.println(new TapeEquilibrium().solution(new int[]{3,1,2,4,3}));


    }
    public int solution(int[] A){
        int numbersOnright = 0;
        for(int i = 0; i < A.length; i++){
            numbersOnright += A[i];
        }

        int minDiff = Integer.MAX_VALUE;

        int numbersOnLeft = 0;
        for(int i = 0; i < A.length -1 ; i++){
            numbersOnright -= A[i];
            numbersOnLeft += A[i];

            if(Math.abs(numbersOnLeft - numbersOnright) < minDiff){
                minDiff = Math.abs(numbersOnLeft - numbersOnright);

            }
        }

        return minDiff;
    }
}
