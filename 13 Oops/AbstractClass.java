

public class AbstractClass {
    public static void main(String[] args) {
        // Horse h = new Horse();
        // h.eat();
        // h.walk();
        // System.out.println(h.color);

        // Chicken c = new Chicken();
        // c.eat();
        // c.walk();
        Mustang myHorse = new Mustang();
        // Animal -> Horse -> Mustange
    }
}

abstract class Animal {
    String color;

    Animal() {
        System.out.println("animal constructor called");
        color = "brown";
    }
    // Non-Abstract class
    void eat() {
        System.out.println("animal eats");
    }

    // abstract methos
    abstract void walk();
}

class Horse extends Animal {
    Horse() {
        System.out.println("Horse constructor called");
    }
    void changeColor() {
        color = "dark Brown";
    }
    void walk(){
    System.out.println("walks on 4 legs");
    }
}
class Mustang extends Horse {
    Mustang() {
        System.out.println("mustang constructor called");
    }

}

class Chicken extends Animal {
    void walk() {
        System.out.println("walks on 2 legs");
    }
}