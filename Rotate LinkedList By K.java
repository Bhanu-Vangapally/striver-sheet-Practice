Rotate LinkedList By K
Difficulty: BasicAccuracy: 90.26%Submissions: 2K+Points: 1
You are given a LinkedList ll, you are also given a value k. You need to right-rotate the ll by k.

Example 1:

Input: ll[] = [9, 8, 7, 6, 5, 4, 4], k = 2
Output: 4 4 9 8 7 6 5
Explanation:
First rotation: 4 9 8 7 6 5 4. 
Second rotation: 4 4 9 8 7 6 5
Input: ll[] = [99, 6, 33], k = 4
Output: 33 99 6
Explanation:
After rotating it by 4, we get 33 99 6.
Constraints:
1 <= ll.size() <= 103
0 <= k, lli <= 106

// User function Template for Java
class Solution {
    public static void rotateByK(LinkedList<Integer> ll, int k) {
        // Your code here
        Collections.rotate(ll,k);

        // You don't need to print
    }
}
