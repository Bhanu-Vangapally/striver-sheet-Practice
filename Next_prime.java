import java.util.*;
import java.math.BigInteger;

public class Solution {
    public static void main(String args[]) {
        // Your Code Here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        BigInteger b=BigInteger.valueOf(n);
        System.out.print(b.nextProbablePrime());
    }
}