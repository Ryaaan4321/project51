class Solution {
    public int maxProduct(int[] nums) {
        int n=nums.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(nums[i]>nums[j]){
                    int temp=nums[i];
                    nums[i]=nums[j];
                    nums[j]=temp;
                }
            }
        }
        return (nums[nums.length-1]-1)*(nums[nums.length-2]-1);
        
    }
}
https://leetcode.com/problems/maximum-product-of-two-elements-in-an-array/
