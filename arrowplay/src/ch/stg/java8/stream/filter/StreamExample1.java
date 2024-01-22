package ch.stg.java8.stream.filter;

import ch.stg.java8.mocks.Student;
import ch.stg.java8.mocks.StudentDataBase;

import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamExample1 {

    private static final Predicate<Student> STUDENT_PREDICATE = student -> student.getGradeLevel() >= 3;
    private static final Predicate<Student> STUDENT_PREDICATE_GPA = student -> student.getGpa() >= 3.9;

    public static void main(String[] args) {
        Map<String, List<String>> studentMap = StudentDataBase.getAllStudents().stream()
                .filter(STUDENT_PREDICATE)
                .filter(STUDENT_PREDICATE_GPA)
                .collect(Collectors.toMap(Student::getName, Student::getActivities));
        System.out.println(studentMap);
    }
}
