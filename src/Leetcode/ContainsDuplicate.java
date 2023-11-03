package Leetcode;

import java.util.Arrays;

public class ContainsDuplicate {
    public static void main(String[] args) {
        var result = new SolutionOfContainsDuplicate();
        result.containsDuplicate(new int[]{1,2,3,1});
    }
}

class SolutionOfContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        boolean result = false;
        for (int i = 0; i < nums.length-1; i++) {
            if (nums[i] == nums[i + 1]) {
                result = true;
                break;
            }
        }
        return result;
    }
}