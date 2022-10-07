/**
 * This is a calculator for different functions like Addition, Random, Average, Cube, Log ,Absolute Value Etc:- 
 * This program is made with Scanner class.
 * Designed by Samuel Joseph.
 * Version - 5.1.1 Last updated on 2nd February, 2020 at 20:40. 
 * Added password - Password is now required to use the calculator and 1 can be entered to use the calculator again.
 */
import java.awt.*;
import java.util.*;
public class Calculator
{
    static public void Calculator()
   {
        Scanner ob =  new  Scanner(System.in);
        Random sc =  new  Random();
        double option;
        double a;
        double b;
        double add;
        double subtract;
        double multiply;
        double divide;
        double average;
        double remainder;
        double squarer;
        double square2r;
        double cuber;
        double cube2r;
        double square;
        double square2;
        double cube;
        double cube2;
        double round;
        double round2;
        double Max;
        double Min;
        double random;
        double Log;
        double log2;
        double random2;
        double identity;
        double identity2;
        double identity3;
        double identity4;
        double random3;
        double random4;
        double random5;
        double random6;
        double random62;
        double dice;
        double absolute;
        double absolute2;
        double random7;
        int password;
        int attempts = 0;
        int option2 = 0;
        String option3;
        do
        {
          do{
            System.out.println("Enter the password -");
            password = ob.nextInt();
            if (password !=5981)
            {
               System.out.println("Wrong password!");
               Toolkit.getDefaultToolkit().beep();
               ++attempts;
            }
             else
            {
            System.out.println("Enter first number -");
            a = ob.nextDouble();
            System.out.println("Enter second number -");
            b = ob.nextDouble();
            System.out.println(" |-------------------------------------|");
            System.out.println(" | What do you want to do?             |");
            System.out.println(" | 1.Add                               |");
            System.out.println(" | 2.Subtract                          |");
            System.out.println(" | 4.Divide                            |");
            System.out.println(" | 5.Find Average                      |");
            System.out.println(" | 6.Find Remainder                    |");
            System.out.println(" | 7.Square root                       |");
            System.out.println(" | 8.Cube root                         |");
            System.out.println(" | 9.Square                            |");
            System.out.println(" | 10.Cube                             |");
            System.out.println(" | 11.Round off decimal                |");
            System.out.println(" | 12.Largest number                   |");
            System.out.println(" | 13.Smallest number                  |");
            System.out.println(" | 14.Random number upto 100           |");
            System.out.println(" | 15.Log                              |");
            System.out.println(" | 16.Random number upto 1000          |");
            System.out.println(" | 17.Identities (a+b)2                |");
            System.out.println(" | 18.Identities (a-b)2                |");
            System.out.println(" | 19.Identities (a+b)3                |");
            System.out.println(" | 20.Identities (a-b)3                |");
            System.out.println(" | 21.Random number upto 10000         |");
            System.out.println(" | 22.Random numbers upto First number |");
            System.out.println(" | 23.Random numbers upto second number|");
            System.out.println(" | 24.Two random numbers               |");
            System.out.println(" | 25.Roll a dice                      |");
            System.out.println(" | 26.Absolute Value                   |");
            System.out.println(" | 27.Three random numbers             |");
            System.out.println(" | 28.All above functions              |");
            System.out.println(" |-------------------------------------|");
            option = ob.nextDouble();
            add = a + b;
            /* Addition*/
            subtract = a - b;
            /* Subtraction*/
            multiply = a * b;
            /* Multiplication*/
            divide = a / b;
            /* Division*/
            average = (a + b) / 2;
            /* Average*/
            remainder = a % b;
            /* Remainder*/
            squarer = Math.sqrt(a);
            /* Square root of first number*/
            square2r = Math.sqrt(b);
            /* Square root of second number*/
            cuber = Math.cbrt(a);
            /* Cube root of first number*/
            cube2r = Math.cbrt(b);
            /* Cube root of second number*/
            square = Math.pow(a, 2);
            /* Square of first number*/
            square2 = Math.pow(b, 2);
            /* Square of second number*/
            cube = Math.pow(a, 3);
            /* Cube of first number*/
            cube2 = Math.pow(b, 3);
            /* Cube of second number*/
            round = Math.round(a);
            /* Round off first decimal*/
            round2 = Math.round(b);
            /* Round off second decimal*/
            Max = Math.max(a, b);
            /* Largest number*/
            Min = Math.min(a, b);
            /* Smallest number*/
            Log = Math.log(a);
            /* Log of first number*/
            log2 = Math.log(b);
            /* Log of second number*/
            random = sc.nextInt(101);
            /* Random numbers upto 100*/
            random2 = sc.nextInt(1001);
            /* Random numbers upto 1000*/
            identity = (a * a) + (b * b) + 2 * (a * b);
            /* Identity (a+b)2*/
            identity2 = (a * a) + (b * b) - 2 * (a * b);
            /* Identity (a-b)2*/
            identity3 = (a * a * a) + (b * b * b) + 3 * (a * a) * b + 3 * a * (b * b);
            /* Identity (a+b)3*/
            identity4 = (a * a * a) + (b * b * b) - 3 * (a * a) * b + 3 * a * (b * b);
            /* Identity (a+b)3*/
            random3 = sc.nextInt(1001);
            /* Random numbers upto 10000*/
            random4 = sc.nextInt((int)a);
            random7 = sc.nextInt(1001);
            random6 = sc.nextInt(1001);
            /*Random number upto 1000*/
            random62 = sc.nextInt(1001);
            /*Random number upto 1000*/
            dice = sc.nextInt(7);
            /*Random number for dice*/
            absolute = Math.abs(a);
            /*Absolute Value of first number*/
            absolute2 = Math.abs(b);
            /*Absolute Value of second number*/
           if (option == 1) {
            System.out.println("Sum is = " + add);
           }
           else if (option == 2) {
            System.out.println("Difference is = " + subtract);
           }
           else if (option == 3) {
            System.out.println("Product is = " + multiply);
           }
           else if (option == 4) {
            System.out.println("Quotient is = " + divide);
           }
           else if (option == 5) {
            System.out.println("Average is = " + average);
           }
           else if (option == 6) {
            System.out.println("Remainder is = " + remainder);
           }
           else if (option == 7) {
            System.out.println("Square root of First Number is = " + squarer + "and Square root of Second Number is = " + square2r);
           }
           else if (option == 8) {
            System.out.println("Cube root of First Number is = " + cuber + "and Cube root of Second number is = " + cube2r);
           }
           else if (option == 9) {
            System.out.println("Square of First number is = " + square + "and Square of Second number is = " + square2);
           }
           else if (option == 10) {
            System.out.println("Cube of First number is = " + cube + "and Cube of Second number is = " + cube2);
           }
           else if (option == 11) {
            System.out.println("First number is =" + round + " and Second number = " + round2);
           }
           else if (option == 12) {
            System.out.println("The largest number = " + Max);
           }
           else if (option == 13) {
            System.out.println("The smallest number = " + Min);
           }
           else if (option == 14) {
            System.out.println("Random number is = " + random);
           }
           else if (option == 15) {
            System.out.println("The log of first number is = " + Log + " and log of second number is " + log2);
           }
           else if (option == 16) {
            System.out.println("Random number is = " + random2);
           }
           else if (option == 17) {
            System.out.println("The answer is = " + identity);
           }
           else if (option == 18) {
            System.out.println("The answer is = " + identity2);
           }
           else if (option == 19) {
            System.out.println("The answer is = " + identity3);
           }
           else if (option == 20) {
            System.out.println("The answer is = " + identity4);
           }
           else if (option == 21) {
            System.out.println("Random number = " + random3);
           }
           else if (option == 22) {
            System.out.println("Random number = " + random4);
           }

           else if (option == 23) {
            System.out.println("Two random numbers are " + random6 + " and " + random62);
           }
           else if (option == 2) {
            System.out.println("The number on the dice is "+dice);
           }
           else if(option == 26) {
            System.out.println("Absolute value of first number is "+absolute+" and second number is "+absolute2);
           }
           else if(option == 27) {
            System.out.println("Three random numbers are "+(int)random6+","+(int)random3+","+(int)random7);
            }
            else if (option == 28) {
            System.out.println("Difference is = " + subtract);
            System.out.println("Product is = " + multiply);
            System.out.println("Quotient is = " + divide);
            System.out.println("Average is = " + average);
            System.out.println("Remainder is = " + remainder);
            System.out.println("Square root of First Number is = " + squarer + "and Square root of Second Number is = " + square2r);
            System.out.println("Cube root of First Number is = " + cuber + "and Cube root of Second number is = " + cube2r);
            System.out.println("Square of First number is = " + square + "and Square of Second number is = " + square2);
            System.out.println("Cube of First number is = " + cube + "and Cube of Second number is = " + cube2);
            System.out.println("First number is =" + round + " and Second number = " + round2);
            System.out.println("The largest number = " + Max);
            System.out.println("The smallest number = " + Min);
            System.out.println("Random number is = " + random);
            System.out.println("The log of first number is = " + Log + " and log of second number is " + log2);
            System.out.println("Random number is = " + random2);
            System.out.println("The answer is = " + identity);
            System.out.println("The answer is = " + identity2);
            System.out.println("The answer is = " + identity3);
            System.out.println("The answer is = " + identity4);
            System.out.println("Random number = " + random3);
            System.out.println("Two random numbers are " + random6 + " and " + random62);
            System.out.println("The number on the dice is "+dice);
            System.out.println("Absolute value of first number is "+absolute+" and second number is "+absolute2);
            System.out.println("Three random numbers are "+(int)random6+","+(int)random3+","+(int)random7);
            }
            else 
            {
            System.out.println("Wrong option");
            System.exit(0);
            }
            Toolkit.getDefaultToolkit().beep();
            ++attempts;
            System.out.println("Enter 1 to use the calculator again or 0 to exit");
            option2 = ob.nextInt();
         }
       }while(attempts == 0);
     }while(option2 == 1);
     System.out.println("Thank you for using the calculator!");
   }
}