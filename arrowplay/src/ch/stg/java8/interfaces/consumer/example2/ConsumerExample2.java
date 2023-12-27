package ch.stg.java8.interfaces.consumer.example2;

import java.util.List;
import java.util.function.Consumer;

import ch.stg.java8.interfaces.mocks.Student;
import ch.stg.java8.interfaces.mocks.StudentDataBase;

public class ConsumerExample2 {

	public static void main(String[] args) {
		Consumer<Student> c1 = System.out::println;
		List<Student> students = StudentDataBase.getAllStudents();
		students.forEach(c1);
		printNameAndActivities();
	}

	public static void printNameAndActivities() {
		Consumer<Student> c2 = (student) -> System.out.print(student.getName());
		Consumer<Student> c3 = (student) -> System.out.println(student.getActivities());
		
		List<Student> students = StudentDataBase.getAllStudents();
		students.forEach(c2.andThen(c3));
	
	}
	
	
	
}
