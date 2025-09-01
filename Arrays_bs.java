// User function Template for Java
class Solution {
    public static int binarySearchArray(int arr[], int k) {
        // Your code here
        int ans= Arrays.binarySearch(arr,k);
        return ans<0?-1:ans;
    }
}