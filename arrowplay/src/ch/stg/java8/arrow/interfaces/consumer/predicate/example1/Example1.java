package ch.stg.java8.arrow.interfaces.consumer.predicate.example1;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Predicate;

import ch.stg.java8.mocks.Student;
import ch.stg.java8.mocks.StudentDataBase;

public class Example1 {

	Predicate<Student> p1 = (s) -> s.getGradeLevel() >= 3;
	Predicate<Student> p2 = (s) -> s.getGpa() >= 3.9;

	BiConsumer<String, List<String>> studentsBiConsumer = (name, activities) -> System.out
			.println(name + " : " + activities);

	Consumer<Student> studentConsumer = (student) -> {
		if (p1.and(p2).test(student)) {
			studentsBiConsumer.accept(student.getName(), student.getActivities());
		}
	};

	public void printNameAndActivities(List<Student> students) {
		students.forEach(studentConsumer);
	}

	public static void main(String[] args) {
		List<Student> students = StudentDataBase.getAllStudents();
		new Example1().printNameAndActivities(students);
	}

}
