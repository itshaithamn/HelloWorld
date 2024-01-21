import java.util.Scanner;

public class Q_rsqrt{
    public static float Q_rsqrt(float number) {
            float x2 = number * 0.5F;
            float y = number;
            
            y = Float.intBitsToFloat(0x5f3759df - (Float.floatToIntBits(y) >> 1));

            y = y * (1.5F - (x2 * y * y)); // Newton's method iteration
            return y;
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter in a value for x: ");
        float x = input.nextFloat();
        
        float result = Q_rsqrt(x);
        System.out.println("1/sqrt(" + x + ") is: " + result);
        input.close();
    }
}