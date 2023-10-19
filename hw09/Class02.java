class CRectangle {
    int width;
    int height;

    public CRectangle(int w, int h) {
        width = w;
        height = h;
    }

    public CRectangle() {
        // 應這樣改正
        this(10, 8); // this( ) 要寫在建構元的敘述第一行
        System.out.println("constructor called");
    }
}

public class Class02 {
    public static void main(String[] args) {
        CRectangle rect = new CRectangle();
        System.out.println("Width: " + rect.width + ", Height: " + rect.height);

    }
}