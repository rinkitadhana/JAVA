package Leetcode;

import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {
        var result = new SolutionOfTwoSum();
        System.out.println(Arrays.toString(result.twoSum(new int[]{1, 2, 3}, 3)));
    }
}
class SolutionOfTwoSum {
    public int[] twoSum(int[] nums, int target) {
        int num1=0;
        int num2=0;
        for(int i=0;i<nums.length-1;i++) {
            for (int j=i+1;j<nums.length;j++) {
                if (nums[i]+nums[j]==target) {
                    num1=i;
                    num2=j;
                    break;
                }
            }
        }
        return new int[]{num1,num2};
    }
}
