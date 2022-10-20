package com.bbj;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        ReverseArrayProblem reverseArrayProblem = new ReverseArrayProblem();

        int[] nums = {1, 2, 3, 4, 5};
        System.out.println("nums: "+ Arrays.toString(nums));
        int[] revNums = reverseArrayProblem.solve(nums);
        System.out.println("reversed: "+Arrays.toString(revNums));
    }
}