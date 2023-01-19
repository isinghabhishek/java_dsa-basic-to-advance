

public class Inheritances {
    public static void main(String[] args) {
        Dog dobby = new Dog();
        dobby.eat();
        dobby.legs = 4;
        System.out.println(dobby.legs);
    }
}
// Base Class
class Animal {
    String color;

    void eat() {
        System.out.println("eats");
    }

    void breath() {
        System.out.println("breathes");
    }
}

class Mammel extends Animal {
    int legs;
}

class Dog extends Mammel {
    String breed;
}

// // Derived Class
// class Fish extends Animal {
//     int fins;

//     void swim() {
//         System.out.println("swims in water");
//     }
// }
