package Sorts;

import java.util.Arrays;
import java.util.Random;

public class AdvancedBubbleSort {
    public static void main(String[] args) throws Exception{
        int[] arr = generateRandomArray(10);
        System.out.println("Array before sorting: ");
        System.out.println(Arrays.toString(arr));

        bubbleSort2(arr);
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
    public static void bubbleSort(int[] arr){
        bubbleSort(arr, arr.length - 1);
    }

    public static void bubbleSort2(int[] arr){
        if(arr == null || arr.length <= 1){
            return;
        }
        boolean swapped;
        for(int i = 0; i < arr.length - 1; i++){
            swapped = false;
            for(int j = 0; j < arr.length - 1 - i; j++){
                if(arr[j] > arr[i]){
                    swap(arr, j, j+1);
                    swapped = true;
                } 
            }
            if(!swapped){
                break;
            }
        }
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
