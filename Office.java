import java.util.*;
public class Office
{
   public static void main()
   {
     Scanner ob = new Scanner(System.in);
     System.out.println("Enter the employee code - ");
     int code = ob.nextInt();
     System.out.println("Enter the salary - ");
     int salary = ob.nextInt();
     final double allowance = 21.5/100;
     double sallowance = allowance * salary;
     double msalary = salary + sallowance;
     double asalary = msalary * 12;
     System.out.println("  ");
     System.out.println("Employee code is "+code);
     System.out.println("Salary is "+salary);
     System.out.println("Allowance is "+sallowance);
     System.out.println("Monthly salary is "+msalary);
     System.out.println("Annual salary is "+(long)asalary);
    }
}