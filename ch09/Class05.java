class CCount {
    // (a)
    private static int cnt = 0;

    public CCount() {
        cnt++;
    }

    public int getCount() {
        return cnt;
    }

    public void setZero() { // (b)
        cnt = 0;
    }

    public void setValue(int n) { // (c)
        cnt = n;
    }
}

public class Class05 {
    public static void main(String[] args) {
        CCount objA = new CCount();
        CCount objB = new CCount();
        CCount objC = new CCount();

        System.out.println(objA.getCount());

        objB.setZero();
        System.out.println(objB.getCount());

        objC.setValue(42);
        System.out.println(+objC.getCount());

        System.out.println("d:類別變數，因為它需要記錄所有的物件的個數");
        System.out.println("e:類別函數");
    }
}
