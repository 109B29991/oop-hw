class Caaa {
    private int num;

    public Caaa(int n) {
        num = n;
    }

    public int get() {
        return num;
    }

    public void display() { // (a)
        System.out.println("printed from Caaa class");
    }
}

class Cbbb extends Caaa {
    public Cbbb() {
        super(2);
    }

    public void show() {
        System.out.println("num=" + get());
    }

    public void display() { // (b)
        System.out.println("printed from Cbbb class");
    }
}

public class Class09 {
    public static void main(String args[]) {
        Cbbb bb = new Cbbb();
        bb.show();
        bb.display();
        // 父類別的display()函數會被呼叫
    }
}
