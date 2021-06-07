package Base;

import java.util.Scanner;

/*
UCF COP3330 Summer 2021 Assignment 1 Solution
Copyright 2021 Alek Dussuau


Exercise 22 - Comparing Numbers
        Comparing one input to a known value is common enough, but you’ll often need to process a collection of inputs.

        Write a program that asks for three numbers. Check first to see that all numbers are different. If they’re not different, then exit the program. Otherwise, display the largest number of the three.

        Example Output
        Enter the first number: 1
        Enter the second number: 51
        Enter the third number: 2
        The largest number is 51.

        Constraint
        Write the algorithm manually. Don’t use a built-in function for finding the largest number in a list.

        Challenges
        Modify the program so that all entered values are tracked and the user is prevented from entering a number that’s already been entered.
        Modify the program so that it asks for ten numbers instead of three.
        Modify the program so that it asks for an unlimited number of numbers.
*/
public class App {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first number? ");
        String b_first = input.nextLine();
        System.out.print("Enter the second number? ");
        String b_second = input.nextLine();
        System.out.print("Enter the third number? ");
        String b_third = input.nextLine();

        int num = 0;
        int a = Integer.parseInt(b_first);
        int b = Integer.parseInt(b_second);
        int c = Integer.parseInt(b_third);

        if(a > b){
            if(a > c){
                num = a;
            }else{
                num = c;
            }
        }else{
            if(b > c){
                num = b;
            }else{
                num = c;
            }
        }

        System.out.print("The largest number is "+num);

    }
}
