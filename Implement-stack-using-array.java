class MyStack {
    private int[] arr;
    private int top;

    public MyStack() {
        arr = new int[1000];
        top = -1;
    }

    public void push(int x) {
        // Your Code
        arr[++top]=x;
    }

    public int pop() {
        // Your Code
        if(top>=0) return arr[top--];
        else return -1;
    }
}