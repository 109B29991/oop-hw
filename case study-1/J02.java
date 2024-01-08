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

class PC extends HD { // (1)
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

class MultiPC extends HD { // (2)
    int speed = speed_240;
    int HD = G_160;
    int speed_n = 0;
    int HD_n = 0;
    double cost;
    double price;

    double getCost() {
        cost = (speed * speed_n + HD * HD_n) * 1.2;
        return cost;
    }

    double getPrice() {
        price = (speed * speed_n + HD * HD_n) * 1.8;
        return price;
    }

    MultiPC(int s, int h) {
        speed_n = s;
        HD_n = h;
    }

    String name;

    String getName() {
        name = "MultiPC";
        return name;
    }
}

public class J02 {
    public static void main(String[] args) {
        PC obj1 = new PC();
        MultiPC obj2 = new MultiPC(2, 4); // (3)
        MultiPC obj3 = new MultiPC(4, 8);
        System.out.println(obj1.getName() + " cost:" + obj1.getCost() + ", price:" + obj1.getPrice()); // (4)
        System.out.println(obj2.getName() + ": " + obj2.speed_n + "CPU,  " + obj2.HD_n + "HD, cost:" + obj2.getCost()
                + ", price:" + obj2.getPrice());
        System.out.println(obj3.getName() + ": " + obj3.speed_n + "CPU,  " + obj3.HD_n + "HD, cost:" + obj3.getCost()
                + ", price:" + obj3.getPrice());
    }
}
