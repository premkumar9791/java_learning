package oops;

import java.text.ParseException;
import java.util.Arrays;



public class inheritanse {

	public static void main(String[] args) throws ParseException{
		//Integer employeeId, String employeeName, Double salary, String mail
		//Integer employeeId, String employeeName, Double salary, String mail,String addr
		//Integer employeeId, String employeeName, Double salary, String mail,Date doj
		//Integer employeeId, String employeeName, Double salary, String mail,Date doj,Date dob
		
		
		Employee[] array=new Employee[6];
		array[0]=new Employee(11,"prem",300.000,"premrj9791@gmail.com","chennnai");
		array[1]=new Employee(55,"ram",100.000,"ram123@gmail.com","madhiai");
		array[2]=new Employee(22,"ragul",200.000,"raguk232@gmail.com","chengalpattu"); 
		array[3]=new Employee(44,"suresh",400.000,"suresh2343@gmail.com","kangipuram");
		array[4]=new Employee(99,"nithish",500.000,"nithis8724@gmail.com","velur");
		array[5]=new Employee(9,"gopalu",800.000,"gopalu1122@gmail.com","thirunalveli");
		
		 printEmployee(array);
		 printArray(array);
	}

	private static void printEmployee(Employee[] array) {
	
			
		      for (int i = 0; i < array.length; i++) {
				    System.out.println(array[i] + " ");
				  }	
	}
	
	
	public static void printArray(Employee[] Array) {
		
		System.out.println("beforfe sorting.......");
		for(int i=0;i<Array.length;i++) {
			
			System.out.println(Array[i].getEmployeeName());
			System.out.println(Array[i].getSalary());
			System.out.println(Array[i].getEmployeeId());

			System.out.println("------------");
		}
		
		
		
		Arrays.sort(Array,new SortbyEmpId());
		
		  
		System.out.println("after  sorting.......");

	for(int i=0;i<Array.length;i++) {
			
		System.out.println(Array[i].getEmployeeName());
		System.out.println(Array[i].getSalary());
		System.out.println(Array[i].getEmployeeId());
			System.out.println("------------");
		}

}
}
