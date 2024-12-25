
class Solution {
    public static int largest(int[] arr) {
        // code here
        int mx=arr[0];
        for(int i:arr){
            if(i>mx) mx=i;
        }
        return mx;
    }
}