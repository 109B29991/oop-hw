abstract class MyMath {
    protected int ans;

    public void show() {
        System.out.println("ans=" + ans);
    }

    public abstract void add(int a, int b);

    public abstract void sub(int a, int b);

    public abstract void mul(int a, int b);

    public abstract void div(int a, int b);
}

class compute11 extends MyMath {

    public void add(int a, int b) {
        ans = a + b;
    }

    public void sub(int a, int b) {
        ans = a - b;
    }

    public void mul(int a, int b) {
        ans = a * b;
    }

    public void div(int a, int b) {
        ans = a / b;
    }
}

public class Class02 {
    public static void main(String[] args) {
        compute11 cp = new compute11();
        cp.mul(3, 5);
        cp.show();
    }
}