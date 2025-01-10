class Solution {
    // Function to find the length of a loop in the linked list.
    public int countNodesinLoop(Node head) {
        // Add your code here.
        Node s,f;
        s=f=head;
        while(f!=null && f.next!=null){
            s=s.next;
            f=f.next.next;
            if(s==f) return cnt(s);
        }
        return 0;
    }
    int cnt(Node r){
        int c=1;
        Node t=r;
        while(t.next!=r){
            c++;
            t=t.next;
        }
        return c;
    }
}