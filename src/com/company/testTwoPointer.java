package com.company;
import java.util.*;

public class testTwoPointer{
    public static void main(String args[])
    {
        int[] nums = {3,1,2,4,6};
        int target = 6;



        int[] nums2 = nums;
        Arrays.sort(nums2);
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
        for (int i = 0; i < nums.length; i++){
            if (nums[i] == nums2[l]) nl = i;
            if (nums[i] == nums2[r]) nr = i;
        }



        System.out.println(nl);
        System.out.println(nr);


    }

}
