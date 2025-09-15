// User function Template for Java
class Solution {
    public static void sortByComparator(String[] arr) {
        // Your code here
        Arrays.sort(arr,String::compareToIgnoreCase);

        // You sort it in a single line using method references
    }
}