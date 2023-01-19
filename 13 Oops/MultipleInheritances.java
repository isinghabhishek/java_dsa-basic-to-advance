public class MultipleInheritances {

    public static void main(String[] args) {
        Bear b = new Bear();
        b.eatGrass();
    }
}

interface Herbivore {
    void eatGrass();
    void teeth();
}

interface Carnivore {
    void eatBoth();

}

class Bear implements Herbivore, Carnivore {
    public void eatGrass() {
        System.out.println("eats Sugarcanes");
    }

    public void teeth() {
        System.out.println("teeth are very sharp");
    }

    public void eatBoth() {
        System.out.println("eats grass as well meat");
    }

    
}