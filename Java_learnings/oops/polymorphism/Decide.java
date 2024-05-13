package polymorphism;

public class Decide {

	
	 public void invokeMyAccount(account acc) {
		
		 if(acc instanceof CurrentAccount) {
			 CurrentAccount c=(CurrentAccount) acc; 
			 c.withdrawal();
			 c.overDraft();
			 c.generalTest();
		 }
		 
		 else if( acc instanceof SavingAccount) {
			 SavingAccount s=(SavingAccount) acc ;
			 s.generalTest();
			 s.withdrawal();
		 }
		 else {
			  System.out.println("sorry !!!!,Invalid account ....");
		 }
	 }
}
