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
    public boolean isPalindrome(ListNode head) {
        StringBuilder s=new StringBuilder();
        StringBuilder s1=new StringBuilder();
        ListNode t=head;
        while(t!=null){
            s.append(t.val);
            s1.insert(0,t.val);
            t=t.next;
        }
        return s.toString().equals(s1.toString());
    }
}