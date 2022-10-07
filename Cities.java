import java.util.*;
public class Cities
{
  public static void main()
  {
    Scanner ob = new Scanner(System.in);
    String m[] = new String[11];
    System.out.println("Enter the cities - ");
    for(int i=1;i<=10;i++)
    {
      m[i] = ob.nextLine();
    }
    int n[] = new int[11];
    System.out.println("Enter the STD numbers - ");
    for(int j=1;j<=10;j++)
    {
      n[j] = ob.nextInt();
    }
    System.out.println("What city do you want to search for?");
    String country = ob.next();
    for(int k = 1;k<=10;k++)
    {
      if(country.equalsIgnoreCase(m[k]))
      System.out.println("Your city is found and its STD number is "+n[k]);
    }
    if(country.equalsIgnoreCase(m[1])==false)
    System.out.println("Your city is not found!");
    
  }
} 
    
  
