class TestClass {
    // Add your code here. Define private variables, Constructors to initialize
    // variables with the given values and a method findMin() which prints the
    // Minimum value of a$b.
    private int a,b;
    TestClass(int aa,int bb){
        a=aa;
        b=bb;
    }
    void findMin(){
        int  mn,ad,mu,di,su;
        su=a-b;
        mu=a*b;
        ad=a+b;
        try{
            di=a/b;
        }catch(Exception e){
            di=0;
        }
        mn=Math.min(su,Math.min(mu,Math.min(ad,di)));
        System.out.println(mn);
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n,a,b;
        n=sc.nextInt();
        while(n-->0){
        a=sc.nextInt();
        b=sc.nextInt();
        TestClass t=new TestClass(a,b);
        t.findMin();
        }
    }
}