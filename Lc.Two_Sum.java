class Solution {
    public int[] twoSum(int[] nums, int trg) {
        int id[]=new int[2];
        int k=0;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==trg){
                    id[k++]=i;
                    id[k++]=j;
                    return id; 
                }
            }
        }
        return id;
    }
}