class CRectangle {
    int width;
    int height;

    public CRectangle(int w, int h) {
        width = w;
        height = h; // (a)
    }

    public CRectangle() {
        width = 10;
        height = 8; // (b)
    }

    public CRectangle() {
        this(10, 8); // (c)
    }
}

public class Class01 {
    public static void main(String[] args) {
        CRectangle rect1 = new CRectangle(20, 16);
        System.out.println("Width: " + rect1.width + ", Height: " + rect1.height);

        CRectangle rect2 = new CRectangle();
        System.out.println("Width: " + rect2.width + ", Height: " + rect2.height);

        CRectangle rect3 = new CRectangle();
        System.out.println("Width: " + rect3.width + ", Height: " + rect3.height);

    }
}