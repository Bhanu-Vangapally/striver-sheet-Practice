class Solution {
    public int[] searchRange(int[] nums, int target) {
        int [] a=new int[2];
        int f=Integer.MAX_VALUE,l=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                f=Math.min(f,i);
                l=Math.max(l,i);
            }
        }
        if(f!=Integer.MAX_VALUE) a[0]=f;
        else a[0]=-1;
        if(l!=Integer.MIN_VALUE) a[1]=l;
        else a[1]=a[0];
        return a;
    }
}