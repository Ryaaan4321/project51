class Solution {
    public boolean isAcronym(List<String> words, String s) {
        int n = words.size(), m = s.length();

        if(m != n)
            return false;
        for(int i =0; i<n; i++)
            if(words.get(i).charAt(0) != s.charAt(i) )
                return false;
        

        return true;
        /*
        2nd way
        int i =0
        for(char c : s.toCharArray())
        {
            if(words.get(i).charAt(0) != c)
                return false;
            i++;
        }

        return true;


        another method
        class Solution {
    public boolean isAcronym(List<String> words, String s) {
        
        int j = 0 , len = s.length();
        for(String str : words)
            if(j >= len || s.charAt(j++)!= str.charAt(0)) 
                return false;
        return j == len;       
    }
}
        */
    }
}
