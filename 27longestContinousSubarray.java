class Solution {
    public int longestSubarray(int[] nums, int limit) {
        PriorityQueue<Integer> min = new PriorityQueue<>();
        PriorityQueue<Integer> max = new PriorityQueue<>((a,b)->Integer.compare(b,a));
        int a=0,b=0;
        int res = 0;
        while(b<nums.length){
            min.add(nums[b]);
            max.add(nums[b]);
            while(Math.abs(max.peek()-min.peek()) >limit){

               
                
                min.remove(nums[a]);
                max.remove(nums[a]);
                a++;
            }
           
            res = Math.max(b-a+1,res);
            b++;
        }
        return res;
    }
}
// class Solution {
//     public int longestSubarray(int[] nums, int limit) {
//         int low=nums[0];
//         int high=nums.length-1;
//         int i=0;
//         int j=nums.length-1;

//         while(low<=high){
//             int mid=(low+high)/2;
//             if(mid==limit){
//                 return j-i;

//             }else if(mid>limit){
//                 high=mid-1;
//                 j--;
//             }else{
//                 low=mid+1;
//                 i++;
//             }
//         }
//         return j-i;
        
//     }
//  }
