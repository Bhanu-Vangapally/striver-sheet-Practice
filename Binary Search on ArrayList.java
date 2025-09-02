// User function Template for Java
class Solution {
    public static int binarySearchAL(ArrayList<Integer> list, int k) {
        // Your code here
        int l= Collections.binarySearch(list,k);
        return l>=0?l:-1;

        // If k in arr return 1, else return -1
    }
}