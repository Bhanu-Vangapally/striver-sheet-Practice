public class Solution {
    public ListNode detectCycle(ListNode head) {
        if(head==null || head.next==null) return null;//new ListNode(-1);
        ListNode s,f;
        s=f=head;
        while(f!=null && f.next!=null){
            s=s.next;
            f=f.next.next;
            if(s==f){
                ListNode t=head;
                while(t!=s){
                    t=t.next;
                    s=s.next;
                }
                return t;
            }
        }
        return null;
    }
}