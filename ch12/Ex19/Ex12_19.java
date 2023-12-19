package Ex19;

class calculate {
    int n = 5;
    double sum = 0.0;

    public calculate() {
        for (int i = 1; i <= n; i++) {
            sum += Math.sqrt(i);
        }
    }

    void show() {
        System.out.println(sum);
    }
}

public class Ex12_19 {
    public static void main(String[] args) {
        calculate f = new calculate();
        f.show();
    }
}
