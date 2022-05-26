package com.company;
import java.util.*;

public class testTwoPointer{
    public static void main(String args[])
    {
        int[] nums4 = {8,3,2,4};
       int[] nums = {8,3,2,4};
        int target = 6;



        int[] nums2 = nums.clone();
        Arrays.sort(nums2);
        System.out.println(nums[0]);
        System.out.println(nums2[0]);
        System.out.println(nums4[0]);
        int l = 0;
        int r = nums2.length - 1;


        while (l < r){
            int sum = nums2[l] + nums2[r];
            if (sum == target){
                break;
            }else if(sum > target){
                r--;
            }else{
                l++;
            }
        }

        int nl = 0;
        int nr = 0;
        for (int i = 0; i < nums4.length; i++){
            //System.out.println(nums4[i]);
            if (nums[i] == 2){
                //System.out.println(i);
                nl = i;
            }
            if (nums[i] == nums2[r]) nr = i;
        }

        int[] nums3 = {8,3,2,4};


        for (int i = 0; i < nums3.length; i++){
            if(nums3[i] == 3){
              //  System.out.println(i);
            }
            //System.out.println(nums3[i]);

         }




    }

}
