import java.util.*;
public class Armstrong
{
  public static void main()
  {
    Scanner ob = new Scanner(System.in);
    System.out.println("Enter a number please - ");
    int number = ob.nextInt();
    int n = number;
    int sum = 0;
    while(n > 0)
    {
      int digit = n%10;
      int cube = digit*digit*digit;
      sum = sum+cube;
      n = n/10;
    }
    if(sum == number)
    System.out.println("It is an Armstrong number");
    else 
    System.out.println("Not an Armstrong number");
  }
}