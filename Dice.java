import java.util.*;
public class Dice
{
  public static void main()
   {
      Scanner ob = new Scanner(System.in);
      Random sc = new Random();
      int h;
      int side;
     do
    {
      System.out.println("How many sided dice do you want to roll?");
      side = ob.nextInt();
      int a = sc.nextInt(side);
      {
      if(a==0)
      System.out.println("Number is = "+1);
      else
      System.out.println("Number is = "+a);
      }
      System.out.println("Type 1 to roll again or type 0 to exit");
      h=ob.nextInt();
     }while(h!=0);
     System.out.println("Thank you!");
     System.exit(0);
   }   
} 