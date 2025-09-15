class Solution {
    static boolean canAttend(int[][] arr) {
        // code here
        Arrays.sort(arr,(a,b)-> Integer.compare(a[0],b[0]));
        System.out.print(arr.toString()+" ");
        for(int i=1;i<arr.length;i++) if(arr[i][0]<arr[i-1][1]) return false;
        return true;
    }
}