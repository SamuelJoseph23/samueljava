import java.util.*;
public class Sum_Digits
{
  public static void main()
  {
    Scanner ob = new Scanner(System.in);
    System.out.println("Enter a number");
    int number = ob.nextInt();
    int temp = number;
    int total = 0;
    int count = 0;
    while(temp>0)
     {
      int digit = temp%10;
      total = total + digit;
      temp=temp/10;
      
      ++count;
    }
    System.out.println("Sum of digits = "+total);
    System.out.println("Total digits = "+count);
  }
}