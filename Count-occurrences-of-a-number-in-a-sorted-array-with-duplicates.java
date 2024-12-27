
class Solution {
    int countFreq(int[] arr, int t) {
        // code here
        int c=0;
        for(int i:arr){
            if(i==t) c++;
        }
        return c;
    }
}