package encapsulation;

interface bank4{
	void a();
	void b();
	void c();
}
interface bank2 extends bank4{
	void d();
	void e();
	void f();
}

class bank3 implements bank2  {

	@Override
	public void a() {
		System.out.println("a");
		
	}

	@Override
	public void b() {
		System.out.println("b");
		
	}

	@Override
	public void c() {
		System.out.println("c");
		
	}

	@Override
	public void d() {
		System.out.println("d");
		
	}

	@Override
	public void e() {
		System.out.println("e");
		
	}

	@Override
	public void f() {
		System.out.println("f");
		
	}
	
}


public class interface_ {

	public static void main(String[] args) {
		
		bank4 a=new bank3();
		a.a();

	}

}
