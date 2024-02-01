package edu;

public interface Bubblesort{

    public static final int i = 100;
    void print(); 
    public Bubblesort(){
        //constructor 
    }

    public Bubblesort(String name){
        //constructor must have same name as class name 
        //overloading
        System.out.print("Hello, " + name);
    }

    public static void main(String[] args) {
        
    }

    public static void main(){
        //overloading
    }
}


interface innerBubblesort extends Bubblesort{
    public innerBubblesort(){
        super("Test");
    }

    public static void main(String[] args) {
        
    }
}

class Test implements bubblesort, innerBublesort{
   public abstract 
}