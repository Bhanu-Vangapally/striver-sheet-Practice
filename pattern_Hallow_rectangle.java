/*

Sample Input 1:
3
Sample Output 1:
***
* *
***
Sample Input 2 :
5
Sample Output 2 :
*****
*   *
*   *
*   *
*****  
*/

public class Solution {
    public static void getStarPattern(int n) {
        // Write your code here\
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==0 || j==0 || i==n-1 || j==n-1) System.out.print("*");
                else System.out.print(" ");
            }
            System.out.println();
        }
        
    }
}