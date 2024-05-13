package oops;

import java.sql.Date;
import java.util.Comparator;


//child class
public class Employee  extends EmployeeDoj{
	
	Integer employeeId;
	private String employeeName;
	 Double salary;
	private String mail;
	
	private String addr;
	
	
	
	
	public static final String COMPANY_NAME="Axis Bank";

	//static variable test
	public Employee(Integer employeeId, String employeeName, Double salary, String mail) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.salary = salary;
		this.mail = mail;
	}
	
	public Employee(Integer employeeId, String employeeName, Double salary, String mail,String addr)
	{
		this(employeeId,employeeName,salary,mail);
		this.setAddr(addr);
		
	}
	
	//static method test
	public Employee(Integer employeeId, String employeeName, Double salary, String mail,Date doj) {
		super(doj);
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.salary = salary;
		this.mail = mail;
		
	}
	public Employee(Integer employeeId, String employeeName, Double salary, String mail,Date doj,Date dob) {
		super(doj,dob);
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.salary = salary;
		this.mail = mail;
		
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
		// Used for sorting in ascending order of roll number
		@Override
		public int compare(Employee o1, Employee o2) {
			return (int) (o1.salary - o2.salary);
		}
	
	}	

