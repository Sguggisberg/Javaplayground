package ch.stg.generic.bounded;

public class Start {
    public static void main(String[] args) {
        Printer<Cat> printer = new Printer<>(new Cat());
        printer.print();
    }
}
