class Solution {
    static ArrayList<Integer> maxOfSubarrays(int[] arr, int k) {
        // code here
        ArrayList<Integer>l=new ArrayList<Integer>();
        for(int i=0;i<=arr.length-k;i++){
            int mx=arr[i];
            for(int j=i+1;j<i+k;j++){
                mx=Math.max(mx,arr[j]);
            }
            l.add(mx);
        }
        return l;
    }
}