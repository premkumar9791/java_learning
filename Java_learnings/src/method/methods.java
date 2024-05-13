package method;

import project1.project;
import project1.project2;

public class methods {

	public static void main(String[] args) {
		project n=new project();
		int a=n.name(20);
		System.out.println(a);
		
		project2 k=new project2();
		k.Setname("prem rj");
		
		//k.getname();
		System.out.println(k.getname());
		
		String();
	}
	
	private static void String() {
		String s="prem";
		String s2="Prem";
		String s3=new String("prem");
		
		System.out.println(s.equals(s2));//false
		System.out.println(s.equals(s3));//true
		System.out.println(s.equalsIgnoreCase(s2));//true
		
		s.concat("kumar"); //immutable
		String s4=s.concat("kumar");
		System.out.println(s);
		System.out.println(s4);
		
		
		StringBuffer k=new StringBuffer("prem");//mutable
		k.append("kumar");
		System.out.println(k);
		
		//compare to
	    String a="A";
	    String b="a";
	    String c="A";
	    
	    System.out.println(a.compareTo(b));//negative
	    System.out.println(b.compareTo(a));//positiver
	    System.out.println(a.compareTo(c));//0
	    
	}

	public int rollnumber() {
		return 30;
	}
	
}
