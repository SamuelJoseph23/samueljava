import java.util.Scanner;
public class Practice
{
  String name;
  long mobno;
  double cost,dis,amount;
  Scanner ob = new Scanner(System.in);
  void ShowRoom()
  {
    name="";
    mobno=0;
    cost=0;
    dis=0;
    amount=0;
  }
  void input()
  {
    System.out.println("What is your name?");
    name = ob.nextLine();
    System.out.println("Enter your waste phone number - ");
    mobno = ob.nextLong();
    System.out.println("Enter the cost - ");
    cost = ob.nextInt();
  }
  void calculate( ) {
    if (cost <= 10000){
     dis = cost*5/100;
     amount = cost - dis;
    }
    else
    if (cost > 10000 && cost <= 20000){
     dis = cost* 10/100;
     amount = cost - dis;
    }
    else
    if (cost > 20000 && cost <= 35000){
     dis = cost* 15/100;
     amount = cost - dis;
    }
    else
     if (cost > 35000){
     dis = cost*20/100;
     amount = cost-dis;
    }
  }
  void display( ) 
  {
   System.out.println("Name::" +name);
   System.out.println("Mobile No.::" +mobno);
   System.out.println("Amount::" +amount);
   }
  public static void main()
  {
    Practice ob = new Practice();
    ob.input();
    ob.calculate();
    ob.display();
  }
}



      
  

