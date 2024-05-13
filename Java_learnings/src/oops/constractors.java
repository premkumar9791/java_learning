package oops;

class bank{
	
	String name;
	int amount;
	static bank instance=null;
	
	//no-args constructors
	private bank() {
		System.out.print("no-args constructors");
	}
	
	//argument cons..
	public bank(String name ,int amt) {
		this.name=name;
		this.amount=amt;
	}
	
	static public bank getInstance() {
		if(instance ==null) {
			instance=new bank();
			return instance;
		}
		return instance;
		
	}
	
	//cons overloding...
	public bank(int amt) {
		this.amount=amt;
	}
	
	public int debit(int amt) {
		
		 int k=this.amount-amt;
		
		return k;
		
	}
	
	public int credit(int amt) {
		
		 int k=this.amount+amt;
		
		return k;
		
	}
	
}


//super calss constractors
class child_bank extends bank{
	
	String add;
	int a;
	int b;

	
	public child_bank(String n,int amt,String add,int a) {
		super(n,amt);
		this.add=add;
		this.a=a;
		
	}
	
	//conStractor chineing
	public child_bank(String n,int amt,String add,int a,int b) {
		this(add,a,n,amt);
		this.b=b;
	}
	
     void dispChildIns() {
		
	//	System.out.println("child name"+this.name);
	//	System.out.println("c amt"+this.amount);
	//	System.out.println("c addr "+this.add);
		
	}
} 

public class constractors {

	public static void main(String[] args) {
	  // Constractor
      
		bank h1=new bank(5000);
		int n1=h1.credit(200);
		//System.out.println("add="+n1);
		int n2=h1.debit(300);
		//System.out.println("sub="+n2);
		
		
		child_bank r1=new child_bank("prem",5000,"chennai",1);
		r1.dispChildIns();
		
		emp d=new emp("prem","num");
		d.printEmp();
		
		
		
	//	singleton
		
		bank o=bank.getInstance();
		o.amount=o.amount+6000;
		
		System.out.println(o.amount);
	}

}

class emp{
	String name;
	String id;
	
	emp(String name,String id){
		this.name=name;
		this.id=id;
	}
	 public void printEmp() {
		// System.out.println("name"+name);
		 //System.out.println("id"+id);
	 }
		

}


