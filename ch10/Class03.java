class Caaa {
    public int num1;
    public int num2;

    public Caaa() { // (a)
        num1 = 1;
        num2 = 1;
    }

    public Caaa(int a, int b) { // (b)
        num1 = a;
        num2 = b;
    }
}

class Cbbb extends Caaa {
    public Cbbb(int a, int b) { // (c)
        super(a, b);
    }

    public void set_num(int a, int b) {
        num1 = a;
        num2 = b;
    }

    public void show() {
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
    }
}

public class Class03 {
    public static void main(String[] args) {
        Caaa a1 = new Caaa();

        System.out.println("a:");
        System.out.println("num1 = " + a1.num1);
        System.out.println("num2 = " + a1.num2);

        Caaa b2 = new Caaa(3, 7);
        System.out.println("b:");
        System.out.println("num1 = " + b2.num1);
        System.out.println("num2 = " + b2.num2);

        Cbbb c3 = new Cbbb(8, 12);
        System.out.println("c:");
        c3.show();
    }
}