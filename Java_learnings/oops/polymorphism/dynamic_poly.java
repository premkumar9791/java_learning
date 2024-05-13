package polymorphism;

class parent{
	
	public void overriding() {
		System.out.println("parent");
	}
}
class child extends parent{
	
	public void overriding() {
		System.out.println("child");
	}
}


public class dynamic_poly {

	public static void main(String[] args) {
		
		
		parent n=new child();
		n.overriding();
		
		
		account a=new SavingAccount();
		a.generalTest();
		a.withdrawal();
		
	    account b=new CurrentAccount();
        b.generalTest();
        b.withdrawal();
  
        Decide c=new Decide();
        c.invokeMyAccount(new CurrentAccount());
        c.invokeMyAccount(new SavingAccount());
       // c.invokeMyAccount(new S());
	}

}
