// User function Template for Java

class Solution {
    public int findMin(int a, int b) {
        // Your code here
        int mn=Integer.MAX_VALUE;
        try{
            if(mn>a+b) mn=a+b;
            if(mn>a-b) mn=a-b;
            if(mn>a*b) mn=a*b;
            if(mn>a/b) mn=a/b;
        }
        catch(Exception e){
            return 0;
        }
        finally{
            return mn;
        }
    }
}