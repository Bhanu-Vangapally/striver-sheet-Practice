// User function Template for Java
class Solution {
    static ArrayList<Long> factorialNumbers(long n) {
        // code here
        ArrayList<Long> l=new ArrayList<>();
        fat(l,n);
        return l;
    }
    static void fat(ArrayList<Long> l,long n){
        long f=1;
        for(long i=1;i<=n;i++){
            f*=i;
            if(f<=n) l.add(f);
            else break;
        }
        return ;
    }
}