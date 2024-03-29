class LCD {
    int inch_10 = 2000;
    int inch_15 = 2500;
    int inch_17 = 3000;
}

class CPU extends LCD {
    int speed_166 = 6000;
    int speed_220 = 8000;
    int speed_240 = 11000;
}

class HD extends CPU {
    int G_120 = 2400;
    int G_160 = 2800;
}

class MiniNote extends HD {
    int inch = inch_10;
    int speed = speed_166;
    int HD = G_120;
    double cost = (inch + speed + HD) * 1.4;
    int price = (inch + speed + HD) * 2;

    double getCost() {
        return cost;
    }

    int getPrice() {
        return price;
    }

    String name;

    String getName() {
        name = "MiniNote";
        return name;
    }
}

class Note15 extends HD {
    int inch = inch_15;
    int speed = speed_220;
    int HD = G_160;
    double cost;
    int price;

    double getCost() {
        cost = (inch + speed + HD) * 1.4;
        return cost;
    }

    int getPrice() {
        price = (inch + speed + HD) * 2;
        return price;
    }

    String name;

    String getName() {
        name = "Note15";
        return name;
    }
}

class PC extends HD {
    int speed = speed_240;
    int HD = G_160;
    int cost = (speed + HD) + 500;
    double price = (speed + HD) * 1.8;

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

class MultiPC extends HD {
    int speed = speed_240;
    int HD = G_160;
    int speed2_n = 0;
    int HD_n = 0;
    double cost;
    double price;

    double getCost() {
        cost = (speed * speed2_n + HD * HD_n) * 1.2;
        return cost;
    }

    double getPrice() {
        price = (speed * speed2_n + HD * HD_n) * 1.8;
        return price;
    }

    MultiPC_3(int s, int h) {
        speed2_n = s;
        HD_n = h;
    }

    String name;

    String getName() {
        name = "MultiPC";
        return name;
    }
}

class AllPC { // (2)
    boolean isExpensive(double x, double y) {
        if (x > y) {
            return true;
        } else {
            return false;
        }
    }
}

public class J03 {
    public static void main(String[] args) { // (1)
        Note15 obj1 = new Note15();
        PC obj2 = new PC();
        AllPC obj3 = new AllPC();
        boolean check = obj3.isExpensive(obj1.getPrice(), obj2.getPrice());
        if (check) {
            System.out.println(obj1.getName() + " is more expensive than " + obj2.getName());
        } else {
            System.out.println(obj1.getName() + " is less expensive than " + obj2.getName());
        }
    }
}
