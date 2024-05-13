package encapsulation;

abstract  class bank{

	abstract void m1();
	
}

class person extends bank{
	int a;
	void m1() {
		System.out.println("abstract person");
	}
}


public class Abstraction {

	public static void main(String[] args) {
		
		bank a=new person();
		a.m1();

	}

}
