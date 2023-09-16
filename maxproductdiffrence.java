class Solution {
    public int maxProductDifference(int[] a) {
       Arrays.sort(a);
       int f=a[0]*a[1];
       int b=a[a.length-1]*a[a.length-2];
       return b-f;
        
    }
}
