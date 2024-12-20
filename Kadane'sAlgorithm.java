class Solution {
    public int maxSubArray(int[] nums) {
        int s=Integer.MIN_VALUE,c=0;
        for(int i:nums){
            c+=i;
            s=Math.max(s,c);
            if(c<0) c=0;
        }
        return s;
    }
}