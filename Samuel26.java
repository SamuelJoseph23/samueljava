import java.util.*;
public class Samuel26
{
  public static void main()
   {
     double rate, wages;
     int days;
     Scanner ob =  new Scanner(System.in);
     System.out.println("Input the number of days worked - ");
     days = ob.nextInt();
     System.out.println("Enter the rate per day - ");
     rate = ob.nextDouble();
     wages = days*rate;
     System.out.println("The wages is = "+wages);
    }
}