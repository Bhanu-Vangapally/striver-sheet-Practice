
public class Main
{
	public static void main(String[] args) {
// 		System.out.println("Hello World");
        poly d=new poly();
        System.out.println(d.add(2,5));
        System.out.println(d.add(2,5,9));
        
	}
}
class poly{
    int add(int a, int b){
        return a+b;
    }
    int add(int a, int b,int c){
        return a+b+c;
    }
}
