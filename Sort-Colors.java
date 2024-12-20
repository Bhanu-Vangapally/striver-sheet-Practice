class Solution {
    public void sortColors(int[] nums) {
        int o,n,t;
        o=n=t=0;
        for(int i:nums){
            if(i==0) o++;
            else if(i==1) n++;
            else t++;
        }
        int k=0;
        for(int i=0;i<o;i++){
             nums[i]=0;
             k++;
        }
        for(int i=0;i<n;i++){
            nums[k]=1;
             k++;
        }
        for(int i=0;i<t;i++){
            nums[k]=2;
             k++;
        }
    }
}