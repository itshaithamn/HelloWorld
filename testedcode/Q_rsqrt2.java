import java.util.Scanner;

public class Q_rsqrt2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a value for x in 1/sqrt(x): ");
        double x = input.nextDouble();
        double i = 1 / Math.sqrt(x);
        System.out.println("The square root of " + x + " is: " + i);
        input.close();
    }
}
