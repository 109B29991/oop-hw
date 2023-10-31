class CSphere {
    private int x; // 圓心的x座標
    private int y; // 圓心的y座標
    private int z; // 圓心的z座標
    private int radius; // 圓球的半徑

    void setLocation(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    void setRadius(int radius) {
        this.radius = radius;
    }

    double surfaceArea() {
        return 4 * Math.PI * radius * radius;
    }

    double volume() {
        return (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
    }

    void showCenter() {
        System.out.println("圓心座標：(" + x + ", " + y + ", " + z + ")");
    }
}

public class Ex16 {
    public static void main(String[] args) {
        CSphere sphere;
        sphere = new CSphere();

        sphere.setLocation(3, 4, 5);
        sphere.setRadius(1);

        sphere.showCenter();
        double surfaceArea = sphere.surfaceArea();
        System.out.println("圓球的表面積： " + surfaceArea);

        double vol = sphere.volume();
        System.out.println("圓球的體積： " + vol);

    }
}