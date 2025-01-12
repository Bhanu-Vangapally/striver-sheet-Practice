class Solution {
    public ListNode deleteMiddle(ListNode head) {
        if(head==null || head.next==null) return null;
        int c=0;
        ListNode s=head,f=head,prev=null;
        while(f!=null && f.next!=null){
            prev=s;
            s=s.next;
            f=f.next.next;
        }
        prev.next=s.next;
        return head;
    }
}