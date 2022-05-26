package com.company;

public class testTwoPointer{
    public static void main(String args[])
    {
        int[] nums = {10, 20, 35, 50, 75, 80};
        int target = 110;

        int l = 0;
        int r = nums.length - 1;


        while (l < r) {
            int sum = nums[l] + nums[r];
            if (sum == target) {
                System.out.println(l);
                System.out.println(r);

            }
            if (sum > target) {
                r--;

            } else {
                l++;
            }
        }



    }

}
