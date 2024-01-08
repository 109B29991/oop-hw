package case_study_1;

class LCD_2 {
    int inch_10 = 2000;
    int inch_15 = 2500;
    int inch_17 = 3000;
}

class CPU_2 extends LCD_2 {
    int speed_166 = 6000;
    int speed_220 = 8000;
    int speed_240 = 11000;
}

class HD_2 extends CPU_2 {
    int G_120 = 2400;
    int G_160 = 2800;
}

// (1)
class PC_2 extends HD_2 {
    int speed = speed_240;
    int HD_2 = G_160;
    int cost = (speed + HD_2) + 500;
    double price = (speed + HD_2) * 1.8;

    int getCost() {
        return cost;
    }

    double getPrice() {
        return price;
    }

    String name;

    String getName() {
        name = "PC";
        return name;
    }
}

// (2)
class MultiPC_2 extends HD_2 {
    int speed = speed_240;
    int HD_2 = G_160;
    int speed_n = 0;
    int HD_n = 0;
    double cost;
    double price;

    double getCost() {
        cost = (speed * speed_n + HD_2 * HD_n) * 1.2;
        return cost;
    }

    double getPrice() {
        price = (speed * speed_n + HD_2 * HD_n) * 1.8;
        return price;
    }

    MultiPC_2(int s, int h) {
        speed_n = s;
        HD_n = h;
    }

    String name;

    String getName() {
        name = "MultiPC";
        return name;
    }
}

public class JPD06_2 {
    public static void main(String[] args) {
        // (3)
        PC_2 obj1 = new PC_2();
        MultiPC_2 obj2 = new MultiPC_2(2, 4);
        MultiPC_2 obj3 = new MultiPC_2(4, 8);
        System.out.println(obj1.getName() + " cost:" + obj1.getCost() + ", price:" + obj1.getPrice());
        System.out.println(obj2.getName() + ": " + obj2.speed_n + "CPU,  " + obj2.HD_n + "HD, cost:" + obj2.getCost()
                + ", price:" + obj2.getPrice());
        System.out.println(obj3.getName() + ": " + obj3.speed_n + "CPU,  " + obj3.HD_n + "HD, cost:" + obj3.getCost()
                + ", price:" + obj3.getPrice());
    }
}

class LCD_1 { // (1)
    int inch_10 = 2000;
    t inch_15 = 2500;
    int inch_17 = 3000;
}

class CPU_1 extends LCD_1 { // (2)
    int speed_166 = 6000;
    int speed_220 = 8000;
    int speed_240 = 11000;
}

class HD_1 extends CPU_1 { // (3)
    int G_120 = 2400;
    int G_160 = 2800;
}

// (4)
class MiniNote_1 extends HD_1 { // (5)
    int inch = inch_10;
    int speed = speed_166;
    int HD_1 = G_120;
    double cost;
    int price;

    double getCost() {
        cost = (inch + speed + HD_1) * 1.4;
        return cost;
    }

    // (7)
    int getPrice() {
        price = (inch + speed + HD_1) * 2;
        return price;
    }

    String name;

    String getName() {
        name = "MiniNote";
        return name;
    }

}

// (6)
class Note15_1 extends HD_1 {
    int inch = inch_15;
    int speed = speed_220;
    int HD_1 = G_160;
    double cost;
    int price;

    double getCost() {
        cost = (inch + speed + HD_1) * 1.4;
        return cost;
    }

    // (7)
    int getPrice() {
        price = (inch + speed + HD_1) * 2;
        return price;
    }

    String name;

    String getName() {
        name = "Note15";
        return name;
    }
}

public class J01 {
    public static void main(String[] args) {
        // (8)
        MiniNote_1 obj1 = new MiniNote_1();
        Note15_1 obj2 = new Note15_1();
        System.out.println(obj1.getName() + " cost:" + obj1.getCost() + ", price:" + obj1.getPrice());
        System.out.println(obj2.getName() + " cost:" + obj2.getCost() + ", price:" + obj2.getPrice());
    }
}