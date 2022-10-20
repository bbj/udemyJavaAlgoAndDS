package com.bbj;

public class App {
    public static void main(String[] args) {

        // arrays are not dynamic data structures
        // we have to define the size in advance
        int[] nums = new int[10];

        // random indexing: we can use the indexes of the array slots
        // O(1)
        for (int i=0; i<10; i++)
            nums[i] = i;

        // we know the index of the item we want to manipulate
        nums[0] = 100;

        // if we do not know the index of the item (search)
        // LINEAR SEARCH O(N)
        // we want to find the index of item 6

        for (int i=0; i<10; i++)
            if (nums[i]==6)
                System.out.println("found at index="+i);

        for (int i=0; i<10; i++)
            System.out.println(nums[i]);
    }
}
