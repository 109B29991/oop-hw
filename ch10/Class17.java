class Car {
    protected String owner;
    protected String id;

    Car(String own, String s) {
        owner = own;
        id = s;
    }

    final void show() {
        System.out.println("車主姓名:" + owner);
        System.out.println("車牌號碼:" + id);
    }
}

class CColor extends Car {
    private String color;

    CColor(String own, String s, String c) {
        super(own, s);
        color = c;
    }
}

public class Class17 {
    public static void main(String[] args) {
        CColor mycar = new CColor("Riaan", "A1-2345", "Black");
        mycar.show();
    }
}
