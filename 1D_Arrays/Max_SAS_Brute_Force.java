import java.util.*;

 public class Max_SAS_Brute_Force {
    
    public static void MAX_Subarray_sum(int numbers[]) {
        int curr_sum = 0;
        int Max_sum = Integer.MIN_VALUE;
        
        for (int i = 0; i < numbers.length; i++) {
            int start = i;
            for (int j = i; j < numbers.length; j++) {
                int end = j;
                curr_sum = 0;
                for (int k = start; k <= end; k++) {
                    curr_sum += numbers[k];
                }
                System.out.println(curr_sum); // Optional: Print each subarray sum
                
                if (Max_sum < curr_sum) {
                    Max_sum = curr_sum;
                }
            }
        }
        System.out.println("Max_sum = " + Max_sum);
    }

    public static void main(String args[]) {
        int numbers[] = {2, 4, 6, 8, 10};
        MAX_Subarray_sum(numbers);
    }
}


