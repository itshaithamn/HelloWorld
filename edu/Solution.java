package edu;

public class Solution{
    public static void main(String[] args){
        int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};

        int a = removeDuplicates(nums);
        System.out.println("Unique values are: " + a);
    }

    public static int removeDuplicates(int[] nums){
        int a = 0;
        int b = 1;

        while(b < nums.length){
            if(nums[a] != nums[b]){
                a++;
                nums[a] = nums[b];
            }
            b++;
        }
        return a + 1;
    }
}