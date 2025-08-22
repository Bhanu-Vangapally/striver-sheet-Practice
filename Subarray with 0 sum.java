class Solution {
    // Function to check whether there is a subarray present with 0-sum or not.
    static boolean findsum(int arr[]) {
        // Your code here
        HashSet<Integer> hs=new HashSet<>();
        int ps=0;
        for(int i:arr){
            ps+=i;
            if(ps==0 || hs.contains(ps)) return true;
            hs.add(ps);
        }
        return false;
    }
}