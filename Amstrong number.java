import java.util.*;
public class Main {
	
	public static void main(String[] args) {
		// Write your code here
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		int c=s.length();
		long n=Long.parseLong(s);
		long k=n;
		long ans=0;
		while(n>0){
			ans+=Math.pow(n%10,c);
			n/=10;
		}
		if(ans==k) System.out.println("true");
		else System.out.println("false");
	}
}
