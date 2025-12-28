class Animal {
    public void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    public void sound() {
        System.out.println("Dog barks");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal myAnimal = new Animal();
        Animal myDog = new Dog(); // Runtime polymorphism

        myAnimal.sound(); // Output: Animal makes a sound
        myDog.sound();   // Output: Dog barks (overridden method is called)
    }
}
