class Solution {
    public int fib(int n) {
        // fib(n);
        if(n==0) return 0;
        if(n==1 || n==2) return 1;
        int k=3;
        int f1=1,f2=1;
        while(k<=n){
            int t=f1+f2;
            f1=f2;
            f2=t;
            k++;
        }
        return f2;
    }
}