import java.util.Scanner;
public class Sum
{
  public static void main()
  {
    Scanner ob = new Scanner(System.in);
    System.out.println("Enter a three digit number - ");
    int number = ob.nextInt();
    int dig = number%100;
    int dig1 = dig%10;
    int dig2 = number/100;
    int sum = dig1+dig2;
    int product = dig1*dig2;
    System.out.println("The sum is "+sum);
    System.out.println("The producct is "+product);
    }
}