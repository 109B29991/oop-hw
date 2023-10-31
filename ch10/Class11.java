class CShape {
    public double area() {
        return 0.0;
    }
}

class CCircle extends CShape { // (a)
    private double radius;

    public CCircle(double r) {
        radius = r;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }
}

class CSquare extends CShape { // (b)
    private double side;

    public CSquare(double s) {
        side = s;
    }

    @Override
    public double area() {
        return side * side;
    }
}

class CTriangle1 extends CShape { // (c)
    private double base;
    private double height;

    public CTriangle1(double b, double h) {
        base = b;
        height = h;
    }

    @Override
    public double area() {
        return 0.5 * base * height;
    }
}

public class Class11 {
    public static double largest(CShape[] shapes) { // (e)
        double maxArea = 0.0;
        for (CShape shape : shapes) {
            double area = shape.area();
            if (area > maxArea) {
                maxArea = area;
            }
        }
        return maxArea;
    }

    public static void main(String[] args) {
        // (d)
        CCircle circle1 = new CCircle(6.0);
        CCircle circle2 = new CCircle(4.0);

        CSquare square1 = new CSquare(5.0);
        CSquare square2 = new CSquare(6.0);

        CTriangle1 triangle1 = new CTriangle1(9.0, 5.0);
        CTriangle1 triangle2 = new CTriangle1(7.0, 2.0);

        CShape[] shapes = { circle1, circle2, square1, square2, triangle1, triangle2 };
        double maxArea = largest(shapes);
        System.out.println("最大面積是: " + maxArea);
    }
}