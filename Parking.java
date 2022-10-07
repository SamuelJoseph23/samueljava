import java.util.Scanner;
public class Parking
{
  public static void main()
  {
    Scanner ob = new Scanner(System.in);  
    double car,time,amount;
    int option;
    do
    {
    System.out.println("Enter your car number - ");
    car = ob.nextInt();
    System.out.println("Parking time");
    time = ob.nextInt();
    if(time<=3)
    {
      amount = time * 5;
      System.out.println("Amount for car number "+car+" is "+amount);
    }
    else if(time>3 && time<=23)
    {
      amount = (time * 5) + ((time - 3)*1.50);
      System.out.println("Amount for car number "+car+" is "+amount);
    }
    else if(time == 24)
    {
      amount = 50;
      System.out.println("Amount for car number "+car+" is "+amount);
    }
    else
    {
    System.out.println("We have called the police and your vehicle will be taken away now!");
    }
    System.out.println("Enter 1 for once more");
    option = ob.nextInt();
  }while(option == 1);
  }
}