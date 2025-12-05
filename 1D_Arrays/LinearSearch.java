
import java.util.*;
public class LinearSearch{
    public static int linearSearch(String menu[],String key){
for(int i=0;i<menu.length;i++)
{
if(menu[i]==key)
{
    return i;
}
}
return -1;
    }
    public static void main( String args[])
    {
String menu[]={"Dosa","Samosa","MasalaDosa","Biriyani"};
String key="Biriyani";

 int index= linearSearch(menu,key);
 if(index==-1)
 {
    System.out.println("Item not Found");
 }
 else
    
    {

    
System.out.println("Key Found at Position"+" "+(index+1));
    }
 }


    }


















    
