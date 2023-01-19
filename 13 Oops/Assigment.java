
// public class Assigment {
    
// }
abstract class Car {
    static {
        System.out.println("1");
    }

    public Car(String name) {
        super();
        System.out.println("2");
    }
    {
        System.out.println("3");
    }
}

public class BlueCar extends Car {
    {
    System.out.println("4");
    }

    public BlueCar() {
        super("blue");
        System.out.println("5");
    }

    public static void main(String[] args) {
        new BlueCar();
    }
}