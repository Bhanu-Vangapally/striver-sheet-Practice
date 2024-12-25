import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            Map<Integer,Integer> hm=new HashMap<>();
            for(int i=0;i<arr.length;i++){
                if(hm.containsKey(arr[i])) hm.put(arr[i],Math.max(hm.get(arr[i]),i+1));
                else hm.put(arr[i],i+1);
            }
            // System.out.println(hm);
            int c=0;
            for(int i:hm.keySet()){
                c+=hm.get(i);
            }
            System.out.println(c);
        }
	}
}
