package oops;

public class AggregationAndCompisition {

	public static void main(String[] args) {
		aggregationDemo();
	//	compositionDemo();

	}

	private static void compositionDemo() {
		
		person person=new person();
		
		person.setEmpid("123");
		person.setFirstname("prem");
		person.setAge(18);
	
		person.getAdd().setAddline1("num1");
		person.getAdd().setAddline2("num2");
		person.getAdd().setCity("chennai");
		person.getAdd().setStreet("Street");
		
	  System.out.println(person);
	  
	  person=null;
	  
	  
	  System.out.println("-----------");
	  System.out.println(person);
	  if(person != null){
			  System.out.println(person.getAdd());	
		}
		else {
			 System.out.println("adres not exsis");
		}
		
	}

	private static void aggregationDemo() {
		
		
		adderss add=new adderss();
		
		add.setAddline1("num1");
		add.setAddline2("num2");
		add.setCity("chennai");
		add.setStreet("Street");
		
		Employe emp=new Employe();
		
		emp.setEmpid("123");
		emp.setFirstname("prem");
		emp.setAge(18);
	    emp.setAdd(add);
		
		
		
		System.out.println(emp);
		
		 emp=null;
		  
		  
		  System.out.println("-----------");
		  System.out.println(add);
		  		
	}

}
