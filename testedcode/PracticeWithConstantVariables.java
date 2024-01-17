package testedcode;

import java.util.Scanner;

public class PracticeWithConstantVariables {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        final double KILOMETERS_PER_MILE = 1.609;

        System.out.print("Enter number of miles: ");
        double miles  = input.nextDouble();

        double kilometers = miles * KILOMETERS_PER_MILE;

        System.out.println(kilometers);

        input.close();
    }
    
}
