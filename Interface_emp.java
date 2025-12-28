interface payment { 
    void pay(); 
    void bal(); 
} 

abstract class upi implements payment { 
    public void pay() { 
        System.out.println("payment done"); 
    } 
    // bal() remains abstract here
} 

// Use 'extends' for abstract classes and 'public' for the method
class dd extends upi { 
    public void bal() { 
        System.out.println("Balance"); 
    } 
} 

public class Main { 
    public static void main(String[] args) { 
        payment myCar = new dd(); 
        myCar.pay(); 
        myCar.bal(); 
    } 
}
