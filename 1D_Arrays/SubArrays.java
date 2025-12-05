import java.util.*;

public class SubArrays {
    public static void printsubarrays(int numbers[]) {
        int ts = 0; // Initialize subarray counter
        int MAX_Subarray;
        for (int i = 0; i < numbers.length; i++) {
            int start = i;
            for (int j = i; j < numbers.length; j++) {  // Fixed typo: "lenth" to "length"
                int end = j;
                for (int k = start; k <= end; k++) {
                    System.out.print(numbers[k] + " ");
                }
                ts++; // Increment subarray counter
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Total Subarrays = " + ts);
    }

    public static void main(String args[]) {
        int numbers[] = {2, 4, 6, 8, 10};
        printsubarrays(numbers);
    }
 }



