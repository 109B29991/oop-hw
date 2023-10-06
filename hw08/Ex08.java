class CTest {
    void test(int num) {
        if (num > 0) {
            System.out.println("此數為正數");
        } else if (num < 0) {
            System.out.println("此數為負數");
        } else {
            System.out.println("此數為 0");
        }
    }
}

public class Ex08 {
    public static void main(String[] args) {
        CTest test;
        test = new CTest();

        test.test(-4);
        test.test(8);
        test.test(0);
    }
}
