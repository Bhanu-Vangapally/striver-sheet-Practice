import java.util.*;
class Sllprblm{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int []arr={1,2,6,3,4,6};
		SLLNode t=new SLLNode(-1);
		for(int i:rr){
			SLLNode d=new SLLNode(i);
			t.next=d;
			t=t.next;
		}
		int c=0;
		int d=arr.length-2;
		while(t!=null && c<d){
		t=t.next;
		}
		t.next=t.next.next;
	d=t;
	while(d!=null){
		System.out.print(d.data+" ");
		}
	}
}
Node SLLNode{
int data;
Node SLLNode(int x){
	data=x;
}
}