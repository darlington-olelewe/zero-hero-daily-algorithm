package leetcode;

import java.util.Arrays;

/**
 * 189. Rotate Array
 * Medium
 * Given an array, rotate the array to the right by k steps, where k is non-negative.
 *
 * Example 1:
 *
 * Input: nums = [1,2,3,4,5,6,7], k = 3
 * Output: [5,6,7,1,2,3,4]
 * Explanation:
 * rotate 1 steps to the right: [7,1,2,3,4,5,6]
 * rotate 2 steps to the right: [6,7,1,2,3,4,5]
 * rotate 3 steps to the right: [5,6,7,1,2,3,4]
 * Example 2:
 *
 * Input: nums = [-1,-100,3,99], k = 2
 * Output: [3,99,-1,-100]
 * Explanation:
 * rotate 1 steps to the right: [99,-1,-100,3]
 * rotate 2 steps to the right: [3,99,-1,-100]
 */


public class RotateArray {
    public static void main(String[] args) {

        int[] nums = new int[]{1,2,3,4,5,6,7};
        System.out.println("Started");
        System.out.println(Arrays.toString(nums));
        rotate(nums,3);
        System.out.println("finished");
        System.out.println(Arrays.toString(nums));
    }

    static void rotate(int[] nums, int k){

        int length = nums.length;

        int[] newArr = nums.clone();

        k = k % length;

        int indexToStart = length - k;
        int indexToEnd = indexToStart;

        int count = 0;

        for(; indexToStart < nums.length; indexToStart++, count++){
            nums[count] = newArr[indexToStart];
        }

        for(int i = 0; i < indexToEnd; i++, count++){
            nums[count] = newArr[i];
        }

    }
}
