// User function Template for Java

class Solution {
    public int binaryToDecimal(String b) {
        // Code here
        int k=1;
        int m=0;
        for(int i=b.length()-1;i>=0;i--){
            m+=(b.charAt(i)-'0')*k;
            k*=2;
        }
        return m;
    }
}