import java.util.*;
public class Array
{
  public static void main()
  {
    Scanner ob = new Scanner(System.in);
    int greatest = 0;
    System.out.println("Find out the greatest of numbers you enter!");
    System.out.println("How many numbers are you going to enter?");
    int n = ob.nextInt();
    int m[] = new int[n];
    System.out.println("Enter "+n+" numbers and press enter after each - ");
    for(int i=0;i<n;i++)
    {
       m[i]=ob.nextInt();
    }
    for(int j=0;j<n;j++)
    {
      if(m[j]>greatest)
      {
        greatest = m[j];
      }
    }
    System.out.println(" ");
    System.out.println(" ");
    System.out.println(" ");
    System.out.println("The greatest number that you entered is "+greatest);
  }
}