package Excercise1;

import java.util.ArrayList;
import Excercise1.Employee;

public class question3 {
	
	public static void main(String[] args) {
		
		ArrayList<Employee> EmployeeDB = new ArrayList<Employee>();
		 
		for (int i = 1; i<=30 ; i++) {
			String diff = Integer.toString(i);

			Employee obj = new Employee(diff, i, "CSE", 10000, "add"+diff, 971738467, diff + "@mail.com", "pos" + diff);
			EmployeeDB.add(obj);
		}
		
		for (int i = 1; i<=30 ; i++) {
			System.out.println("Checking : " + EmployeeDB.get(i-1).Id);
		}
		
		
//	    System.out.println(EmployeeDB.toString());

	}
}