package constractors;


class cons_1 {

  String num1;
  String num2;
  int num3;
  static cons_1 n=null;
  
public cons_1() {
	super();
}

public static  cons_1 getinstance() {
	
	if(n==null) {
	  n=new cons_1();
	  return n;
	}
	 return n;
} 
  
public cons_1(String num1,String num2,int num3,cons_1 n) {
	super();
	this.num1=num1;
	this.num2=num2;
	this.num3=num3;
	cons_1.n=n;
}

public cons_1(String num1,String num2) {
	super();
	this.num1=num1;
	this.num2=num2;

}
public cons_1(String num1) {
	super();
	this.num1=num1;

}

public String getNum1() {
	return num1;
}

public void setNum1(String num1) {
	this.num1 = num1;
}

public String getNum2() {
	return num2;
}

public void setNum2(String num2) {
	this.num2 = num2;
}

public int getNum3() {
	return num3;
}

public void setNum3(int num3) {
	this.num3 = num3;
}

}
class cons_2 extends cons_1{
	
	String num4;
	String num5;
	int num6;
	
	
	public String getNum4() {
		return num4;
	}
	public void setNum4(String num4) {
		this.num4 = num4;
	}
	public String getNum5() {
		return num5;
	}
	public void setNum5(String num5) {
		this.num5 = num5;
	}
	public int getNum6() {
		return num6;
	}
	public void setNum6(int num6) {
		this.num6 = num6;
	}
	
	
	public cons_2(String num4, String num5, int num6,String num1) {
		super(num1);
		this.num4 = num4;
		this.num5 = num5;
		this.num6 = num6;
	}
	public cons_2(String num4, String num5, int num6,String num1,String num2) {
		super(num1,num2);
		this.num4 = num4;
		this.num5 = num5;
		this.num6 = num6;
	
		
	}
	public cons_2(String num4, String num5, int num6,String num1,String num2,int num3) {
		super(num1,num2,num3,n);
		this.num4 = num4;
		this.num5 = num5;
		this.num6 = num6;
	}
	
	
	public cons_2(String num4, String num5, int num6) {
		this(num4,num5);
		this.num6 = num6;
	}
	
	public cons_2(String num4, String num5) {
		this(num4);
	    this.num5=num5;
	}
	
	
	public cons_2(String num4) {
		super();
		this.num4 = num4;
	}
	
	
	public cons_2() {
		super();
	}
	
	void display() {
		System.out.println(this.num1+this.num2+this.num3+this.num4+this.num5+this.num6);
	}
			
}

public class constractors {

	public static void main(String[] args) {
		
		cons_2 n1=new cons_2("prem","premrj",2,"prem","prem",2);
		String a=n1.getNum5();
		n1.display();
		System.out.println(a);

		cons_1 o=new cons_1("prem");
		o.num1=o.num1+"num";
		
		System.out.print(o.num1);
	}

}
