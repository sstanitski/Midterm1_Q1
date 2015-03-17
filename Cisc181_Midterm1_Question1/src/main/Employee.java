package main;

public class Employee extends Person{

	private String office;
	private double salary;
	private MyDate hiredate;

	
	public Employee(String fullname, String address, String email, String phonenumber, String office, double salary, MyDate hiredate){
		super(fullname, address, email, phonenumber);
		this.office = office;
		this.salary = salary;
		this.hiredate = hiredate;
		
	}

	public String getOffice() {
		return office;
	}

	public double getSalary() {
		return salary;
	}

	public MyDate getHiredate() {
		return hiredate;
	}

	public void setOffice(String office) {
		this.office = office;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public void setHiredate(MyDate hiredate) {
		this.hiredate = hiredate;
	}
	
	@Override
	public String toString(){
		return("Class name is: " + this.getClass() + "Person's name is: " + this.getFullname());
	}
}
