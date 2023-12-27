package ch.stg.functional.interfaces.example3;

import ch.stg.functional.interfaces.mocks.Student;
import ch.stg.functional.interfaces.mocks.StudentDataBase;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Predicate;

import static ch.stg.functional.interfaces.predicate.example2.PredicateExample2.p1;

public class Example3 {

    private static BiFunction<List<Student>, Predicate<Student>, Map<String, Double>> biFunction = (((students, studentPredicate) ->
    {
        Map<String, Double> studentGradeMap = new HashMap<>();
        students.forEach(student -> {
            if (studentPredicate.test(student)) {
                studentGradeMap.put(student.getName(), student.getGpa());
            }
        });
        return studentGradeMap;
    }
    ));

    public static void main(String[] args) {
        System.out.println(biFunction.apply(StudentDataBase.getAllStudents(), p1));
    }
}
