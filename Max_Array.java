import java.util.*;
public class Max_Array
{
  public static void main()
  {
    Scanner ob = new Scanner(System.in);
    double m[] = new double[21];
    double greatest = m[0],smallest = m[0],sum = 0;
    System.out.println("Enter the numbers one by one - ");
    for(int i = 1;i<=20;i++)
    {
      m[i] = ob.nextDouble();
      if(m[i] > greatest)
      greatest = m[i];
      if(m[i] < smallest)
      smallest = m[i];
      sum = m[i] + sum;
    }
    System.out.println("Largest number is "+greatest);
    System.out.println("Smallest number is "+smallest);
    System.out.println("Sum of the numbers is "+sum);
  }
}