public class Solution {
    public static void nLetterTriangle(int n) {
        // Write your code here
        for(int i=0;i<n;i++){
            char c='A';
            for(int j=0;j<=i;j++) System.out.print(c+++" ");
            System.out.println();
        }
    }
}
