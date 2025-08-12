Deque deletion
Difficulty: EasyAccuracy: 50.86%Submissions: 21K+Points: 2
Given a Deque deq containing non-negative integers.

Complete below functions depending type of query as mentioned and provided to you (indexing starts from 0):
1. eraseAt(x): this function should remove the element from specified position x in deque.
2. eraseInRange(start, end): this function should remove the elements in range start (inclusive), end (exclusive) specified in the argument of the function.
Note: If start is equal to end then simply return.
3. eraseAll(): remove all the elements from the deque.

Examples:

Input: deq = [1 2 4 5 6], query = [1 2]
Output: 1 2 5 6 
Explanation: Here the query type is 1 and the position is 2. So we remove element at position 2. The element at position 2 is 1 2 4 5 6. So, we remove 4 and get 1 2 5 6.
Input: deq = [1 2 3 4], query = [2 1 3]
Output: 1 4 
Explanation: Here the query type is 2 and the range is [1, 3). So we need to delete 1 2 3 4. Remember that end is exclusive. So the updated dequeue is 1 4.
Input: deq = [1 2 3], query = [3]
Output: Empty
Explanation: Here the query is of type 3 so we remove all the elements of dequeue.
Constraints:
1 ≤ deq.size() ≤ 105

class Solution {
    public static void eraseAt(ArrayDeque<Integer> deq, int X) {
        // code here
        if(X<0 || X>=deq.size()) return ;
        Iterator it=deq.iterator();
        int i=0;
        while(it.hasNext()){
            it.next();
            if(i==X){ 
                it.remove();
                break;
                }
            i++;
        }
    }
    public static void eraseInRange(ArrayDeque<Integer> deq, int start, int end) {
        if(start<0) start=0;
        if(end>deq.size()) start=deq.size();
        Iterator it=deq.iterator();
        int i=0;
        while(it.hasNext()){
            it.next();
            if(i>=start && i<end){ 
                it.remove();
                }
            i++;
        }
        // code here
    }

        
    public static void eraseAll(ArrayDeque<Integer> deq) {
        // code here
        deq.clear();
    }
}