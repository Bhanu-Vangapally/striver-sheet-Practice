class Person {
    String name;

    // Parent Constructor
    Person(String name) {
        this.name = name; // 'this' refers to current class instance variable
        System.out.println("Parent constructor called: " + this.name);
    }

    void display() {
        System.out.println("Person's display method");
    }
}

class Student extends Person {
    String name; // Shadowing parent's 'name' variable

    // Subclass Constructor
    Student(String parentName, String studentName) {
        super(parentName); // Calls the parent constructor (Person)
        this.name = studentName; // Refers to Student's 'name'
        System.out.println("Student constructor called: " + this.name);
    }

    @Override
    void display() {
        super.display(); // Calls the display() method of the parent class
        System.out.println("Student's display method: " + this.name);
        
        // Accessing shadowed variable from parent
        System.out.println("Parent name accessed via super: " + super.name);
    }
}

public class Main {
    public static void main(String[] args) {
        Student s = new Student("Alice", "Bob");
        s.display();
    }
}
