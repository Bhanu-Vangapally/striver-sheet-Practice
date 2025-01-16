class Solution {
    static Node deleteAllOccurOfX(Node head, int x) {
        // Write your code here
        if (head == null) return null;
        
        Node temp = head;
        
        // Remove occurrences from the beginning
        while (temp != null && temp.data == x) {
            head = temp.next;
            if (head != null) head.prev = null;
            temp = head;
        }
        
        // Traverse the list and remove occurrences of x
        while (temp != null) {
            if (temp.data == x) {
                if (temp.prev != null) temp.prev.next = temp.next;
                if (temp.next != null) temp.next.prev = temp.prev;
            }
            temp = temp.next;
        }
        
        return head;
    }
}