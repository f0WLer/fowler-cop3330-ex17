import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Alex Fowler
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter 1 if you are a male or 2 if you are female: ");
        int gender = scanner.nextInt();
        System.out.print("How many ounces of alcohol did you consume? ");
        double A = scanner.nextDouble();
        System.out.print("What is your weight, in pounds? ");
        double W = scanner.nextDouble();
        System.out.print("How many hours has it been since your last drink? ");
        double H = scanner.nextDouble();
        double r = (gender == 1) ? 0.73 : 0.66;

        double BAC = (A * 5.14 / W * r) - .015 * H;
        System.out.println(String.format("Your BAC is %.6f.", BAC));
        if (BAC < 0.08) {
            System.out.println("It is legal for you to drive.");
        } else {
            System.out.println("It is not legal for you to drive.");
        }
    }
}
