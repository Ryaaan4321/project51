class Solution {
    public int maxProduct(int[] nums) {
      /*
      nothing just take a one var prod and mark it as 1 initially and
      once it is done make one more var and mark it with min value
      run a loop and mul the array element with the prod and check if it is the max prod of the subarray and return itt
      and in case if prod ==0 thn again mark prod as 1 
      becuase if we dont then will make the prod to zeroooo
      */
        int maxi=Integer.MIN_VALUE;
        int prod=1;
        for(int i=0;i<nums.length;i++){
            prod*=nums[i];
            maxi=Math.max(prod,maxi);
            if(prod==0)
            prod=1;
        }
        prod=1;
        for(int i=nums.length-1;i>=0;i--){
            prod*=nums[i];
            maxi=Math.max(prod,maxi);
            if(prod==0)
            prod=1;

        }
        return maxi;
        
        
    }
}
// https://leetcode.com/problems/maximum-product-subarray/
