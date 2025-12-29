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
// 		System.out.println("Hello World");
        int []a={1,5,4,3,2};
        System.out.print(Arrays.toString(a));
        quicksort(a,0,a.length-1);
        System.out.print(Arrays.toString(a));
	}
	static private void quicksort(int [] a,int l,int h){
	    if(l<h){
	        int pi=part(a,l,h);
	        quicksort(a,l,pi-1);
	        quicksort(a,pi+1,h);
	    }
	}
	static private int part(int []a ,int l, int h){
	    int pvt=a[h];
	    int i=l-1;
	    for(int j=l;j<h;j++){
	        if(a[j]<pvt){
	            i++;
	            int t=a[i];
	            a[i]=a[j];
	            a[j]=t;
	        }
	    }
	    i++;
	    int t=a[i];
	    a[i]=a[h];
	    a[h]=t;
	    return i;
	}
}
