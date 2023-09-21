class Solution {
    public int[] numberOfPairs(int[] nums) {
        Arrays.sort(nums);
        int pairs=0;
        for(int i=0;i<nums.length;i++){
            if(i>0 && nums[i]==nums[i-1]){
                /*
                Now checking for the duplicate and if
                 we have found one then changing their 
                 values out of the range of nums[i] 
                 so that they cannot be used again for pairing
                */
                nums[i]=-1;
                nums[i-1]=-1;
                pairs++;
            }
        }
        return new int[] {pairs , nums.length-(2*pairs)};
        
    }
}
// https://leetcode.com/problems/maximum-number-of-pairs-in-array/
