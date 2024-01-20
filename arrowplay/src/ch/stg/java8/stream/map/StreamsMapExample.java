package ch.stg.java8.stream.map;

import java.util.List;
import ch.stg.java8.mocks.Student;
import ch.stg.java8.mocks.StudentDataBase;
import static java.util.stream.Collectors.toList;

public class StreamsMapExample {

	public static List<String> namesList() {
		return StudentDataBase.getAllStudents().stream().map(Student::getName).map(String::toUpperCase).collect(toList());
	}

	public static void main(String[] args) {
		System.out.println(namesList());
	}
}
