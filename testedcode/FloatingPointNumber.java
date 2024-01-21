import java.util.Scanner;

public class FloatingPointNumber{
    public static void main(String[] args) {
        float a = 25/4f; //f must be included for result to come out as a decimal
        System.out.printf("Result is: %.2f", a);
        notmain();
    }
    
    static void notmain() {
        System.out.println(2 * (5 / 2 + 5 / 2));
        System.out.println(2 * 5 / 2 + 2 * 5 / 2);
        System.out.println(2 * (5 / 2));
        System.out.println(2 * 5 / 2);

        System.out.println("25 / 4 is " + 25 / 4);
        System.out.println("25 / 4.0 is " + 25 / 4.0);
        System.out.println("3 * 2 / 4 is " + 3 * 2 / 4);
        System.out.println("3.0 * 2 / 4 is " + 3.0 * 2 / 4);

        float b = 3.5f;
        System.out.println(Math.pow(2, b));

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a value for m: ");
        int m = input.nextInt();
        System.out.print("Enter a value for r: ");
        int r = input.nextInt();

        System.out.println("The result of mr^2 is: " + m * (Math.pow(r, 2)));

        input.close();
    }
}

