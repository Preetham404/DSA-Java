import java.util.*;
public class TrappedWater {
public static int TrappedRainWater(int height[])
{ int n=height.length;

    // Calculate left max boundary using array
    int leftMax[]=new int[n];
   
    leftMax[0]=height[0];
    
    for(int i=1;i<n;i++)
{
leftMax[i]=Math.max(height[i],leftMax[i-1]);
}

// Calculate Right max boundary using array
int rightMax[]=new int[n];
rightMax[n-1]=height[n-1];
for(int i=n-2;i>=0;i--)
{
  rightMax[i]=Math.max(height[i],rightMax[i+1]);

}
int TrappedWater=0;
// loop
for(int i=0;i<n;i++)
{
// Calculating Water-Level
int Waterlevel=Math.min(leftMax[i],rightMax[i]);
// To Calculated Trapped Rain Water
TrappedWater+=Waterlevel -  height[i];
}
return TrappedWater;
}

public static void main(String args[])
{
    int n;
int height[]={4,2,0,6,3,2,5};
System.out.println(TrappedRainWater(height));
}
}
