class Solution {
    // Function to count the frequency of all elements from 1 to N in the array.
    public List<Integer> frequencyCount(int[] arr) {
        // do modify in the given array
        int []h =new int[arr.length];
        for(int i=0;i<arr.length;i++){
            h[arr[i]]+=1;
        }
        List<Integer> l=new ArrayList<>();
        for(int i:h) l.add(i);
        return l;
    }
}
