public class TestCircle{
    public static void main(String[] args) {
        //Create a circle with radius 1
        Circle circle1 = new Circle();
        System.out.println("The area of the circle of radius " + circle1.radius + " is " + circle1.getArea());

        //Create a circle with radius 25
        Circle circle2 = new Circle(25);
        System.out.println("The area of the circle of radius " + circle2.radius + " is " + circle2.getArea());

        //Create a circle with radius 125
        Circle circle3 = new Circle(125);
        System.out.println("The area of the cirlce of radius " + circle3.radius + " is " + circle3.getArea());

        //Modify circle radius
        circle2.radius = 100;
        System.out.println("The area of the circle of radius " + circle2.radius + " is " + circle2.getArea());

    }
}


class Circle{
    //The radius of the circle
    double radius = 1;
    //Construct a circle object
    Circle(){
    }
    //Construct a circle object
    Circle(double newRadius){
        radius = newRadius;
    }
    //Return the area of this circle
    double getArea(){
        return radius * radius * Math.PI;
    }
    //Return perimeter of this circle
    double getPerimeter(){
        return 2 * radius * Math.PI;
    }
    //Set a new radius for this circle
    void setRadius(double newRadius){
        radius = newRadius;
    }
}