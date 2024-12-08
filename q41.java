class Num {
    int number;

    Num(int number) {
        this.number = number;
    }

    void shownum() {
        System.out.println("Number: " + number);
    }
}

class HexNum extends Num {

    HexNum(int number) {
        super(number);
    }

    @Override
    void shownum() {
        System.out.println("Hexadecimal Value: " + Integer.toHexString(number));
        System.out.println("Octal Value: " + Integer.toOctalString(number));
    }
}

public class q41 {
    public static void main(String[] args) {
        Num num = new Num(255);
        HexNum hexNum = new HexNum(255);

        System.out.println("Base Class Output:");
        num.shownum();

        System.out.println("\nDerived Class Output:");
        hexNum.shownum();
    }
}
