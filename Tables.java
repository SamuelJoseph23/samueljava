import java.util.*;
public class Tables
{
    public static void main()
    {
      Scanner ob = new Scanner(System.in);
      int number,answer;
      int d;
      do
      {
      System.out.println("Which tables do you want?");
      number = ob.nextInt();
      System.out.println("The "+number+" tables is:-");
       System.out.println(" ");
      for(int h=1;h<=25;h++)
      {
        answer = h*number;
        System.out.println(number+" X "+h+" = "+answer); 
      }
      System.out.println("Press 0 to exit or type 1 to get another set of tables");
      d = ob.nextInt();
    }while(d!=0);
    System.out.println("Thank you!");
    System.exit(0);
  }
  }