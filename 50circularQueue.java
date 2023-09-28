class MyCircularQueue {
    ArrayList<Integer> arr = new ArrayList<Integer>();
    int size;
    public MyCircularQueue(int k) {
        size=k;
    }
    
    public boolean enQueue(int value) {
        if(arr.size()<size)
        {
            arr.add(value);
            return true;
        }
        return false;
    }
    
    public boolean deQueue() {
        if(arr.size()>0)
        {
            arr.remove(0);
            return true;
        }
        return false;
    }
    
    public int Front() {
        if(arr.size()>0)
        return arr.get(0);
        return -1;
    }
    
    public int Rear() {
        if(arr.size()>0)
        return arr.get(arr.size()-1);
        return -1;
    }
    
    public boolean isEmpty() {
        if(arr.size()==0)
        return true;
        return false;
    }
    
    public boolean isFull() {
        if(arr.size()==size)
        return true;
        return false;
    }
}

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */
