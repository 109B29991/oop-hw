class CCircle {
    double area(double r) {
        return Math.PI * r * r;
    }

    float area(float r) {
        return (float) Math.PI * r * r;
    }

    double area(int r) {
        return Math.PI * r * r;
    }
}

public class Ex13 {
    public static void main(String[] args) {
        CCircle circle;
        circle = new CCircle();

        double area1 = circle.area(2);
        System.out.println("半徑為2的圓形面積: " + area1);

        float area2 = circle.area(2.2f);
        System.out.println("半徑為2的圓形面積: " + area2);

        double area3 = circle.area(2.2);
        System.out.println("半徑為2的圓形面積: " + area3);
    }
}
