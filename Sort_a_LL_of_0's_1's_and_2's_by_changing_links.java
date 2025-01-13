class Solution {
    // Function to sort a linked list of 0s, 1s and 2s.
    static Node segregate(Node head) {
        // add your code here
        int z,o,tw;
        o=z=tw=0;
        Node t=head;
        while(t!=null){
            if(t.data==0) z++;
            else if(t.data==1) o++;
            else tw++;
            t=t.next;
        }
        Node t1=new Node(-1);
        Node tt=t1;
        for(int i=0;i<z;i++){
            Node ny=new Node(0);
            tt.next=ny;
            tt=tt.next;
        }
        for(int i=0;i<o;i++){
            Node ny=new Node(1);
            tt.next=ny;
            tt=tt.next;
        }
        for(int i=0;i<tw;i++){
            Node ny=new Node(2);
            tt.next=ny;
            tt=tt.next;
        }
        return t1.next;
    }
}