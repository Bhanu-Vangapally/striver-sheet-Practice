class Solution {
    public int findKthPositive(int[] arr, int k) {
        int ans[]=new int[arr.length+k];
        for(int i=1;i<=arr.length+k;i++) ans[i-1]=i;
        ArrayList<Integer>l=new ArrayList<>();
        for(int i:arr){
            l.add(i);
        }
        int p=k;
        for(int i=0;i<arr.length+k;i++){
            if(!l.contains(ans[i]) && p!=0) p--;
            if(p==0) return ans[i]; 
        }
        return -1;
    }
}