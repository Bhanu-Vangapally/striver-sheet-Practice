class Solution {
    public void moveZeroes(int[] nums) {
        int z=0,k=0;
        for(int i:nums){ 
            if(i==0) z++;
            else nums[k++]=i;
        }
        for(int i=nums.length-z;i<nums.length;i++) nums[i]=0;
    }
}