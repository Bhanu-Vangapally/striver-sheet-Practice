Find Smallest Letter Greater Than Target

class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int l=0,h=letters.length-1;
        while(l<=h){
            int m=l+(h-l)/2;
            if(letters[m]<=target) l=m+1;
            else h=m-1;
        }
        return letters[l%letters.length];
    }
}