package ch.stg.java8.stream.sorting;

import java.util.Comparator;
import java.util.List;

import ch.stg.java8.mocks.Student;
import ch.stg.java8.mocks.StudentDataBase;
import static java.util.stream.Collectors.toList;

public class Sorting {

	public static void main(String[] args) {
		sortStudentByName2().forEach(System.out::println);
	}

	public static List<Student> sortStudentByName() {
		return StudentDataBase.getAllStudents().stream().sorted(Comparator.comparing(Student::getName))
				.collect(toList());
	}
	
	public static List<Student> sortStudentByName2() {
		return StudentDataBase.getAllStudents().stream().sorted(Comparator.comparing(Student::getName).reversed())
				.collect(toList());
	}

}
