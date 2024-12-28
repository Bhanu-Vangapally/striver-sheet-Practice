// User function Template for Java

class Solution {

    public void printNos(int n) {
        // Your code here
        pr(1,n);
    }
    void pr(int k, int n){
        if(k>n) return;
        System.out.print(k+++" ");
        pr(k,n);
    }
}
