import java.util.*;
public class Large
{
  public static void main()
  {
    Scanner ob = new Scanner(System.in);
    System.out.println("Enter a number - ");
    int number = ob.nextInt();
    int temp = number;
    int greater = 1;
    int smaller = 9;
    while(temp>0)
    {
      int digit = temp%10;
      if(digit > greater)
      greater = digit;
      else if(digit < smaller)
      smaller = digit;
      temp = temp/10;
    }
    System.out.println("Greatest number is "+greater);
    System.out.println("Smsllest number is "+smaller);
  }
}