import java.util.*;
public class Luck_Calculator
{
   public static void main()
   {
     int b = 0;
     Scanner ob = new Scanner(System.in);
     do{
       Random sc = new Random();
       int a = sc.nextInt(100);
       System.out.println("Your luck right now is "+a);
       System.out.println("Type 1 to use again or anything else to exit");
       b = ob.nextInt();
     } while(b==1);
    }
}