import java.util.Scanner;
public class Books
{
  String Bname;
  double price;
  double discount;
  Scanner ob = new Scanner(System.in);
  void BookFair()
  {
    Bname = "";
    price = 0.0;
  }
  void Input()
  {
    System.out.println("Enter the name of the book - ");
    Bname = ob.nextLine();
    System.out.println("Enter the price of the book - ");
    price = ob.nextDouble();
  }
  void calculate()
  {
    if(price <= 1000)
    discount = price - (price*(2/100));
    else if(price >1000 || price<=3000)
    discount = price - (price*(10/100));
    else if(price >3000)
    discount = price - ((price*15)/100);
  }
  void display()
  {
    System.out.println("The price of the book '"+Bname+"' is "+discount);
  }
  public static void main()
  {
    Books ob = new Books();
    ob.Input();
    ob.calculate();
    ob.display();
  }
}