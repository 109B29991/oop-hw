class CTest {
    void test(int num) {
        if (num == 0) {
            System.out.println("此數為 0");
        } else if (num % 2 == 0) {
            System.out.println("此數為偶數");
        } else {
            System.out.println("此數為奇數");
        }
    }
}

public class Ex07 {
    public static void main(String[] args) {
        CTest test;
        test = new CTest();

        test.test(3);
        test.test(8);
        test.test(0);
    }
}