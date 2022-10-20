package com.bbj;

public class ReverseArrayProblem {

    // no need for extra memory (in-place algorithm)
    // O(N/2) = O(N) linear
    public int[] solve(int[] nums) {

        if (nums == null || nums.length <= 1) return nums;
        int lowIndex = 0;
        int highIndex = nums.length - 1;
        while (lowIndex < highIndex) {
            swap(nums, lowIndex, highIndex);
            lowIndex++;
            highIndex--;
        }
        return nums;
    }

    private void swap(int[] nums, int lowIndex, int highIndex) {
        int temp = nums[lowIndex];
        nums[lowIndex] = nums[highIndex];
        nums[highIndex] = temp;
    }
}
