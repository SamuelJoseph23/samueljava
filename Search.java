import java.util.*;
public class Search
{
  public static void main()
  {
    Scanner ob = new Scanner(System.in);
    System.out.println("How many numbers are you going to enter?");
    int n = ob.nextInt();
    boolean count = false;
    int m[] = new int[n];
    System.out.println("Enter "+n+" numbers and press enter after each - ");
    for(int i=0;i<n;i++)
    {
       m[i]=ob.nextInt();
    }
    System.out.println("What number do you want to find?");
    int k = ob.nextInt();
    for(int j=0; j<n;j++)
    {
      if(m[j] == k)
      {
        count = true;
      }
      else
      continue;
    }
    if(count == true)
    System.out.println("Number found!!!");
    }
}