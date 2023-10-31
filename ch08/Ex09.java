class CCalculator {
    int a, b, c;

    void set_value(int x, int y, int z) {
        a = x;
        b = y;
        c = z;
    }

    void show() {
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
    }

    int add() {
        return a + b + c;
    }

    int sub() {
        return a - b - c;
    }

    int mul() {
        return a * b * c;
    }

    double avg() {
        return (double) (a + b + c) / 3.0;
    }

    void showAll() {
        show();
        System.out.println("三數之和= " + add());
        System.out.println("a-b-c= " + sub());
        System.out.println("三數之積= " + mul());
        System.out.println("三數之平均值= " + avg());
    }
}

public class Ex09 {
    public static void main(String[] args) {
        CCalculator obj;
        obj = new CCalculator();

        obj.set_value(25, 3, 7);

        System.out.println("資料成員的值：");
        obj.showAll();
    }
}