package ch.stg.java8.interfaces.supplier;

import ch.stg.java8.interfaces.mocks.Student;
import java.util.Arrays;
import java.util.function.Supplier;

public class Example1 {
    public static void main(String[] args) {
        Supplier<Student> studentSupplier = () -> new Student("Adam", 2, 3.6, "male", 10,
                Arrays.asList("swimming", "basketball", "volleyball"));
        System.out.println(studentSupplier.get());
    }
}
