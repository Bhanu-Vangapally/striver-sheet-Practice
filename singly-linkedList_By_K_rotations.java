/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null || k==0) return head;
        ListNode t=head;
        int n=1;
        while(t.next!=null){
            t=t.next;
            n++;
        }
        if(k%n==0) return head;
        k=k%n;
        t.next=head;
        ListNode t1=head;
        for(int i=1;i<n-k && t1!=null;i++){
            t1=t1.next;
        }
        head=t1.next;
        t1.next=null;
        return head;
    }
}