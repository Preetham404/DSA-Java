

import java.util.*;
public class PrintPairs{
    public static void pairarray(int numbers[])
    {
      int tp=0;
        for(int i=0;i<numbers.length;i++)
        {
            int curr=numbers[i];
            for(int j=i+1;j<numbers.length;j++)
         {
                 tp++;
                System.out.print("("+curr+","+numbers[j]+")");
              

            }
System.out.println();
        }
        System.out.println("Total number of pairs are"+":"+(tp));
    }
    public static void main(String args[]){
        int numbers[]={1,2,3,4,5,6,7,8};
          int tp=0;
pairarray( numbers);
 

    }
}