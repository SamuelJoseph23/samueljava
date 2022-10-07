import java.util.*;
public class Age_Calculator
{
  public static void main(String[] args)
  {
    Scanner ob =  new Scanner(System.in);
    System.out.println("Enter your year of birth - ");
    int year = ob.nextInt();
    int age = 2021-year;
    System.out.println("Your age is - "+age);
    }
}