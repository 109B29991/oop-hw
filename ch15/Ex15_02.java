class Test extends Thread { // (a)
    private String id;

    public Test(String str) {
        this.id = str;
    }

    public void run() { // (b)
        for (int i = 1; i <= 5; i++) {
            for (int j = 0; j < 100000000; j++)
                ;
            System.out.println(id + " " + i); // (d)
        }
    }
}

public class Ex15_02 {
    public static void main(String[] args) {
        Test hi = new Test("Hello"); // (c)
        Test bye = new Test("Good bye");

        hi.run();
        bye.run();
    }
}