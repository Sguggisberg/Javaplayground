package ch.stg.allgemein.call.by.value;

public class Example1 {
    public static void main(String[] args) {
        int test1 = 1;
        change(test1);

        int test2 = test1;
        test1++;
        System.out.println("test1: " + test1);
        System.out.println("test2: " + test2);
    }

    private static void change(int test) {
        System.out.println("other test: " + test);
        test++;
        System.out.println("other test: " +test);
    }
}
