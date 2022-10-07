import java.util.Scanner;
public class Duck
{
   public static void main(int n)
   {
    Scanner ob = new Scanner(System.in);
    int temp = n;
    int duck = 0;
    while(temp>0)
     {
      int digit = temp%10;
      if(digit == 0)
      {
         duck = 1;
       }
      else if(digit !=1)
      {
        duck = duck+0;
      }
      temp = temp/10;
      }
    if(duck == 1)
    System.out.println("It is a duck number");
    else
    System.out.println("Not a duck number");
  }
}