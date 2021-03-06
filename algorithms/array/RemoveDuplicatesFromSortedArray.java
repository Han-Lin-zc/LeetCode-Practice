package algorithms.array;

/*
Given a sorted array, remove the duplicates in place such that each element appear only once and return the new length.
Do not allocate extra space for another array, you must do this in place with constant memory.

For example,
Given input array A = [1,1,2],
Your function should return length = 2, and A is now [1,2].
*/

public class RemoveDuplicatesFromSortedArray {
    public int removeDuplicates(int[] nums) {
        int i = 0; 
        for (int k = 1; k < nums.length; k++) {
            if (nums[i] != nums[k]) {
                i++; 
                nums[i] = nums[k];
            }
        }
        return i + 1;
    }
}