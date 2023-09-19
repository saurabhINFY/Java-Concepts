import java.util.Arrays;

/*
Product of Array Except Self
Given an integer array nums, return an array answer such that answer[i] is equal to the product of all the elements of nums except nums[i].
The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.

You must write an algorithm that runs in O(n) time and without using the division operation.
Example 1:

Input: nums = [1,2,3,4]
Output: [24,12,8,6]
Example 2:

Input: nums = [-1,1,0,-3,3]
Output: [0,0,9,0,0]

TAG:- Prefix Sum

 */
public class ProductExceptSelf {
    public static int[] productExceptSelf(int[] nums) {
        int[] res = new int[nums.length];
        int[] left = new int[nums.length];
        int[] right = new int[nums.length];
        int prodLeft=1;
        for(int i=0;i<nums.length;i++){
            prodLeft = prodLeft*nums[i];
            left[i] = prodLeft;
        }
        System.out.println(Arrays.toString(left));
        int prodRight=1;
        for(int j=nums.length-1;j>0;j--){
            prodRight = prodRight * nums[nums.length-j];
            right[j] = prodRight;
        }
        System.out.println(Arrays.toString(right));
        return res;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(productExceptSelf(new int[]{1,2,3,4})));
        System.out.println(Arrays.toString(productExceptSelf(new int[]{-1,1,0,-3,3})));

    }
}
