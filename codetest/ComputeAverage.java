package codetest;
import java.util.Scanner;

public class ComputeAverage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //prompt the user to input 3 numbers
        System.out.print("Enter 3 numbers: ");
        double num1 = input.nextDouble();
        double num2 = input.nextDouble();
        double num3 = input.nextDouble();

        //compute average
        double average = (num1 + num2 + num3) / 3;

        System.out.println("The average of " + num1 + " " + num2 + " " + num3 + " is " + average);

        input.close();
    }


}