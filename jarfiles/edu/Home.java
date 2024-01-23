package edu;
public class Home {
    int i = 0;
    String name = "Home";

    //Create a constructor
    //Constructors have no return paths
    public Home(int i){
        System.out.println("Home constructor");
        System.out.println(" i= " + i);
    }
    
    //Constructors can not have the same name unless the parameter list is different
    //Must set to public to be accessible outside this class
    public Home(){
    }
    
    void test(){
        System.out.println("Home test");
    }

}
