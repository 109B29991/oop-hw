abstract class Caaa {
    protected int num;

    public Caaa(int n) {
        num = n; // (a)
    }

    public abstract void show();
}

class Cbbb extends Caaa {
    public Cbbb(int n) { // (b)
        super(n);
    }

    public void show() { // (c)
        System.out.println("num的值為: " + num);
    }
}

public class Class01 {
    public static void main(String[] args) {
        Cbbb bb = new Cbbb(2);
        bb.show();
    }
}