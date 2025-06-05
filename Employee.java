package Spring_Demo;

public class Employee {
	private int Eid;
	private String Name;
	private String Position;
	private double Salary;
	public int getEid() {
		return Eid;
	}
	public void setEid(int eid) {
		Eid = eid;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getPosition() {
		return Position;
	}
	public void setPosition(String position) {
		Position = position;
	}
	public double getSalary() {
		return Salary;
	}
	public void setSalary(double salary) {
		Salary = salary;
	}

	public void Display() {
		System.out.println("|Eid:"+Eid+"| Name:"+Name+"| Position:"+Position+"| Salary:"+Salary);
	}
	
	
	

}
