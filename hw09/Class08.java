class CWin {
    private static int cnt = 0; // (a)
    private String color;
    private int width;
    private int height;

    public CWin(String str, int w, int h) { // (b)
        color = str;
        width = w;
        height = h;
        cnt++;
    }

    public CWin() { // (c)
        color = "Red";
        width = 2;
        height = 2;
        cnt++;
    }

    public String printcwin() {
        return "color: " + color + " width: " + width + " height: " + height;
    }

    public static void setZero() { // (d)
        cnt = 0;
    }

    public static void setCount(int n) { // (e)
        cnt = n;
    }

    public int getCount() {
        return cnt;
    }

}

public class Class08 {
    public static void main(String[] args) {
        CWin obj1 = new CWin("Green", 5, 5);
        CWin obj2 = new CWin();

        System.out.println("a: " + obj1.getCount());
        System.out.println("b: " + obj1.printcwin());
        System.out.println("c: " + obj2.printcwin());

        // (f)類別函數，因為要用來追蹤所有Cwin的個數
        // (g)類別函數，因為可以方便直接的使用
    }
}
