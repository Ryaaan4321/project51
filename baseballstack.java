class Solution {
    public int calPoints(String[] op) {
        Stack<Integer> st=new Stack<>();
        for(String s:op){
            if(s.equals("C")){
                st.pop();
            }else if(s.equals("D")){
                st.push(2*st.peek());
            }else if(s.equals("+")){
                if(st.size()>=2){
                    int res1=st.pop();
                    int res2=st.pop();
                    int res=res1+res2;
                    st.push(res2);
                    st.push(res1);
                    st.push(res);
                }
            }else{
                st.push(Integer.parseInt(s));
            }
        }
        int ans=0;
        while(!st.isEmpty()){
            ans+=st.pop();
        }
        return ans;
        
    }
}


class Solution {
    public int calPoints(String[] operations) {
        int a[]=new int[operations.length];
        int ans=0,c=0;
        for(int i=0;i<operations.length;i++){
            if(operations[i].equals("+")) a[c++]=a[c-2]+a[c-3];
            else if(operations[i].equals("D")) a[c++]=2*a[c-2];
            else if(operations[i].equals("C")) c--;
            else a[c++]=Integer.parseInt(operations[i]);
        }
        for(int i=0;i<c;i++)
        ans+=a[i];
        return ans;
    }
}
