package ch.stg.functional.interfaces.predicate.example2;

import java.util.List;
import java.util.function.Predicate;
import ch.stg.functional.interfaces.mocks.Student;
import ch.stg.functional.interfaces.mocks.StudentDataBase;

public class PredicateExample2 {

	private static Predicate<Student> p2 = (s) -> s.getGpa() >= 3.9;
	public static Predicate<Student> p1 = (s) -> s.getGradeLevel() >= 3;

	public static void filterStudentByGradeLevelandGpa() {
		List<Student> students = StudentDataBase.getAllStudents();
		students.forEach((student) -> {
			if (p1.and(p2).test(student)) {
				System.out.println(student);
			}
		});
	}

	public static void main(String[] args) {
		filterStudentByGradeLevelandGpa();
	}
}
