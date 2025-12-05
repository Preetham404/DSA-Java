import java.util.*;
public class Max_SAS_Kadanes{
    

// public static void MAX_Subarray_sum(int numbers[]) {
//         int curr_sum = 0; 
//         int Max_sum = Integer.MIN_VALUE;
//         int Prefix[] = new int[numbers.length];
//         Prefix[0] = numbers[0];
        
//         // calculate Prefix Array
//         for(int i = 1; i < Prefix.length; i++) {
//             Prefix[i] = Prefix[i-1] + numbers[i];
//         }
        
//         for (int i = 0; i < numbers.length; i++) {
//             int start = i;
//             for (int j = i; j < numbers.length; j++) {
//                 int end = j;
//                 curr_sum = start == 0 ? Prefix[end] : Prefix[end] - Prefix[start-1];
                
//                 if (Max_sum < curr_sum) {
//                     Max_sum = curr_sum;
//                 }
//             }
//         }
    //     System.out.println("Max_sum = " + Max_sum);
    // }
    public static void kadanes(int numbers[])
    {
        int ms=Integer.MIN_VALUE;
        int cs=0;
        for(int i=0;i<numbers.length;i++)
        cs=cs+numbers[i];
        if(cs<0)
        {
            cs=0;
        }
        ms=Math.max(cs,ms);
    
    System.out.println("Our max subarray sum is="+ms);

        }

    


    public static void main(String args[]) {
        int numbers[] = {2, 4, 6, 8, 10};
        kadanes(numbers);
    }
}



    