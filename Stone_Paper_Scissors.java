import java.util.*;
import java.awt.*;
public class Stone_Paper_Scissors
{  
   public static void  main()
    {
        int computer;
        int option2;
        int option3;
        int user;
        int user2;
        int user3;
        int j;
        int score = 0;
        String name;
        Scanner ob =  new  Scanner(System.in);
        Random sc =  new  Random();
        System.out.println("Enter your name - ");
        name = ob.nextLine();
        System.out.println("Hi "+name+ "! Choose any one - 0.Stone , 1.Paper , 2.Scissors (The game will automatically let you to play Thrice!)");
        user = ob.nextInt();
        Toolkit.getDefaultToolkit().beep();
        computer = sc.nextInt(3);
        if (user == 0 && computer == 0) {
            System.out.println("Computer also chose the same");
        }
        else if (computer == 1 && user == 1) {
            System.out.println("Computer also chose the same");
        }
        else if (computer == 2 && user == 2) {
            System.out.println("Computer also chose the same");
        }
        else if (computer == 0 && user == 1) {
            System.out.println("Computer chose Stone,"+name+" wins!");
            score = score+1;
        }
        else if (computer == 0 && user == 2) {
            System.out.println("Computer chose Stone, You lose!");
        }
        else if (computer == 1 && user == 2) {
            System.out.println("Computer chose Paper,"+name+" wins!");
            score = score+1;
        }
        else if (computer == 1 && user == 0) {
            System.out.println("Computer chose Paper, You lose!");
        }
        else if (computer == 2 && user == 0) {
            System.out.println("Computer chose Scissors,"+name+" wins!");
            score = score+1;
        }
        else if (computer == 2 && user == 1) {
            System.out.println("Computer chose Scissors, You lose");
        }
        else {
            System.out.println("Wrong option "+name+" try again");
            System.exit(0);
        }
        System.out.println("                             Your current score is "+score);
        Toolkit.getDefaultToolkit().beep();
        int k;
        System.out.println("Second Chance!");
        Scanner fg =  new  Scanner(System.in);
        Random gh =  new  Random();
        System.out.println("Choose any one - 0.Stone , 1.Paper , 2.Scissors (The game will automatically let you to play two more times!)");
        user2 = fg.nextInt();
        computer = gh.nextInt(3);
        if (user2 == 0 && computer == 0) {
            System.out.println("Computer also chose the same");
        }
        else if (computer == 1 && user2 == 1) {
            System.out.println("Computer also chose the same");
        }
        else if (computer == 2 && user2 == 2) {
            System.out.println("Computer also chose the same");
        }
        else if (computer == 0 && user2 == 1) {
            System.out.println("Computer chose Stone,"+name+" wins!");
            score = score+1;
        }
        else if (computer == 0 && user2 == 2) {
            System.out.println("Computer chose Stone, You lose!");
        }
        else if (computer == 1 && user2 == 2) {
            System.out.println("Computer chose Stone,"+name+" wins!");
            score = score+1;
        }
        else if (computer == 1 && user2 == 0) {
            System.out.println("Computer chose Paper, You lose!");
        }
        else if (computer == 2 && user2 == 0) {
            System.out.println("Computer chose Stone,"+name+" wins!");
            score = score+1;
        }
        else if (computer == 2 && user2 == 1) {
            System.out.println("Computer chose Scissors, You lose");
        }
        else {
            System.out.println("Wrong option, try again");
            System.exit(0);
        }
        System.out.println("                            Your current score is "+score);
        Toolkit.getDefaultToolkit().beep();
        Toolkit.getDefaultToolkit().beep();
        System.out.println("Last Chance!");
        Scanner oj =  new  Scanner(System.in);
        Random ku =  new  Random();
        System.out.println("Choose any one - 0.Stone , 1.Paper , 2.Scissors (The game will automatically let you to play once more!)");
        user3 = oj.nextInt();
        computer = ku.nextInt(3);
        if (user3 == 0 && computer == 0) {
            System.out.println("Computer also chose the same");
        }
        else if (computer == 1 && user3 == 1) {
            System.out.println("Computer also chose the same");
        }
        else if (computer == 2 && user3 == 2) {
            System.out.println("Computer also chose the same");
        }
        else if (computer == 0 && user3 == 1) {
            System.out.println("Computer chose Stone,"+name+" wins!");
              score = score+1;
        }
        else if (computer == 0 && user3 == 2) {
            System.out.println("Computer chose Stone, You lose!");
        }
        else if (computer == 1 && user3 == 2) {
            System.out.println("Computer chose Stone,"+name+" wins!");
              score = score+1;
        }
        else if (computer == 1 && user3 == 0) {
            System.out.println("Computer chose Paper, You lose!");
        }
        else if (computer == 2 && user3 == 0) {
            System.out.println("Computer chose Stone,"+name+" wins!");
              score = score+1;
        }
        else if (computer == 2 && user3 == 1) {
            System.out.println("Computer chose Scissors, You lose");
        }
        else {
            System.out.println("Wrong option, try again");
            System.exit(0);
        }
        System.out.println("                                         Your final score is "+score);
        Toolkit.getDefaultToolkit().beep();
        Toolkit.getDefaultToolkit().beep();
    }
}