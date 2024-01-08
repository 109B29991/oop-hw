class LCD { // (1)
    int inch_10 = 2000;
    t inch_15 = 2500;
    int inch_17 = 3000;
}

class CPU extends LCD { // (2)
    int speed_166 = 6000;
    int speed_220 = 8000;
    int speed_240 = 11000;
}

class HD extends CPU { // (3)
    int G_120 = 2400;
    int G_160 = 2800;
}

// (4)
class MiniNote extends HD { // (5)
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

class Note15 extends HD { // (6)
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
        MiniNote obj1 = new MiniNote(); // (8)
        Note15 obj2 = new Note15();
        System.out.println(obj1.getName() + " cost:" + obj1.getCost() + ", price:" + obj1.getPrice());
        System.out.println(obj2.getName() + " cost:" + obj2.getCost() + ", price:" + obj2.getPrice());
    }
}