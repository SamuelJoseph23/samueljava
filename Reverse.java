import java.util.Scanner;
public class Reverse
{
  public static void main()
  {
    Scanner ob = new Scanner(System.in);
    System.out.println("Enter a number");
    int n = ob.nextInt();
    int temp = n;
    int rev = 0;
    while(temp>0)
    {
      int d = temp%10;
      rev = rev*10+d;
      temp = temp/10;
    }
    System.out.println("Reverse number is "+rev);
    }
}