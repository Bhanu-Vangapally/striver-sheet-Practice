import java.util.LinkedList;
import java.util.Queue;

class MyStack {
    Queue<Integer> q;
    Queue<Integer> q1;

    public MyStack() {
        q = new LinkedList<>();
        q1 = new LinkedList<>();
    }

    public void push(int x) {
        q1.add(x);

        while (!q.isEmpty()) {
            q1.add(q.remove());
        }

        // Swap q and q1 to make q the main queue
        Queue<Integer> temp = q;
        q = q1;
        q1 = temp;
    }

    public int pop() {
        if (!q.isEmpty()) {
            return q.remove();
        }
        return -1; // Return -1 if the stack is empty
    }

    public int top() {
        if (!q.isEmpty()) {
            return q.peek();
        }
        return -1; // Return -1 if the stack is empty
    }

    public boolean empty() {
        return q.isEmpty();
    }
}
