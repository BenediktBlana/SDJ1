import java.util.*;

public class Exercise_7_06
{

   public static void main(String[] args)
   {
      Scanner keyboard = new Scanner(System.in);
      int[] x = new int[10];
     
      int min=x[0];

      for (int i = 0; i < x.length; i++)
      {
         System.out.println("type a number");
         x[i] = keyboard.nextInt();
      }

      for (int i = 0; i < x.length; i++)
      {
         System.out.print(x[i] + "  ");
      }
      
         for (int i = 1; i<x.length; i++)
         {
            if(x[i]<min){
               min=x[i];
            
            }
            }
            
               
            
           
            
      keyboard.close();
      System.out.println("smallest is "+min);
   }
}