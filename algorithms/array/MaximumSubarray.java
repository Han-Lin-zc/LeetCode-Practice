package algorithms.array;

/*
Find the contiguous subarray within an array (containing at least one number) which has the largest sum.
 For example, given the array [-2,1,-3,4,-1,2,1,-5,4], the contiguous subarray [4,-1,2,1] has the largest sum = 6.
*/

public class MaximumSubarray {
    public int maxSubArray(int[] nums) {
        if (nums.length == 1) return nums[0];
        int result = nums[nums.length - 1];
        for (int i = nums.length - 2; i >= 0; i--) {
            nums[i] = Math.max(nums[i], nums[i] + nums[i + 1]);
            result = Math.max(nums[i], result);
        }
        return result;
    }
}