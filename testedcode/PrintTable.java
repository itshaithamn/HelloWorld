public class PrintTable{
    public static void main(String[] args){
        //Define the data
        int [][] data = {
            {1, 2, (int) Math.pow(1, 2)},
            {2, 3, (int) Math.pow(2, 3)},
            {3, 4, (int) Math.pow(3, 4)},
            {4, 5, (int) Math.pow(4, 5)},
            {5, 6, (int) Math.pow(5, 6)}
        };

        //Print the table header
        System.out.println("a   b   pow(a, b)");
        
        //Print each row of data
        for (int[] row : data){
            for(int value : row){
                System.out.print(value + "   ");
            }
            System.out.println();
        }
    }

}