//write a program to print sqare of 5 numbers
import java.util.*;
class DemoSquare
{
   public static void main(String Args[])
   {
      int [] arr=new int[10];
      int i;
      Scanner sc=new Scanner(System.in);
      
      System.out.println("Enter 5 numbers");
      for(i=0;i<5;i++)
      {
         arr[i]=sc.nextInt();
         
      }
       
      System.out.println("square of numbers are");
      for(i=0;i<5;i++)
      {
         System.out.println(arr[i]*arr[i]);
      }
   }
}