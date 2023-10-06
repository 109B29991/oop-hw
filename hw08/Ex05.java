class CBox {
    int length, width, height;

    int volume() {
        return length * width * height;
    }

    int surfaceArea() {
        return 2 * (length * width + length * height + width * height);
    }

    void showData() {
        System.out.println("長: " + length);
        System.out.println("寬: " + width);
        System.out.println("高: " + height);
    }

    void showAll() {
        showData();
        System.out.println("表面積: " + surfaceArea());
        System.out.println("體積: " + volume());
    }
}

public class Ex05 {
    public static void main(String[] args) {
        CBox box;
        box = new CBox();

        box.length = 1;
        box.width = 1;
        box.height = 1;

        System.out.println("box物件的資料:");
        box.showData();

        System.out.println("\nbox物件的詳細資料:");
        box.showAll();
    }
}
