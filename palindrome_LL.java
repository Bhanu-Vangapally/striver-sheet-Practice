class Solution {
    // Function to check whether the list is palindrome.
    static boolean isPalindrome(Node head) {
        // Your code here
        StringBuilder s=new StringBuilder();
        StringBuilder s1=new StringBuilder();
        // String s1="";
        Node t=head;
        while(t!=null){
            s.append(t.data);
            s1.insert(0,t.data);
            t=t.next;
        }
        if(s.toString().equals(s1.toString())) return true;
        return false;
    }
}
