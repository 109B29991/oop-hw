class Caaa {
    private int value;

    public Caaa() {
        value = 10; // (a)
        System.out.println("value=" + value);
    }

    public Caaa(int i) {
        value = i;
        System.out.println("value=" + value);
    }
}

public class Class03 {
    public static void main(String[] args) {
        Caaa obj1 = new Caaa();
        Caaa obj2 = new Caaa(12);

        // b:21行调用的是第5行的函数Caaa()，而第22行调用的是10行的函數Caaa(int i)
        // c:可以，因為不影響程式碼執行
        // d:否，因為在現有的程式碼中，並未出現修改value的程式碼，從而干擾程式的結果
    }
}
