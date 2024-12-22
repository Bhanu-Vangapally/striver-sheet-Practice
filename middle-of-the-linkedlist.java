class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode t=head;
        int c=0;
        while(t!=null){
            c++;
            t=t.next;
        }
        c=c/2;
        t=head;
        while(t!=null && c!=0){
            c--;
            t=t.next;
        }
        return t;
    }
}