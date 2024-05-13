package try_catch;

public class try_catch {

	public static void main(String[] args) {
		
		System.out.println("line1");
		m1();
		m2();
		System.out.println("line4");
		m3();
		System.out.println("line5");
		m4();
		System.out.println("line7");
		
	}

	private static void m4() {
		// TODO Auto-generated method stub
		try {
			int a[]= {1,2};
			a[2]=3/2;
		} catch (ArithmeticException | ArrayIndexOutOfBoundsException ae) {
			System.out.println("divide by zero");
		}
		finally {
			System.out.println("finally");
		}
	}

	private static void m3() {
		
		try {
			int a[]= {1,2};
			a[2]=3/2;
		} catch (ArithmeticException a) {
			System.out.println("divide by zero");
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("array index bound");
		}finally {
			System.out.println("finally");
		}
		
	}

	private static void m1() {
		
		int a=1,b=0,c1=0;
		
		 try {
			c1=a/b;
			
			System.out.println(c1);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("divide by zero error ");
		}
		 finally {
			 System.out.println("finally error ");
		 }
		
	}
	private static void m2() {
		
		int a=1,b=2,c1=0;
		
		 try {
			c1=a/b;
			
			System.out.println(c1);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
