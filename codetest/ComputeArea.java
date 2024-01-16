package codetest;
public class ComputeArea {
    public static void main(String[] args) {
        double radius; //declare radius
        double area; //declare area

        radius = 20;
        //Compute area
        area = radius * radius * 3.14159;
        //Display results
        System.out.println("The area for the circle of radius " + radius + " is " + area);
    }
}