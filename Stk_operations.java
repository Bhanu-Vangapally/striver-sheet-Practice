// User function Template for Java

class Geeks {
    // Function to push an element into the stack.
    public static void insert(Stack<Integer> st, int x) {
        // Your code here
        st.push(x);
        
    }

    // Function to remove top element from stack.
    public static void remove(Stack<Integer> st) {
        
        // Your code here
        st.pop();
    }

    // Function to print the top element of stack.
        
    public static void headOf_Stack(Stack<Integer> st) {
        // Your code here
        if(!st.isEmpty())
        System.out.println(st.peek());
    }

        
    // Function to search an element in the stack.
    public static boolean find(Stack<Integer> st, int val) {
        // Your code here
        return st.contains(val);
    }
}
