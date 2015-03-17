package main;

public class Student extends Person{
	
	private EnumClass classStatus;
	
	public Student(String fullname, String address, String email, String phonenumber, EnumClass classStatus){
		super(fullname, address, email, phonenumber);
		this.classStatus = classStatus;
		
	}
	
	public EnumClass getClassStatus() {
		return classStatus;
	}

	public void setClassStatus(EnumClass classStatus) {
		this.classStatus = classStatus;
	}

	@Override
	public String toString(){
		return("Class name is: " + this.getClass() + "Person's name is: " + this.getFullname());
	}
}
