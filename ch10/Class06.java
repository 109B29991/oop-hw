class CTriangle {
    protected int base;
    protected int height;

    protected void show() {
        System.out.println("base=" + base + ", height=" + height);
    }
}

class CData extends CTriangle {
    public void area() { // (b)
        show();
        double area = 0.5 * base * height;
        System.out.println("area=" + area);
    }

    public CData(int b, int h) { // (a)
        base = b;
        height = h;
    }
}

public class Class06 {
    public static void main(String[] args) {
        CData obj = new CData(3, 8);
        obj.area();
    }
}