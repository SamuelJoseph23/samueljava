import java.util.*;
public class Sallary
{
  int extra = 0;
  String ename = "";
  void name(String name)
  {
    System.out.println(name);
}
void calculate(int sal)
{
  extra = sal + 10000;
  System.out.println(extra);
}
public static void main()
{
  Scanner ob = new Scanner(System.in);
  String name;
  int sal;
  System.out.println("Enter your name");
  name = ob.next();
  System.out.println("Enter your sallary");
  sal = ob.nextInt();
  Sallary in = new Sallary();
  in.name(name);
  in.calculate(sal);
}
}