class Solution{
    static void insert_at_bottom(Stack<Integer> s, int x){
        // if stack is empty, add the element at the bottom
        if(s.size()==0){
            s.add(x);
        }
        else{
            // store the top element of the stack
            int y= s.peek();
            // remove the top element
            s.pop();
            // recursively insert the element at the bottom
            insert_at_bottom(s, x);
            // add the stored element back to the stack
            s.add(y);
        }
    }
    static void fun(Stack<Integer> s){
        // if stack is not empty
        if(s.size()>0){
            // store the top element of the stack
            int x=s.peek();
            // remove the top element
            s.pop();
            // recursively reverse the remaining elements in the stack
            fun(s);
            // insert the stored element at the bottom of the reversed stack
            insert_at_bottom(s, x);
        }
    }
    static void reverse(Stack<Integer> s)
    {
        // reverse the given stack
        fun(s);
    }

}