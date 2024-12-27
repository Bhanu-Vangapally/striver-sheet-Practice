class Solution {
    public int search(int[] nums, int t) {
        int h=nums.length-1;
        int l=0;
        while(l<=h){
            int m=(l+h)/2;
            if(nums[m]==t) return m;
            if(nums[m]>t) h=m-1;
            if(nums[m]<t) l=m+1;
        }
        return -1;
    }
}