package inheritanse;

import oops.adderss;

public class Employe {

	
	private String empid;
	private String firstname;
	private int age;
	private adderss add;
	
	
	@Override
	public String toString() {
		return "Employe [empid=" + empid + ", firstname=" + firstname + ", age=" + age + ", add=" + add + "]";
	}


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



	public adderss getAdd() {
		return add;
	}



	public void setAdd(adderss add) {
		this.add = add;
	}
	
	
	
	
}
