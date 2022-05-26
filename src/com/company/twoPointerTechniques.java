package com.company;

public class twoPointerTechniques{
    public static void main(String args[])
    {
        int[] nums = {10, 20, 35, 50, 75, 80};
        int target = 110;
        for(int i = 0; i < nums.length; i++) {


            int l = i;
            int r = nums.length - 1;


            while (l < r) {
                int sum = nums[l] + nums[r];
                if (sum == target) {
                    System.out.println(l);
                    System.out.println(r);
                    break;

                }
                if (sum > target) {
                    r--;

                } else {
                    l++;
                }
            }

        }

    }

}
