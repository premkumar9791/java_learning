package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class regex2 {

	public static void main(String[] args) {
		
		//regex1();
		//regex2();
		//regex3();
		//regex4();
		//regex5();
		  regex6();

	}

	private static void regex6() {
		//  (?i)  = Pattern.CASE_INSENSITIVE
		
		boolean d=Pattern.matches("[A-Z]{2}" ,"AZ");
		System.out.println(d);
	}

	private static void regex5() {
		
		//way 1
		Pattern n=Pattern.compile(".s");
		Matcher k=n.matcher("as");
		boolean m=k.matches();
		System.out.println(m);
		
		//way 2
        boolean o=Pattern.compile(".s").matcher("as").matches();
        System.out.println(o);
        
        //way 3
        boolean d=Pattern.matches(".s","as");
		System.out.println(d);
	}

	
	
	private static void regex4() {
		
		String p = null;
		boolean b3 = Pattern.matches(".s",reg(p));
		System.out.println(b3);
		
	}

	private static CharSequence reg(String p) {
		String k="as";
		return k;
	}

	private static void regex3() {
		
		
		boolean b2=Pattern.compile(".s").matcher("as").matches(); 
		bn(b2);
		
	}

	private static void regex2() {
		
		Pattern p = Pattern.compile(".s");//. represents single character  
		Matcher m = p.matcher("s");  
		boolean b = m.matches();  
		bn(b);
		
	}

	private static void regex1() {
		
		//Pattern pattern =Pattern.compile("a");
		//Pattern pattern = Pattern.compile("W3Schools");
		//Pattern pattern = Pattern.compile("[abc]", Pattern.CASE_INSENSITIVE);
	 	//Pattern pattern = Pattern.compile("[0-9]", Pattern.CASE_INSENSITIVE);
	                               //or
		 // Pattern pattern = Pattern.compile("[\\d]");
		  
		 Pattern pattern = Pattern.compile("[\\s]");//Find a whitespace characte  \n \t\ ... etc 
		
	 // Pattern pattern = Pattern.compile("cat|dog|fish", Pattern.CASE_INSENSITIVE);
	 	//Pattern pattern = Pattern.compile("^visi");//Find one character  between the brackets begining
	 	//Pattern pattern = Pattern.compile("[^visi]");//Find one character NOT between the brackets
	 	//Pattern pattern = Pattern.compile("cat$");//Finds a match at the end of the string
	 	     // or
	  //  Pattern pattern = Pattern.compile("cat\\b");//Finds a match at the end of the string
		//Pattern pattern = Pattern.compile("[zw]", Pattern.CASE_INSENSITIVE);
		
		Matcher matcher=pattern.matcher("W3Schools");
		
		boolean regex=matcher.find();
		
		bn(regex);
		
	}

	private static void bn(boolean regex) {
		if(regex) {
			System.out.println("fount");
		}
		else {
			System.out.println(" not fount");
		}
		
	}

}
