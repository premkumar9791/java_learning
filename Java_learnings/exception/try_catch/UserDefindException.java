package try_catch;

import java.util.Scanner;

public class UserDefindException {

	public static void main(String[] arge) { 
	Scanner A=new Scanner(System.in);
	System.out.println("enter age ");
	int age=A.nextInt();
	
	 try {
		findagecal(age);
	} catch (negativeAgeException | OldAgeException e) {
		e.printStackTrace();
	}
	 
	 
	}

	private static void findagecal(int age) throws negativeAgeException,OldAgeException {
	   
		findagecal12(age);
		
	}

	private static void findagecal12(int age)throws negativeAgeException,OldAgeException {
		
		if(age > 0&& age <60) {
			System.out.println("age ok");
		}
		else if (age < 0){
			throw new negativeAgeException("negative age is not allowed");
		}
		else {
			throw new OldAgeException("age is too old ... not allowed");
		}
	}
	
}
