import java.util.*;
public class Beam
{
  public static void main()
  {
    Scanner ob = new Scanner(System.in);
    System.out.println("Enter a number - ");
    int number = ob.nextInt();
    int digit,temp = number,sum = 0;
    while(temp>0)
    {
      digit = temp%10;
      sum = sum+(digit*digit);
      temp = temp/10;
    }
    if(sum>number)
    System.out.println("Beam number");
    else 
    System.out.println("Not a Beam number");
  }
}