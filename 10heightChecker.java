class Solution {
    public int heightChecker(int[] heights) {
        int a[]=Arrays.copyOf(heights,heights.length);
        Arrays.sort(a);
      /*
      nothing just made the copy of the array and then traversing in it if it is equal then incementing the count
      and in the end return the count
      
        
      */

        int c=0;
        for(int i=0;i<heights.length;i++){
            if(heights[i]!=a[i]){
                c++;
            }
        }
        return c;
        
    }
}


// only ruuned for 2 test casess

// class Solution {
//     public int heightChecker(int[] heights) {
//         int prev=heights[0];
//         int cur=1;
//         int ans=1;
//         for(int i=1;i<heights.length;i++){
//             if(heights[i]!=prev){
//                 cur++;
//             }else if(heights[i]==prev){
//                 cur=1;
//             }
//             ans=Math.max(ans,cur);
//         }
//         return ans;
        
//     }
// }

// https://leetcode.com/problems/height-checker/
