class CustomStack {

    int max= 0;
    Stack<Integer> s1= new Stack<>();
    
    public CustomStack(int maxSize) {
        max= maxSize;
    }
    
    public void push(int x) {
        if( s1.size() < max ){
            s1.push(x);
        }
    }
    
    public int pop() {
        
        if(s1.size() > 0){
            return s1.pop();
        }
        else{
            return -1;
        }
    }
    
    public void increment(int k, int val) {
        Stack<Integer> s2= new Stack<>();
        
        while(!s1.isEmpty()){
            s2.push(s1.pop());
        }
        
        for(int i=0; i<k; i++){
            if(s2.size() == 0){
                break;
            }
            
            s1.push(s2.pop()+val);
        }
        
        while(s2.size() != 0){
            s1.push(s2.pop());
        }
    }
}
