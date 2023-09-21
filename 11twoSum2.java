class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int left=0;
        int right=numbers.length-1;
        while(left<right){
            if(numbers[left]+numbers[right]==target){
                return new int[]{left+1,right+1};
            }
            else if(numbers[left]+numbers[right]>target){
                right--;
            }else{
                left++;
            }
        }
        return new int[]{};

        
    }
}


// class Solution {
//     public int[] twoSum(int[] numbers, int target) {
//         int a[]=new int[2];
//         a[0]=a[1]=-1;
//         for(int i=0;i<numbers.length;i++){
//             for(int j=i+1;j<numbers.length;j++){
//                 if(numbers[i]+numbers[j]==target){
//                     a[0]=i;
//                     a[1]=j;
//                     return a;
//                 }
//             }
//         }
//         return a;
        
//     }
// }
// https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/description/
