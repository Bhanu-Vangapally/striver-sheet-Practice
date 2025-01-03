
class Solution {
    public int findKRotation(List<Integer> arr) {
        // Code here
        int mn=Integer.MAX_VALUE;
        for(int i:arr){
            if(i<mn) mn=i;
        }
        int c=0;
        for(int i:arr){
            if(i==mn) break;
            c++;
        }
        return c;
    }
}