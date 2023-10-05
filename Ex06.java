class CCircle {
    double pi = 3.14;
    double radius;

    void show_periphery() {
        System.out.println("periphery = " + 2 * pi * radius);
        System.out.println("periphery = " + 2 * this.pi * this.radius);
    }
}

public class Ex06 {
    public static void main(String[] args) {
        CCircle cir1;
        cir1 = new CCircle();

        cir1.radius = 3.0;

        System.out.print("圓周長= ");
        cir1.show_periphery();
    }
}