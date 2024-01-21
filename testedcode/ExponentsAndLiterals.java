import java.util.Scanner;

public class ExponentsAndLiterals {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a base number: ");
        double a = input.nextDouble();
        System.out.print("Enter a exponent: ");
        double b = input.nextDouble();

        System.out.println(Math.pow(a, b));
        
        input.close();
    }
}
