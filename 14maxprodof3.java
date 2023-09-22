class Solution {
    public int maximumProduct(int[] nums) {
        int n=nums.length;
        Arrays.sort(nums);
        int prod=nums[0]*nums[1]*nums[n-1];
        int prod1=nums[n-1]*nums[n-2]*nums[n-3];
        int val = prod>prod1?prod:prod1;
        return  val;
        
    }
}
// https://leetcode.com/problems/maximum-product-of-three-numbers/description
