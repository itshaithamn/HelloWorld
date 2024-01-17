package testedcode;
import java.util.Scanner;

public class MathExpressions {
    /*public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter weights for r, a, b, c, and d: ");
        float r = input.nextFloat();
        float a = input.nextFloat();
        float b = input.nextFloat();
        float c = input.nextFloat();
        float d = input.nextFloat();

        float ans = ( (4 / (3 * (r + 34))) - (9 * (a + (b * c))) + ((3+(d * (2 + a))) / (a + (b * d)) ));
        input.close();
        System.out.printf("The answer is: %.2f ", ans);

        
    }*/

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter weights for r and t: ");
        float r = input.nextFloat();
        float t = input.nextFloat();
        double a = r + 2.5;
        double b = 2.5 + t;
        
        if ( a >= 0){
            if(b >= 0){
                double expo = Math.pow(a, b);
                double ans = ( 5.5 * expo);
                System.out.println("The solved answer is: " + ans);
            }
       }
       input.close();
    }
    
}
