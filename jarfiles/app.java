package jarfiles;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Arrays;
import java.util.Random;


public class app {
    public static void main(String[] args) throws Exception {
        //System.out.println(args.length);
        //System.out.println(Arrays.toString(args));
        
        
        //double i = Double.parseDouble("123"); convert a string to an integer
        //System.out.println(i);
        
        //int [] numbers = new int[5]; //1D array

        Random rand = new Random();

        int[][] arr1 = new int[2][3]; //2D array 2 rows, 3 columns
        int[][] arr2 = new int[3][4]; //2D array 3 rows, 4 columns
        int[][] arr3 = new int[2][4]; //2D array 2 rows, 4 columns
        int i, j, k;
        for (i=0; i<arr1.length; i++){
            for(j=0; j<arr1[i].length; j++){
                arr1[i][j] = rand.nextInt(10);
            }
        }//Array traversal for arr1 2D array

        for (i=0; i<arr2.length; i++){
            for(j=0; j<arr2[i].length; j++){
                arr2[i][j] = rand.nextInt(10);
            }
        }//Array traversal for arr2 2D array

        for (i=0; i<arr3.length; i++){
            for(j=0; j<arr3[i].length; j++){//Array traversal for arr3 2D array
                arr3[i][j] = 0;
                for (k =0; k<arr1[i].length; k++ ){
                    arr3[i][j] += arr1[i][k] * arr2[k][j]; //Solving the matrices to equal arr3 (arr3 + arr1 * arr2 = arr3) 
                    //Notice, arr3 does not have a rand function
                }
            }
        }

        //Array traversals from lines 48-59 are printing out the result of previous code
        System.out.println("Matrix 1: ");
        for(i=0; i<arr1.length; i++){
            System.out.println(Arrays.toString(arr1[i]));
        }
        System.out.println("Matrix 2: ");
        for(i=0; i<arr2.length; i++){
            System.out.println(Arrays.toString(arr2[i]));
        }
        System.out.println("Matrix 3: ");
        for(i=0; i<arr3.length; i++){
            System.out.println(Arrays.toString(arr3[i]));
        }
        
        FileWriter writer = new FileWriter("matrix3.txt");//Initilizing function FileWriter as identifier "writer". This simply creates the file "matrix3.txt"
        BufferedWriter bw = new BufferedWriter(writer);//Initializing buffer Buffer as indentifier "bw"
        bw.write("%d %d\n".formatted(arr3.length, arr3[0].length));
        for(i=0; i<arr3.length; i++){
           for(j=0; j<arr3[i].length; j++){
                bw.write("%d".formatted(arr3[i][j]));//Writes contents in arr3 with a space for syntax
                if(j != arr3[i].length -1){//Removes unnecessary spaces
                    bw.write(" ");
                }
           }
           if (i != arr3.length - 1){//Removes unncessary lines by minusing length of arr3 by 1 to check for end of array/ end of row
            bw.write("\n");
           }
        }
        bw.close();
        
        FileReader reader = new FileReader("matrix3.txt");
        BufferedReader br = new BufferedReader(reader);
        String line = br.readLine();//Reads lines from from file matrix3.txt
        String[] size = line.split(" ");//Seperate into a new array named size
        int rows = Integer.parseInt(size[0]);
        int cols = Integer.parseInt(size[1]);
        System.out.println("%d %d".formatted(rows, cols));

        int[][] arr4 = new int[rows][cols];
        for (i = 0; i<rows; i++){
            line = br.readLine();
            String[] row = line.split(" ");
            for(j=0;j<cols;j++){
                arr4[i][j] = Integer.parseInt(row[j]);
            }
        }

        System.out.println("Matrix 4: ");
        for (i=0; i<arr4.length; i++){
            System.out.println(Arrays.toString(arr4[i]));
        }
        br.close();
    }
}
