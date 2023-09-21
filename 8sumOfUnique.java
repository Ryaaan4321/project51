class Solution {
    public int sumOfUnique(int[] nums) {
        HashMap<Integer,Integer> mpp = new HashMap<>();
        int ans=0;
        for(int i=0;i<nums.length;i++){
            mpp.put(nums[i],mpp.getOrDefault(nums[i],0)+1);
            if(mpp.get(nums[i])==1){
                ans+=nums[i];
            }
            if(mpp.get(nums[i])==2){
                ans-=nums[i];
            }
        }
        return ans;
        
    }
}
/*
The approach of the code is to find the sum of unique elements in an array nums. To achieve this, the code uses a HashMap to store the frequency of each element in the array. It then iterates through the elements of the array and performs the following steps:

It adds the element to the HashMap, with its frequency value set to 1 or incremented by 1 if the element is already in the HashMap.
If the frequency of the element is 1, it adds the value of the element to the result variable ans.
If the frequency of the element is 2, it subtracts the value of the element from the result variable ans.
After the iteration, the result variable ans will contain the sum of all unique the elements

*/
