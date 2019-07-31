package Excercise1;

import java.util.ArrayList;
import Excercise1.Employee;

public class question4e {
	
	public static void main(String[] args) {
		
		ArrayList<Employee> EmployeeDB = new ArrayList<Employee>();
		 
		for (int i = 1; i<=30 ; i++) {
			String diff = Integer.toString(i);

			Employee obj = new Employee(diff, i, "CSE", 10000, "add"+diff, 971738467, diff + "@mail.com", "pos" + diff);
			EmployeeDB.add(obj);
		}
		
		System.out.println(EmployeeDB.get(0).toString());
		System.out.println(EmployeeDB.get(1).toString());
		EmployeeDB.get(0).delete();
		int shifted = 0;
		for (int i = 0; i<29 ; i++) {
			shifted +=1;
			Employee obj = EmployeeDB.get(i+1);
			EmployeeDB.set(i, obj);
		}
		System.out.println(EmployeeDB.get(0).toString());
		System.out.println(EmployeeDB.get(1).toString());
		
		System.out.println(shifted);
		
	}
}