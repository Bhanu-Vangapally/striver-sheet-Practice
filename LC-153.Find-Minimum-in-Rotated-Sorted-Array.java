class Solution {
    public int findMin(int[] nums) {
        int mn=nums[0];
        for(int i:nums) if(i<mn) mn=i;
        return mn;
    }
}