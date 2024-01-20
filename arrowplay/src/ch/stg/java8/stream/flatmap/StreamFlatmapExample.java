package ch.stg.java8.stream.flatmap;

import java.util.List;

import ch.stg.java8.mocks.Student;
import ch.stg.java8.mocks.StudentDataBase;
import static java.util.stream.Collectors.toList;

public class StreamFlatmapExample {

	public static void main(String[] args) {
		System.out.println(printStudentActivities());
	}

	public static List<String> printStudentActivities() {
		return StudentDataBase.getAllStudents().stream().map(Student::getActivities).flatMap(List::stream).distinct()
				.collect(toList());
	}
}
