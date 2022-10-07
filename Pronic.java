import java.util.*;
public class Pronic
{
  public static void main()
  {
    Scanner ob = new Scanner(System.in);
    System.out.println("Enter a number - ");
    int num = ob.nextInt();
    int i,j,flag=0;
    for(i=0;i<100;i++)
    {
      for(j=0;j<100;j++)
      {
        if((i*j == num)&&(j-i == 1))
        flag = 1;
      }
    }
    if(flag == 1)
    System.out.println("It is a pronic number");
    else 
    System.out.println("It is not a pronic number");
  }
}