package codilities;

public class MaxCounter {

    //Calculate the values of counters after applying all alternating operations: increase counter by 1;
    // set value of all counters to current maximum.
     public int[] solution( int N, int[] A){
         int maxValue = 0;
         int minValue = 0;
         int[] counters = new int[N];
         for(int i = 0; i < A.length; i++){
             int operation = A[i];
             if(operation == N+1){

                 //Max value operation
                 minValue = maxValue;
             } else {
                 // Increment operation
                 operation--;
                 counters[operation] = Math.max(counters[operation]+1,  minValue+1);
                 maxValue = Math.max(maxValue, counters[operation]);
             }
         }

         for(int i = 0 ; i < counters.length;i++){
             counters[i] = Math.max(counters[i], minValue);
         }
         return counters;
     }

    public static void main(String[] args) {
        MaxCounter maxCounter = new MaxCounter();
        int[] result = maxCounter.solution(5, new int[] {3,4,4,6,1,4,4});
        for(int i : result){
            System.out.println(i);
        }
    }
}
