package Excercise1;

public class Employee {

	String Name;
	int Id;
	String Department;
	int Salary;
	String Address;
	int Contact;
	String Email;
	String Position;

	public Employee(
			String _name, 
			int _id, 
			String _dept, 
			int _sal, 
			String _add, 
			int _cont, 
			String _email, 
			String _pos
			) 
	{
		this.Name = _name;
		this.Id = _id;
		this.Department = _dept;
		this.Salary = _sal;
		this.Address = _add;
		this.Contact = _cont;
		this.Email = _email;
		this.Position = _pos;
	}
	
	public String header() {
		return "Name     Id     Department     Salary     Address    Contact     Email     Position\n";
	}
	
	@Override
    public String toString() {
		
		String temp = "  ";
		temp += this.Name + "      ";
		temp += this.Id + "         ";
		temp += this.Department + "         ";
		temp += this.Salary + "       ";
		temp += this.Address +"    ";
		temp += this.Contact + "   ";
		temp += this.Email + "    ";
		temp += this.Position;
		
		return temp;
    }
	
	public void delete() {
		this.Name = null;
		this.Id = 00000;
		this.Department = null;
		this.Salary = 0;
		this.Address = null;
		this.Contact = 00000000000;
		this.Email = null;
		this.Position = null;
    }
}
