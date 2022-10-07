import java.util.*;
public class Palindrome
{
   public static void main()
  {
    Scanner ob = new Scanner(System.in);
    System.out.println("Enter a number");
    int number = ob.nextInt();
    int rev=0;
    while(number>0)
    {
      int temp=number;
      int digit = temp%10;
      rev = rev*10+digit;
      temp = temp/10;
    }
    if(rev ==number)  
    System.out.println("It is palindrome");
    else
    System.out.println("Not Palindrome");
    }
}