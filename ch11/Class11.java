interface show_ans {
    public void show();
}

interface mymath extends show_ans {
    public void add(int a, int b);

    public void sub(int a, int b);

    public void mul(int a, int b);

    public void div(int a, int b);
}

class compute implements mymath {
    public int ans;

    public void show() {
        System.out.println("ans = " + ans);
    }

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

public class Class11 {
    public static void main(String[] args) {
        compute cp = new compute();
        cp.mul(3, 5);
        cp.show();
    }
}