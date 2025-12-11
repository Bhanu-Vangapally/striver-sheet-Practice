/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Stack<Character> sk=new Stack<>();
        String s=sc.nextLine();
        for(char i:s.toCharArray()) sk.push(i);
        //ABCDA
        String res="";
        while(!sk.isEmpty()){
            char i=sk.pop();
            // if(sk.isEmpty()) res=i+res;
            if(!sk.isEmpty() &&( (i=='A' && sk.peek()=='B') ||(i=='B' && sk.peek()=='A'))) sk.pop();
            else if(!sk.isEmpty() &&( (i=='C' && sk.peek()=='D') ||(i=='D' && sk.peek()=='C'))) sk.pop();
            else res=i+res;
        }
		System.out.println(res);
        
	}
}
