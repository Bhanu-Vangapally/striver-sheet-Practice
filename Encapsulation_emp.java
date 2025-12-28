
public class Main
{
	public static void main(String[] args) {
// 		System.out.println("Hello World");
        Bank d=new Bank();
        d.dep(500);
        System.out.println(d.getbal());
        
	}
}
class Bank{
    private int bal=1000;
    int getbal(){
        return bal;
    }
    void dep(int d){
        bal+=d;
    }
}
