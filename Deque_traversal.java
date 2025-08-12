class Solution {
    public static void printDeque(ArrayDeque<Integer> deq) {
        // code here
        Iterator i=deq.iterator();
        while(i.hasNext()){
            System.out.print(i.next()+" ");
        }
        System.out.println();
    }
}