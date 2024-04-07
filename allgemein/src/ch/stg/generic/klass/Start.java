package ch.stg.generic.klass;

public class Start {

    public static void main(String[] args) {
        Printer<String> stringPrinter = new Printer<>("Hallo");
        stringPrinter.print();
    }
}
