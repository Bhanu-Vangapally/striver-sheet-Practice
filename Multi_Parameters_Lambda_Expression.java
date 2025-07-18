// User function Template for Java

/*
The interface looks like

interface Add {
    public int addParameters(int a, int b);
}
*/

class Solution {
    public static Add helperFunction() {
        // Your code here
        Add t=(a,b)->a+b;
        return t;
        // Implement the addParameters method that returns a+b.
    }
}