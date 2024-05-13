package oops;

public class p_overloading {

	public static void main(String[] args) {
		
		int a=2;
		int b=3;
		int c=4;
		
		
		overloading();
		
		
		int ans=overloading(a);
		int ans2=overloading(a,b);
		int ans3=overloading(a,b,c);
        System.out.println(ans);
        System.out.println(ans2);
        System.out.println(ans3);
	}

	private static int overloading(int a, int b, int c) {
		int b1=(a+b+c)/2;
		return b1;

	}

	private static int overloading(int a, int b) {
		
		int b1=(a+b)/2;
		return b1;
	}

	private static int overloading(int a) {
		int b=a*a;
		return b;
	}

	private static void overloading() {
		
		System.out.println("no_argument");
		
	}

}
