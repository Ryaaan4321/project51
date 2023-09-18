class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        HashSet<Character> mpp=new HashSet<>();
        for(char ch:allowed.toCharArray()){
            mpp.add(ch);
        }
        int cnt=0;
        for(String str:words){
            int i=0;
            for(char ch:str.toCharArray()){
                if(!mpp.contains(ch))break;
                i++;
            }
            if(i==str.length())cnt++;
        }
        return cnt;

        
    }
}
https://leetcode.com/submissions/detail/1053030503/


