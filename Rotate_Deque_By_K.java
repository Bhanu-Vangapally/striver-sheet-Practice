Rotate Deque By K
Difficulty: EasyAccuracy: 78.88%Submissions: 13K+Points: 2
Given a deque dq containing non-negative integers and a positive integer k, the task is to rotate elements of the deque by k places in a circular fashion. There will be two rotations which you have to implement depending on the type of rotating query. Below is the description of rotating type and value of k for which you have to rotate in circular way:
Type-1. right_Rotate_Deq_ByK(): this function should rotate deque by K places in a clockwise fashion.
Type-2. left_Rotate_Deq_ByK(): this function should rotate deque by K places in an anti-clockwise fashion.

Examples:

Input: dq = [1, 2, 3, 4, 5, 6], type = 1, k = 2
Output: [5, 6, 1, 2, 3, 4] 
Explanation: The query type is 1 and k is 2. So, we need to right rotate dequeue by 2 times. In 1 right rotation we get [6, 1, 2, 3, 4, 5]. In another we get [5, 6, 1, 2, 3, 4].
Input: dq = [1, 2, 3, 4, 5, 6], type = 2, k = 2 
Output: [3, 4, 5, 6, 1, 2] 
Explanation: The query type is 2 and k is 2. So, we need to left rotate dequeue by 2 times. In 1 left rotation we get [2, 3, 4, 5, 6, 1]. In another we get [3, 4, 5, 6, 1, 2].
Constraints:
1 ≤ dq.size() ≤ 105 


class Solution {
    public static void left_Rotate_Deq_ByK(ArrayDeque<Integer> dq, int k) {
        // Your code here
        while(k-->0){
            dq.offerLast(dq.pollFirst());
        }
    }

    public static void right_Rotate_Deq_ByK(ArrayDeque<Integer> dq, int k) {
        
        //  code here
        while(k-->0){
            dq.offerFirst(dq.pollLast());
        }
    }
}