import java.util.*;
import java.awt.*;
public class Stone_Paper_Scissors_2
{  
   public static void NormalMode()
    {
        int computer;
        int option3;
        int user;
        int score = 0;
        int h;
        String name;
        Scanner ob =  new  Scanner(System.in);
        Random sc =  new  Random();
        System.out.println("Enter your name - ");
        name = ob.nextLine();
      do
      {
        System.out.println("Hi "+name+ "! Choose any one - 0.Stone , 1.Paper , 2.Scissors");
        user = ob.nextInt();
        System.out.println(" ");
        Toolkit.getDefaultToolkit().beep();
        computer = sc.nextInt(3);
        if (user == 0 && computer == 0) {
            System.out.println("Computer also chose the same 😒 ");
        }
        else if (computer == 1 && user == 1) {
            System.out.println("Computer also chose the same 😒 ");
        }
        else if (computer == 2 && user == 2) {
            System.out.println("Computer also chose the same 😒 ");
        }
        else if (computer == 0 && user == 1) {
            System.out.println("Computer chose Stone,"+name+" wins! 😄");
            score = score+1;
        }
        else if (computer == 0 && user == 2) {
            System.out.println("Computer chose Stone, You lose! 😢 ");
        }
        else if (computer == 1 && user == 2) {
            System.out.println("Computer chose Paper,"+name+" wins! 😄");
            score = score+1;
        }
        else if (computer == 1 && user == 0) {
            System.out.println("Computer chose Paper, You lose! 😢 ");
        }
        else if (computer == 2 && user == 0) {
            System.out.println("Computer chose Scissors,"+name+" wins! 😄");
            score = score+1;
        }
        else if (computer == 2 && user == 1) {
            System.out.println("Computer chose Scissors, You lose 😢 ");
        }
        else {
            System.out.println("Wrong option "+name);
            System.out.println("Your final score is "+score);
            System.exit(0);
        }
        System.out.println(" ");
        System.out.println("                             Your current score is "+score);
        System.out.println(" ");
        Toolkit.getDefaultToolkit().beep();
        System.out.println("Type 0 if you want to stop playing or enter 1 to continue!");
        h=ob.nextInt();
        System.out.println(" ");
      } while(h!=0);
      System.out.println("Your final score is "+score);
      System.out.println(" ");
      System.out.println("                         ********************************************************************");
   }
   public static void ImpossibleMode()
   {
        int computer;
        int option3;
        int user;
        int score = 0;
        int h;
        String name;
        Scanner ob =  new  Scanner(System.in);
        Random sc =  new  Random();
        System.out.println("Enter your name - ");
        name = ob.nextLine();
      do
      {
        System.out.println("Hi "+name+ "! Choose any one - 0.Stone , 1.Paper , 2.Scissors");
        user = ob.nextInt();
        System.out.println(" ");
        Toolkit.getDefaultToolkit().beep();
        computer = sc.nextInt(3);
        {
         if(user == 1)
         System.out.println("Computer chose Scissors, You lose 😢 ");
         else if(user == 0)
         System.out.println("Computer chose Paper, You lose 😢 ");
         else if(user == 2)
         System.out.println("Computer  chose Stone, You lose 😢 ");
         else if(user >= 3 || user <-1)
         System.out.println("Wrong option");
        }
        Toolkit.getDefaultToolkit().beep();
        System.out.println("Type 0 if you want to stop playing or enter 1 to continue!");
        h=ob.nextInt();
      } while(h!=0);
      System.out.println("Your final score is "+score);
      System.out.println(" ");
      System.out.println("                         ********************************************************************"); 
   }
   public static void VeryEasyMode()
   {
      {
        int computer;
        int option3;
        int user;
        int score = 0;
        int h;
        String name;
        Scanner ob =  new  Scanner(System.in);
        Random sc =  new  Random();
        System.out.println("Enter your name - ");
        name = ob.nextLine();
      do
      {
        System.out.println("Hi "+name+ "! Choose any one - 0.Stone , 1.Paper , 2.Scissors");
        user = ob.nextInt();
        System.out.println(" ");
        Toolkit.getDefaultToolkit().beep();
        computer = sc.nextInt(3);
        {
         if(user == 1) {
         System.out.println("Computer chose Stone, You win 😄");
         score = score + 1;
        }
         else if(user == 0)
         {
         System.out.println("Computer chose Scissors, You win 😄");
         score = score + 1;
        }
         else if(user == 2) {
         System.out.println("Computer  chose Paper, You win 😄");
         score=score+1;
        }
         else if(user >= 3 || user <-1) {
         System.out.println("Wrong option");
        }
        }
        Toolkit.getDefaultToolkit().beep();
        System.out.println("Type 0 if you want to stop playing or enter 1 to continue!");
        h=ob.nextInt();
      } while(h!=0);
      System.out.println("Your final score is "+score);
      System.out.println("😄 ");
      System.out.println("                         ********************************************************************"); 
    }
    
  }
    public static void BoringMode()
   {
      {
        int computer;
        int option3;
        int user;
        int score = 0;
        int h;
        String name;
        Scanner ob =  new  Scanner(System.in);
        Random sc =  new  Random();
        System.out.println("Enter your name - ");
        name = ob.nextLine();
      do
      {
        System.out.println("Hi "+name+ "! Choose any one - 0.Stone , 1.Paper , 2.Scissors");
        user = ob.nextInt();
        System.out.println(" ");
        Toolkit.getDefaultToolkit().beep();
        computer = sc.nextInt(3);
        {
         if(user == 1)
         System.out.println("Computer also chose the same 😒 ");
         else if(user == 0)
         System.out.println("Computer also chose the same 😒 ");
         else if(user == 2)
         System.out.println("Computer also chose the same 😒 ");
         else if(user >= 3 || user <-1)
         System.out.println("Wrong option");
        }
        Toolkit.getDefaultToolkit().beep();
        System.out.println("Type 0 if you want to stop playing or enter 1 to continue!");
        h=ob.nextInt();
       } while(h!=0);
      System.out.println("Your final score is "+score);
      System.out.println(" ");
      System.out.println("                         ********************************************************************"); 
    }
    
  }
}
