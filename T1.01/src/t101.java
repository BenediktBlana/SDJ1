import java.util.Scanner;

public class t101
{

   public static void main(String[] args)
   {
      Scanner keyboard = new Scanner(System.in);
      int i=0;
      int neg=0;
      int neglast=0;
      System.out.println("Enter a number :");
      i = keyboard.nextInt();
      int last= i%10;
      if(last>0) {
      System.out.println("Last number is :"+last);
      }
     if(last<0) {
       neg=-last;
       
        System.out.println("Last number is : "+neg);
     }
   }
}