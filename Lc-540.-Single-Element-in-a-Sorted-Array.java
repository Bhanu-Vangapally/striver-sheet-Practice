class Solution {
    public int singleNonDuplicate(int[] nums) {
        int res=0;
        for(int i:nums) res=res^i;
        return res;
    }
}