class Solution {
    public int maxProfit(int[] prices) {
        int n=prices.length;
        int mn=Integer.MAX_VALUE;
        int mx=0;
        for(int i:prices){
            if(i<mn) mn=i;
            else mx=Math.max(mx,i-mn);
        }
        return mx;
    }
}