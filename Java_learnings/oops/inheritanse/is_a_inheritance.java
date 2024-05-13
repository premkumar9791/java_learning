package inheritanse;

class bank1{
	int a=10;
}
class bank2 extends bank1{
	int b=20;
}

public class is_a_inheritance {

	public static void main(String[] args) {
	
    bank2 n=new bank2();
    int a=n.a;
    int b=n.b;
    
    System.out.println(a);
    System.out.println(b);
	}

}
