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
    public void reorderList(ListNode head) {
        if(head==null || head.next==null) return;
        ListNode s=head,f=head;
        // Step 1: Find middle using slow/fast pointers
        while(f!=null && f.next!=null){
            s=s.next;
            f=f.next.next;
        }
        // Step 2: Reverse second half
        ListNode prev = null, curr = s.next;
        s.next = null;  // split into two lists
         while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        ListNode head2 = prev; // head of reversed second half

        // Step 3: Merge both lists
        ListNode first = head, second = head2;

        while (second != null) {
            ListNode tmp1 = first.next;
            ListNode tmp2 = second.next;

            first.next = second;
            second.next = tmp1;

            first = tmp1;
            second = tmp2;
        }
    }
}