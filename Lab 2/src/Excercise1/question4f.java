package Excercise1;

import java.util.ArrayList;
import Excercise1.Employee;

public class question4f {
	
	public static void main(String[] args) {
		
		ArrayList<Employee> EmployeeDB = new ArrayList<Employee>();
		 
		for (int i = 1; i<=30 ; i++) {
			String diff = Integer.toString(i);

			Employee obj = new Employee(diff, i, "CSE", 10000, "add"+diff, 971738467, diff + "@mail.com", "pos" + diff);
			EmployeeDB.add(obj);
		}
		
		System.out.println(EmployeeDB.get(2).toString());
		System.out.println(EmployeeDB.get(3).toString());
		EmployeeDB.get(2).delete();
		int shifted = 0;
		for (int i = 2; i<29 ; i++) {
			shifted +=1;
			Employee obj = EmployeeDB.get(i+1);
			EmployeeDB.set(i, obj);
		}
		System.out.println(EmployeeDB.get(2).toString());
		System.out.println(EmployeeDB.get(3).toString());
		
		System.out.println(shifted);
		
	}
}