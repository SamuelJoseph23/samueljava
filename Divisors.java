import java.util.Scanner;
public class Divisors
{
  public static void main()
  {
     Scanner ob = new Scanner(System.in);
     int a;
     System.out.println("Enter the number - ");
     a = ob.nextInt();
     System.out.println("The divisors are");
     for(int d = 1;d<=a;d++)
     {
       {
         if(a%d ==0)
         System.out.println(d+" ");
        }
    }
  }
}