
import java.util.*;

public class ClassesObjects {
    public static void main(String args[]) {
        Pen p1 = new Pen();  // created a pen object called p1
        p1.setColor("Blue");
        System.out.println(p1.getColour());

        p1.setTip(5);
        System.out.println(p1.getTip());

        // p1.setColor("Yellow");
        p1.setColor("Yellow");
        System.out.println(p1.getColour());

    }
}


class Pen{

    private String color;
    private int tip;

    String getColour() {
        return this.color;
    }

    int getTip() {
        return this.tip;
    }

    void setColor(String newColor){
        this.color = newColor;
    }

    void setTip(int tip){
        this.tip = tip;
    }
}
