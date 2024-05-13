package polymorphism;

public class CurrentAccount extends account {

	public void withdrawal(){
		System.out.println("welcome Current Account...");
	}
	
	public void overDraft(){
		System.out.println("over draft section @CA..");
	}
	
}
