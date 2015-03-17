package main;

public class Person {
	private String fullname;
	private String address;
	private String email;
	private String phonenumber;
	
	public Person(){
		
	}
	
	
	public String getFullname() {
		return fullname;
	}

	public String getAddress() {
		return address;
	}

	public String getEmail() {
		return email;
	}

	public String getPhonenumber() {
		return phonenumber;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}

	public Person(String fullname, String address, String email, String phonenumber){
		super();
		this.fullname = fullname;
		this.address = address;
		this.email = email;
		this.phonenumber = phonenumber;
	}
	@Override
	public String toString(){
		return("Class name is: " + this.getClass() + "Person's name is: " + this.getFullname());
	}
}
