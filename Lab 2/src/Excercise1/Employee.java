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
	
	int columnSize = 16;
	
	public String getFixed(String st) {
		
		if(st == null) {
			st = "null";
		}
		
		String fix = "";
		int spCnt = (columnSize - st.length())/2;
		for (int i=0; i<=spCnt; i++) {
			fix+=" ";
		}
		fix += st;
		for (int i=0; i<=spCnt-1; i++) {
			fix+=" ";
		}
		int diff = columnSize - (spCnt*2) - st.length();
		for (int i=0; i<diff; i++) {
			fix+=" ";
		}
		fix+="|";
		return fix;
		
	}
	public String getFixed(int num) {

		String st = Integer.toString(num);
		return getFixed(st);
		
	}

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
		
		String temp = "";
		temp += getFixed("Name");
		temp += getFixed("Id");
		temp += getFixed("Department");
		temp += getFixed("Salary");
		temp += getFixed("Address");
		temp += getFixed("Contact");
		temp += getFixed("Email");
		temp += getFixed("Position");

		return temp;
    }
	
	@Override
    public String toString() {
		
		String temp = "";
		temp += getFixed(this.Name);
		temp += getFixed(this.Id);
		temp += getFixed(this.Department);
		temp += getFixed(this.Salary);
		temp += getFixed(this.Address);
		temp += getFixed(this.Contact);
		temp += getFixed(this.Email);
		temp += getFixed(this.Position);

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
