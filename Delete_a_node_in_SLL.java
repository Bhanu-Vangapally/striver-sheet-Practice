class Solution {
    Node deleteNode(Node head, int x) {
        if(head==null) return null;
        if(x==1) return head.next;
        // code here
        Node t=head;
        int c=1;
        while(t!=null && c<x-1 ){
            t=t.next;
            c++;
        }
        t.next=t.next.next;
        return head;
    }
}