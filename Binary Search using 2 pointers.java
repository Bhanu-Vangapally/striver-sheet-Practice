// User function Template for Java
class Solution {
    public static int binarySearchArray(int arr[], int k) {
        // Your code here
        int i=0,j=arr.length-1;
        // for(int i=0;i<arr.length;i++){
        while(i<=j){
            int md=(i+j)/2;
            if(arr[md]==k) return md;
            if(arr[md]<k) i=md+1;
            else j=md-1;
        }
        return -1;
    }
}