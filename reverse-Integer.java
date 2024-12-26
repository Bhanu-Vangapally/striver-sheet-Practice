class Solution {
    public int reverse(int x) {
        long rev=0;
        int t=x;
        while(t!=0){
            rev=(rev*10)+t%10;
            t=t/10;
        }
        if(rev<Integer.MIN_VALUE || rev>Integer.MAX_VALUE) return 0;
        return (int)rev;
    }
}