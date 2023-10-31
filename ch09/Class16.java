import java.util.Scanner;

class Circle {
    private static double pi = 3.14;
    private double radius;

    public Circle(double r) {
        radius = r;
    }

    public void show() {
        System.out.printf("area=%6.2f\n", pi * radius * radius);
    }
}

public class Class16 {
    public static void main(String[] args) {
        Circle[] cir;
        cir = new Circle[6];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < cir.length; i++) {
            System.out.print("Enter the radius for cir[" + i + "]: ");
            double radius = scanner.nextDouble();
            cir[i] = new Circle(radius);
        }

        for (int i = 0; i < cir.length; i++) {
            System.out.println("Results for cir[" + i + "]:");
            cir[i].show();
        }

        scanner.close();
    }
}