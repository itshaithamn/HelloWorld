package codetest;



public class SwitchStatement {
public static void main(String[] args) {
    int i = 0;
    switch (i){
        case 0:
            System.out.println(0);
            break;
        case 1:
            System.out.println(1); //Break statement must be included to prevent halting problem
            break;
        default: 
            break;
           
    }
   }
}