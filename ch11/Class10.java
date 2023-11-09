interface Data {
    public void best();

    public void failed();
}

interface test extends Data {
    public void showdata();

    public double average();
}

class stu implements test {
    protected String name;
    protected int math;
    protected int english;

    public stu(String a, int b, int c) {
        name = a;
        math = b;
        english = c;
    }

    public void best() {
        if (math > english) {
            System.out.println("Judy scored the best in math");
        } else {
            System.out.println("Judy scored the best in english");
        }
    }

    public void failed() {
        if (math < 60) {
            System.out.println("Judy scored below 60 in math");
        }
        if (english < 60) {
            System.out.println("Judy scored below 60 in english");
        }
    }

    public double average() {
        return (double) (math + english) / 2;
    }

    public void showdata() {
        System.out.println("name：" + name);
        System.out.println("math = " + math);
        System.out.println("english = " + english);
        System.out.println("average = " + average());
    }

    public void show() {
        showdata();
        best();
        failed();

    }
}

public class Class10 {
    public static void main(String[] args) {
        stu stu = new stu("Judy", 58, 91);
        stu.show();
    }
}