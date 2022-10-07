import java.util.*;
public class Discount
{
  public static void main()
  {
    Scanner ob = new Scanner(System.in);
    System.out.println("Enter the price");
    double price = ob.nextDouble();
    System.out.println("Enter the quantity");
    double quantity = ob.nextDouble();
    double count = 0;
    double dprice = 0;
    double cost = price * quantity;
    {
      if(price>25000)
      count = 1;
      else if(price>15000&&price<=25000)
      count = 2;
      else if(price>3000&&price<=15000)
      count = 3;
    }
    {
      if(count == 1)
      dprice = price*(11/100);
      else if(count == 2)
      dprice = price*(8/100);
      else if(count == 3)
      dprice = price*(6/100);
      else
      dprice = price*(3/100);
    }
    double fprice = cost - dprice;
    System.out.println("Price = "+price);
    System.out.println("Quantity = "+quantity);
    System.out.println("Amount to be paid ="+fprice);
  }
}