package oops;

import java.sql.Date;

class EmployeeDoj extends BTjavaTutorialsUtil {

	private Date doj;
    private Date dob;

    
	public EmployeeDoj(Date doj, Date dob) {
		super();
		this.doj = doj;
		this.dob = dob;
	}
	
	public EmployeeDoj(Date doj) {
		super();
		this.doj = doj;
	}
	
	public EmployeeDoj() {
		super();
		
	}
	
	
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}

	

	public Date getDoj() {
		return doj;
	}

	public void setDoj(Date doj) {
		this.doj = doj;
	}


}
