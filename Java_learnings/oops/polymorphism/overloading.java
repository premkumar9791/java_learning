package polymorphism;

public class overloading {

	public static void main(String[] args) {
		
       overload("prem");
       overload(10);
       overload(100.00f);
       overload('c');
       overload("prem","prem2");
	}
	
	
	private static void overload(char f) {
		System.out.println(f);
		
	}
	
	private static void overload(float f) {
		System.out.println(f);
		
	}

	private static void overload(int i) {
		System.out.println(i);
		
	}

	private static void overload(String a, String b) {
		System.out.println(a+""+b);
	}

	private static void overload(String a) {
		System.out.println(a);
	}

}
