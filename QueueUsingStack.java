class MyQueue {
    Stack<Integer> original;
    Stack<Integer> reversed;
    public MyQueue() {
        original= new Stack<>();
    }
    
    public void push(int x) {
        original.push(x);
    }
    
    public int pop() {
        int number=0;
        reversed= new Stack<>();
        while(!original.isEmpty()){
            reversed.push(original.pop());
        }
        if(!reversed.isEmpty()){
             number= reversed.pop();
        }
       while(!reversed.isEmpty()){
            original.push(reversed.pop());
            
        }
        return number;

    }
    
    public int peek() {
        int number=0;
        reversed= new Stack<>();
        while(!original.isEmpty()){
            reversed.push(original.pop());
        }
        if(!reversed.isEmpty()){
             number= reversed.peek();
        }
       while(!reversed.isEmpty()){
            original.push(reversed.pop());
        }
         return number;
    }
    
    public boolean empty() {
         if(!original.isEmpty()){
            return false;
        }
        return true;
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */
