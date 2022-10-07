import java.util.*;
public class Neon
{
  public static void main()
  {
    Scanner ob = new Scanner(System.in);
    System.out.println("Enter a number - ");
    int number = ob.nextInt();
    int square = number * number;
    int sum = 0;
    while(square>0)
    {
      int digit = square%10;
      sum = sum + digit;
      square = square/10;
    }
    if(number == sum)
    System.out.println("It is a Neon number");
    else
    System.out.println("It is not a Neon number");
  }
}