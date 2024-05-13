package oops;

public class person {

	
	private String empid;
	private String firstname;
	private int age;
	private adderss add;
	
	
	

	
	public String getEmpid() {
		return empid;
	}
	public void setEmpid(String empid) {
		this.empid = empid;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public person(String empid, String firstname, int age) {
		super();
		this.empid = empid;
		this.firstname = firstname;
		this.age = age;
		
	}
	
	@Override
	public String toString() {
		return "person [empid=" + empid + ", firstname=" + firstname + ", age=" + age + ", add=" + add + "]";
	}
	public person() {
		add=new adderss();
	}
	public adderss getAdd() {
		return add;
	}
	public void setAdd(adderss add) {
		this.add = add;
	}
	
	
}
