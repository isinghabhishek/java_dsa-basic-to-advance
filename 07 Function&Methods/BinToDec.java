
public class BinToDec {
    
    // implementing the logic for the Converting any Bin to Decimal
    
    public static void binToDec(int binNum){
        int myNum = binNum;
        int powr=0;
        int decNum=0;
        while(binNum > 0){
            int lastDigit = binNum % 10;
            decNum = decNum + (lastDigit * (int)(Math.pow(2, powr)));
            powr++;
            binNum = binNum/10;
        }
        System.out.println("Decimal of " + myNum +" = " + decNum);
    }
    public static void main(String[] args) {
        binToDec(10011);
    }
}
