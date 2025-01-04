class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        int s=n*(n+1)/2;
        for(int i:nums) s-=i;
        return s;
    }
}