// User function Template for Java
class Solution {
    public static char extraChar(String s1, String s2) {

        // write your code here
        int s=0,n=s1.length();
        for(int i=0;i<n;i++){
            s=s^s1.charAt(i)^s2.charAt(i);
        }
        s^=s2.charAt(n);
        return (char)s;
    }
}
