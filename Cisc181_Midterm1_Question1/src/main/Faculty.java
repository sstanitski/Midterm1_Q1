package main;

public class Faculty extends Employee{
	private String officehours;
	private String rank;

	
	public Faculty(String fullname, String address, String email, String phonenumber, String office, double salary, MyDate hiredate, String officehours, String rank){
		super(fullname, address, email, phonenumber, office, salary, hiredate);
		this.officehours = officehours;
		this.rank = rank;
	}
	
	public String getOfficehours() {
		return officehours;
	}

	public String getRank() {
		return rank;
	}

	public void setOfficehours(String officehours) {
		this.officehours = officehours;
	}

	public void setRank(String rank) {
		this.rank = rank;
	}

	@Override
	public String toString(){
		return("Class name is: " + this.getClass() + "Person's name is: " + this.getFullname());
	}
}