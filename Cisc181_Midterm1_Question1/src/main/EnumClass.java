package main;

public enum EnumClass {

	Freshman(1),
	Sophomore(2),
	Junior(3),
	Senior(4);
	
	private int yearofclass;
	
	private EnumClass(int yearofclass){
		this.yearofclass = yearofclass;
	}

	public int getYearofclass() {
		return yearofclass;
	}

	public void setYearofclass(int yearofclass) {
		this.yearofclass = yearofclass;
	}
	
		
}
