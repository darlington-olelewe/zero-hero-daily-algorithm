package leetcode;

import java.util.Arrays;

public class RunningSumOfOneDArray {

    public static void main(String[] args) {
        int[] answer = runningSum(new int[]{1,2,3,4});

        System.out.println(Arrays.toString(answer)); // [1,3,6,10]
    }
    static int[] runningSum(int[] nums) {
        int sum = 0;
        for(int i = 0; i < nums.length; i++){
            nums[i] = nums[i] + sum;
            sum = nums[i];
        }
        return nums;
    }
}
