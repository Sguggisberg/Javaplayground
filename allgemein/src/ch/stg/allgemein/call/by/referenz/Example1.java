package ch.stg.allgemein.call.by.referenz;

public class Example1 {
    public static void main(String[] args) {
        Test test = new Test("Test1");
        Test test2 = test;
        System.out.println("test ref: " + test);
        System.out.println("test2 ref: " + test2);
    }

    static class Test {
        private String name;

        Test(String name) {
            this.name = name;
        }

        String getName() {
            return this.name;
        }

    }
}
