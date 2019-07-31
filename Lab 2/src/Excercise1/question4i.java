package Excercise1;

import java.util.ArrayList;
import Excercise1.Employee;

public class question4i {
	
	public static void main(String[] args) {
		
		ArrayList<Employee> EmployeeDB = new ArrayList<Employee>();
		 
		for (int i = 1; i<=30 ; i++) {
			String diff = Integer.toString(i);

			Employee obj = new Employee(diff, i, "CSE", 10000, "add"+diff, 971738467, diff + "@mail.com", "pos" + diff);
			EmployeeDB.add(obj);
		}
		
		EmployeeDB.get(1).delete();

		for (int i = 0; i<30 ; i++) {
			System.out.println(EmployeeDB.get(i).toString());
		}
		
		
		String diff = Integer.toString(1);
		Employee obj = new Employee(diff, 29, "CSE", 10000, "add"+diff, 971738467, diff + "@mail.com", "pos" + diff);
		EmployeeDB.set(1, obj);
		
		for (int i = 0; i<30 ; i++) {
			System.out.println(EmployeeDB.get(i).toString());
		}
		
	}
}