interface mymath {
    void show();

    public void add(int a, int b);

    public void sub(int a, int b);

    public void mul(int a, int b);

    public void div(int a, int b);
}

interface advancemath {
    public void mod(int a, int b);

    public void fac(int a);

    public void pow(int a, int b);
}

class compute implements mymath, advancemath {
    public int ans = 1;

    public void show() {
        System.out.println("ans=" + ans);
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

    public void mod(int a, int b) {
        ans = a % b;
    }

    public void fac(int a) {
        ans = 1;
        for (int i = 1; i <= a; i++) {
            ans *= i;
        }
    }

    public void pow(int a, int b) {
        ans = a ^ b;
    }
}

public class Class07 {
    public static void main(String[] args) {
        compute cp = new compute();
        cp.mul(3, 5);
        cp.show();
        cp.mod(14, 5);
        cp.show();
        cp.fac(5);
        cp.show();
    }
}