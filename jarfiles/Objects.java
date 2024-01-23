import edu.Home;

public interface Objects {
    public static final int i = 0; //By default final keyword is defined to a variable (public static final)
    public abstract void test(); //Public abstract method by default

    public static void main(String[] args) {
        Home h = new Home(100);
        System.out.println(h);
    }
}