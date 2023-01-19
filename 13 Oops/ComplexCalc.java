
import java.util.*;

class ComplexCalc {
    int real;
    int imag;

    public ComplexCalc(int r, int i) {
        real = r;
        imag = i;
    }

    public static ComplexCalc add(ComplexCalc a, ComplexCalc b){
        return new ComplexCalc((a.real+b.real), (a.imag+b.imag));
    }

    public static ComplexCalc diff(ComplexCalc a, ComplexCalc b){
        return new ComplexCalc((a.real-b.real), (a.imag-b.imag));
    }

    public static ComplexCalc product(ComplexCalc a, ComplexCalc b){
        return new ComplexCalc(((a.real*b.real)-(a.imag*b.imag)),((a.real*b.imag)+(a.imag*b.real)));
    }

    public void printComplex(){
        if(real == 0 && imag != 0){
            System.out.println(imag+"i");
        }
        else if(imag == 0 && real != 0){
            System.out.println(real);
        }
        else{
            System.out.println(real+"+"+imag+"i");
        }
    }

    public static void main(String[] args) {
        ComplexCalc c = new ComplexCalc(4, 5);
        ComplexCalc d = new ComplexCalc(9, 4);

        ComplexCalc e = ComplexCalc.add(c, d);
        ComplexCalc f = ComplexCalc.diff(c, d);
        ComplexCalc g = ComplexCalc.product(c, d);

        e.printComplex();
        f.printComplex();
        g.printComplex();
    }
}


