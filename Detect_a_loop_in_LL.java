class Solution {
    // Function to check if the linked list has a loop.
    public static boolean detectLoop(Node head) {
        // Add code here
        Node f,s;
        f=s=head;
        while(f!=null && f.next!=null){
            s=s.next;
            f=f.next.next;
            Node k=f;
            if(s==f) return true;
        }
        return false;
    }
}