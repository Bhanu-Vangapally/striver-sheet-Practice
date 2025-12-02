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
    public ListNode modifiedList(int[] nums, ListNode head) {
        if(head==null) return head;
        ListNode dmy=new ListNode(-1);
        ListNode t=dmy;
        ListNode pt=head;
        Set<Integer> al = new HashSet<>();
        for (int x : nums)    al.add(x);
        while(pt!=null){
            if(!al.contains(pt.val)){
                ListNode nn=new ListNode(pt.val);
                t.next=nn;
                t=nn;
            }
            pt=pt.next;
        }
        return dmy.next;
    }
}