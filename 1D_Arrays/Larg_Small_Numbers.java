
import java.util.*;

public class Larg_Small_Numbers {
    public static int getLargest(int numbers[]){
    int largest=Integer.MIN_VALUE;
   
    for (int i=0;i<numbers.length;i++)
    {
    if(largest<numbers[i]){
        largest=numbers[i];

    }
}
    return largest;
}
    public static int getsmallest(int numbers[]){

          int smallest=Integer.MAX_VALUE; 
          for (int i=0;i<numbers.length;i++)
    {
    if(smallest>numbers[i]){
       smallest=numbers[i] ;
    }
     
}
   
return smallest;
    }
    


    

public static void main(String args[]){
    int numbers[]={1,2,6,3,10,5};
    System.out.println("Largest value is:"+ getLargest(numbers));
System.out.println("Smallest value is:"+ getsmallest(numbers));
}
}

