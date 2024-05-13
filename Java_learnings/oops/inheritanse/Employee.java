package inheritanse;

import java.util.Comparator;



public class Employee {

            Integer employeeId;
	private String employeeName;
	        Double salary;
	private String mail;
	private String addr;
	
	public static final String company_name="Axis Bank";

	public Employee(Integer employeeId, String employeeName, Double salary, String mail, String addr) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.salary = salary;
		this.mail = mail;
		this.addr = addr;
	}
	
	public Employee(Integer employeeId, String employeeName, Double salary, String mail) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.salary = salary;
		this.mail = mail;
	}
	
	public Employee(Integer employeeId, String employeeName, Double salary) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.salary = salary;
	}

	public Integer getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(Integer employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}
	
	
}


class SortbyEmpId implements Comparator<Employee> {

	public int compare(Employee o1, Employee o2) {
		return (int) (o1.salary - o2.salary);
	}

}
