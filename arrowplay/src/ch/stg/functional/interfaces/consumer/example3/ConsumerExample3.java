package ch.stg.functional.interfaces.consumer.example3;

import java.util.List;
import java.util.function.Consumer;

import ch.stg.functional.interfaces.mocks.Student;
import ch.stg.functional.interfaces.mocks.StudentDataBase;

public class ConsumerExample3 {
	static Consumer<Student> c1 = (student) -> System.out.println(student);
	static Consumer<Student> c2 = (student) -> System.out.print(student.getName());
	static Consumer<Student> c3 = (student) -> System.out.println(student.getActivities());

	public static void main(String[] args) {
		printNameAndActivitiesUsingCondition();
	}

	public static void printNameAndActivitiesUsingCondition() {
		List<Student> students = StudentDataBase.getAllStudents();
		students.forEach((student -> {
			if (student.getGradeLevel() >= 3) {
				c2.andThen(c3).accept(student);
			}
		}));

	}
}
