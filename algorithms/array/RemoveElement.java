package algorithms.array;

/*
Given an array and a value, remove all instances of that value in place and return the new length.
The order of elements can be changed. It doesn't matter what you leave beyondthe new length.

Basically finding the new length of the array. 
Any values that is not the value that needs to be remove, add it to the new array, getting the new length of the array.

*/

public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        int index = 0; 
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[index++] = nums[i];
            }
        }
        return index;
    }
}