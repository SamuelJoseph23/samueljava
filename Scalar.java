import java.util.*;
public class Scalar
{
  public static void input()
  {
    Scanner ob = new Scanner(System.in);
    System.out.println("Enter the size of the array - ");
    int size = ob.nextInt();
    int m = size;
    int a[][] = new int[m][m];
    int flag = 0;
    System.out.println("Enter the values of the matrix - ");
    for(int i = 0;i<size;i++)
    {
      for(int j = 0;j<size;j++)
      {
        a[i][j] = ob.nextInt();
      }
    }
    int diagval = a[0][0];
    for(int i = 0;i<size;i++)
    {
      for(int j = 0;j<size;j++)
      {
        if(i==j && diagval != a[i][j])
        flag = 1;
      }
    }
    if(flag == 0)
    System.out.println("It is a scalar matrix!");
    else if(flag == 1)
    System.out.println("It is not a scalar matrix!");
    
    for(int i = 0;i<size;i++)
    {
      for(int j = 0;j<size;j++)
      {
        System.out.print(a[i][j]+" ");
      }
      System.out.println();
    }
  }
}