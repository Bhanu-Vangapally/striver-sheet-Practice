// User function Template for Java
class Solution {
    public static int countOnce(int arr[]) {
        // Your code here
        Set<Integer> s=new HashSet<>();
        for(int i:arr) s.add(i);
        return s.size();
    }
}
