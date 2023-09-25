class Solution {
    public int maxSubarraySumCircular4(int[] nums) {
        int curMax = 0;
        int curMin = 0;
        int maxSum = nums[0];
        int minSum = nums[0];
        int totalSum = 0;
        
        for (int num: nums) {
            // Normal Kadane's
            curMax = Math.max(curMax, 0) + num;
            maxSum = Math.max(maxSum, curMax);
            
            // Kadane's but with min to find minimum subarray
            curMin = Math.min(curMin, 0) + num;
            minSum = Math.min(minSum, curMin);
            
            totalSum += num;  
        }

        if (totalSum == minSum) {
            return maxSum;
        }
        
        return Math.max(maxSum, totalSum - minSum);
    }


    public int maxSubarraySumCircular3(int[] nums) {
        final int n=  nums.length;
        final int[] rightmax=new int[n];

        rightmax[n-1]=nums[n-1];
        int suffixsum=num[n-1];

        for(int i=n-2;i>=0;--i){
            suffixsum+=nums[i];
            rightmax[i]=Math.max(rightmax[i+1] , suffixsum);
        }

        int maxsum=nums[0];
        int specialsum=nums[0];

        int curmax=0;
        for(int i=0;prefixsum=0;i<n;i++){
            curmax=Math.max((curmax,0)+nums[i]);
            maxsum=Math.max(maxsum,curmax);


            if(i+1<n){
                specialsum=Math.max(specialsum,prefixsum+rightmax(i+1));
            }
        }
        return Math.max(maxsum,specialsum);

    }
   



 public int maxSubarraySumCircular2(int[] nums) {
        int curmax=nums[0];
        int maxsum=nums[0];

        for(int i=1;i<nums.length;i++){
            int num=nums[i];
            curmax=Math.max(num,curmax+num);
            maxsum=Math.max(maxsum,curmax);
        }
        return maxsum; 65 test cases
    }



    public int maxSubarraySumCircular1(int[] nums) {
        int low=0;
        int maxi=Integer.MIN_VALUE;
        int high=nums.length-1;
        Arrays.sort(nums);
        while(low<=nums.length-1 && high >=0){
            int sum=low+high;
            if(low+high>maxi){
                maxi=Math.max(maxi,sum);
                return maxi;
                
                 4 TEST CASESS
            }else if(low+high > maxi){
                high--;


            }else{
                low++;
            }
        }
        return maxi;
        
    }

}
