package main;

public class Staff extends Employee{
	private String title;
	
	public Staff(String fullname, String address, String email, String phonenumber, String office, double salary, MyDate hiredate, String title){
		super(fullname, address, email, phonenumber, office, salary, hiredate);
		this.title = title;
		
	}
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@Override
	public String toString(){
		return("Class name is: " + this.getClass() + "Person's name is: " + this.getFullname());
	}

}
