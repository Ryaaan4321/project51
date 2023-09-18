class Solution {
    public int mostWordsFound(String[] str1) {
        int temp_count = 0;
        int count = 0;

	    for(int i=0; i<str1.length; i++){
	        String s = str1[i];
	        for(int j=0; j<s.length(); j++){
	        if(s.charAt(j) == ' '){
	            temp_count++;
	        }
	      }
	      if(temp_count > count){
	          count = temp_count;
	      }
	      temp_count = 0;
	    }
        return count+1;
    }
}
https://leetcode.com/submissions/detail/1049199560/
