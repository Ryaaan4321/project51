class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int n=nums.length;
        int i=0;
        int prod=1;
        int cnt=0;

        for(int j=0;j<n;j++){
            prod*=nums[j];
            if(prod>=k){
                while(prod>=k && i<n){
                    prod/=nums[i];
                    i++;
                }
            }
            if(prod<k) cnt+=(j-i+1);
        }
        return cnt;
        
    }
}
// https://leetcode.com/problems/subarray-product-less-than-k/
// [1,2,3,4,5] this code is not working for this test case only so do consider to check out why ths code is not working for
// this test case


