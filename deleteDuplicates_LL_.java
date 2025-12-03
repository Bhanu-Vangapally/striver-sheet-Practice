class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) return head;

        ListNode dummy = new ListNode(0, head);
        ListNode prev = dummy;   // node before the duplicate block
        ListNode curr = head;

        while (curr != null) {

            // If current node is duplicate
            if (curr.next != null && curr.val == curr.next.val) {

                // skip all nodes with same value
                while (curr.next != null && curr.val == curr.next.val) {
                    curr = curr.next;
                }

                // Connect prev → node after duplicates
                prev.next = curr.next;
            } else {
                // Move prev only when no duplicate
                prev = prev.next;
            }

            curr = curr.next;
        }

        return dummy.next;
    }
}