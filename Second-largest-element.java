class Solution {
    public int getSecondLargest(int[] arr) {
        // Code Here
        if(arr==null && arr.length<2) return -1;
        int mx=Integer.MIN_VALUE;
        int mx1=Integer.MIN_VALUE;
        for(int i:arr){
            if(i>mx){
            mx1=mx;
            mx=i;
            }
            else if(i>mx1 && i!=mx) mx1=i;
        }
        return (mx1==Integer.MIN_VALUE)? -1: mx1;
    }
}