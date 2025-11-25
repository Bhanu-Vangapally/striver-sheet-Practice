Given an array of size n (always even):

Sort the array.

Pair:

smallest with largest

2nd smallest with 2nd largest

and so on…

For each pair (a, b) compute:  mean=a+b/2

Insert each mean as a node into a new singly linked list.

Return head of this linked list.

class SinglyLinkedListNode {
    int data;
    SinglyLinkedListNode next;
    SinglyLinkedListNode(int nodeData) {
        this.data = nodeData;
        this.next = null;
    }
}

public static SinglyLinkedListNode newLinkedList(List<Integer> arr) {

    int n = arr.size();
    Collections.sort(arr);

    SinglyLinkedListNode head = null;
    SinglyLinkedListNode tail = null;

    int left = 0;
    int right = n - 1;

    while (left < right) {
        int a = arr.get(left);
        int b = arr.get(right);

        int mean = (a + b) / 2;   // floor division

        SinglyLinkedListNode node = new SinglyLinkedListNode(mean);

        if (head == null) {
            head = node;
            tail = node;
        } else {
            tail.next = node;
            tail = node;
        }

        left++;
        right--;
    }

    return head;
}
