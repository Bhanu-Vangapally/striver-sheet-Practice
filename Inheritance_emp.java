
public class Main
{
	public static void main(String[] args) {
// 		System.out.println("Hello World");
        dog d=new dog();
        d.bark();
        d.color();
	}
}
class Animal{
    void bark(){
        System.out.println("Barking");
    }
}
class dog extends Animal{
    void color(){
        System.out.println("Brown");
    }
}