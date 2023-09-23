class Solution {
    public int maxDepth(String s) {
        Stack<String> st=new Stack<>();
        int max=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                st.push("(");
                if(st.size()>max)
                max=st.size();
            }
            else if(s.charAt(i)==')'){
                st.pop();
            }
        }
        return max;
        
    }
}
