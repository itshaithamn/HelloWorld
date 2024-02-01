package Sorts;

import java.util.Arrays;
import java.util.Random;

public class BubbleSort{
    public static void main(String[] args) throws Exception{
        int[] arr = generateRandomArray(10);
        System.out.println("Array before sorting: ");
        System.out.println(Arrays.toString(arr));

        bubbleSort(arr, arr.length-1);
        System.out.println("Array after sorting: ");
        System.out.println(Arrays.toString(arr));

        System.out.println("Is array sorted? " + isArraySorted(arr));
    }

    public static void bubbleSort(int[] arr, int n){
        if(arr == null || n <= 1){
            return;
        }
        for(int i = 0; i < n; i++){
            if(arr[i] > arr[i+1]){
                swap(arr, i, i+1);
            }
        }
        bubbleSort(arr, n-1);
    }

    public static boolean isArraySorted(int[] arr){
        if(arr == null || arr.length <=1){
            return true;
        }
        for (int i = 0; i < arr.length; i++){
            if(arr[i] > arr[i]){
                return false;
            }
        }
        return true;
    }

    public static void swap(int [] arr, int i, int j){
        if(arr == null || i < 0 || j < 0 || i >= arr.length || j >= arr.length){
            return;
        }
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static int[] generateRandomArray(int size){
        int[] arr = new int[size];
        Random random = new Random();

        for(int i = 0; i < arr.length; i++){
            arr[i] = random.nextInt(2);
        }

        return arr;
    }
}
