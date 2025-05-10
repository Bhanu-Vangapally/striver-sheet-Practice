import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {        
        // Write your code here
        Scanner sc = new Scanner(System.in);
        long t=sc.nextLong();
            long ar[]=new long[(int)t];
        for(int i=0;i<t;i++){
            ar[(int)i]=sc.nextLong();
        }
        Map<Long,Long> mp=new HashMap<>();
        for(long i:ar){
            mp.put(i,mp.getOrDefault(i,0L)+1L);
        }
        long mx=0,c=0;
        for(long i:mp.keySet()){
            if(mp.get(i)>mx) mx=mp.get(i);
        }
        for(long i:mp.keySet()){
            if(mp.get(i)>=mx) c++;
        }
        System.out.println(c);
    }
}
