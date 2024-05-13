package core.basic;

public class basic {
 
	public static void main(String[] args) {
		//data type
//		basic_primitive();
		
		// operator
//		basic_arithmetic();
//		basic_assingment();
	}

	private static void basic_assingment() {
		// TODO Auto-generated method stub
		int num1= 10;
		int num2=30;
		int m=num1=num2;
		int m1=num1+=num2;
		int m2=num1-=num2;
		int m3=num1/=num2;
		int m4=num1%=num2;
		
		System.out.println(m);
		System.out.println(m1);
		System.out.println(m2);
		System.out.println(m3);
		System.out.println(m4);
	}

	private static void basic_arithmetic() {
		// TODO Auto-generated method stub
		int num1=10;
		int num2=30;
		
		System.out.println(num1+num2);
		System.out.println(num1-num2);
		System.out.println(num1*num2);
		System.out.println(num1/num2);
		System.out.println(num1%num2);
	}

	private static void basic_primitive() {
		// TODO Auto-generated method stub
		
		 //numeric 
		//byte 100 to -100 
		byte a_min=-100;
		byte a_max=100;
		
		//short 5000 to -777
		short b_min=-777;
		short b_max=5000;
		
		//integer  50000 to -50000
		int c_min=-50000;
		int c_max=50000;
		
		//long 666000L to -222000L
		long d_max=666000L;
		long d_min=-222000L;
		
		
		 //floating
		// float 123.4f to 768.5f
		float e_max=768.5f;
		float e_min=123.4f;
		
		//double 345.6 to 125.7
		double f_max=345.6;
		double f_min=125.7;
		
		 //non numeric
		//char ‘A’
		 char ch='A';
		 char ch_sm='a';
		 
		 //boolean true or false
		 boolean yes=true;
		 boolean no=false;
		
		 
		
	    //byte output
		System.out.println(a_min);
		System.out.println(a_max);
		//short output
		System.out.println(b_min);
		System.out.println(b_max);
		//integer output
		System.out.println(c_min);
		System.out.println(c_max);
	    //long output
		System.out.println(d_min);
		System.out.println(d_max);
	    //float output
		System.out.println(e_min);
		System.out.println(e_max);
	    //double output
		System.out.println(f_min);
		System.out.println(f_max);
		//char
		System.out.println(ch);
        System.out.println(ch_sm);
        //boolean
        System.out.println(yes);
        System.out.println(no);
	}
}
