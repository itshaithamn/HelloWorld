package codetest;

public class TuesdayProblem {
    public static void main(String[] args) {
        //If today is Tuesday, what will be the day in 100 days?
        int a = 100 % 7;
    
        String[] daysofWeek = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        int i = a + 1;

        System.out.println(daysofWeek[i]);
    }
}
