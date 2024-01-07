package ch.stg.pattern.adapter.example1;

public class Main {

	public static void main(String[] args) {
		/** Using Class/Two-way adapter **/
		EmployeeClassAdapter employeeClassAdapter = new EmployeeClassAdapter();
		populateEmployeeData(employeeClassAdapter);
		BusinessCardDesigner businessCardDesigner = new BusinessCardDesigner();
		String card = businessCardDesigner.designCard(employeeClassAdapter);
		System.out.println(card);

		/** Using Object Adapter **/
		Employee employee = new Employee();
		populateEmployeeData(employee);
		EmployeeObjectAdapter objectAdapter = new EmployeeObjectAdapter(employee);
		BusinessCardDesigner businessCardDesigner2 = new BusinessCardDesigner();
		String card2 = businessCardDesigner2.designCard(objectAdapter);
		System.out.println(card2);

	}

	private static void populateEmployeeData(Employee employee) {
		employee.setFullName("Elliot Alderson");
		employee.setJobTitle("Security Engineer");
		employee.setOfficeLocation("Allsafe Cybersecurity, New York City, New York");
	}
}
