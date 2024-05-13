package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegEx_Basic {

	public static void main(String[] args) {
          
		//wayOfRegDeclaration();
		//basicTest1();
		//test();
		//quantifiers_1();
		//quantifiers();
		
		//omitDigit();	
		//validPassword();
		
		//test1();
		
	}

	
private static void quantifiers_1() {

	//https://www.rexegg.com/regex-quantifiers.html#cheat_sheet
	
	
	System.out.println("? quantifier ....");  
	//true (a or j or n comes one time) 
	System.out.println(Pattern.matches("[ajn]?", "a")); 
	
	//false (a comes more than one time) 
	System.out.println(Pattern.matches("[ajn]?", "aaa")); 
	
	//false (a j and n comes more than one time)
	System.out.println(Pattern.matches("[ajn]?", "aammmnn"));  
	
	//false (a comes more than one time)
	System.out.println(Pattern.matches("[ajn]?", "aazzta"));  
	
	//false (a or j or n must come one time) 
	System.out.println(Pattern.matches("[ajn]?", "aj")); 

	System.out.println("+ quantifier ....");  
	
	//true (a or j or n once or more times)  
	System.out.println(Pattern.matches("[ajn]+", "ajjnna"));
	
	//true (a comes more than one time) 
	System.out.println(Pattern.matches("[ajn]+", "aaa")); 
	
	//false (a or j or n comes more than once)  
	System.out.println(Pattern.matches("[ajn]+", "aammnn"));
	
	//false (z and t are not matching pattern)
	System.out.println(Pattern.matches("[ajn]+", "aazzta"));  

	System.out.println("* quantifier !!!....");  
	
	//true (a or j or n may come zero or more times) 
	System.out.println(Pattern.matches("[ajn]*", "ajjjna")); 
	System.out.println(Pattern.matches("[ajn]*", "ajnnn")); 
	
	System.out.println(Pattern.matches("a{2}", "aabc")); //Exactly two
	System.out.println(Pattern.matches("a{2,}+", "aabc")); 
	
}

private static void test1() {

	//Pattern pattern = Pattern.compile("w3schools", Pattern.CASE_INSENSITIVE);
	//Pattern pattern = Pattern.compile("w3schools");
	// Matcher matcher = pattern.matcher("Visit W3Schools! ewrw wr werwe sdsdfrwe fddsfwer wewfds");
	// boolean matchFound  = matcher.find();
	 
//	boolean matchFound=Pattern.compile("w3schools").matcher("ytyy w3schools").find();  
//	 
//	 if(matchFound) {
//	      System.out.println("Match found");
//	    } else {
//	      System.out.println("Match not found");
//	    }
	 
    boolean b3 = Pattern.matches(".s", "aS");  
	  
	System.out.println(b3);
	 
	}


private static void quantifiers() {

	//System.out.println("? * +  quantifier  x{a,n} x{a,}x{n}..."); 
	
	//System.out.println(Pattern.matches("[amn]?", "m"));//true (a or m or n comes one time)  
	//System.out.println(Pattern.matches("[a?]", "aa"));//false (a comes more than one time)  
	//System.out.println(Pattern.matches("[amn]?", "aammmnn"));//false (a m and n comes more than one time)  
	
	
	//System.out.println(Pattern.matches("[amn]+", "aaa"));//true (a comes more than one time)  
	
	
	//System.out.println(Pattern.matches("[amn]*", "ammmna"));//true (a or m or n may come zero or more times)  
	//System.out.println(Pattern.matches("[amn]*", "amn"));//true (a or m or n may come zero or more times)  
		
	
	
	
	
	//Pattern p = Pattern.compile("g+");
	//Pattern p = Pattern.compile("g+?");
	Pattern p = Pattern.compile("g++");
	 
     // Making an instance of Matcher class
     Matcher m = p.matcher("gggA1g");

     while (m.find())
         System.out.println("Pattern found from " + m.start() +
                            " to " + (m.end()-1));
     
     
}


private static void wayOfRegDeclaration() {

	
	
//	
//	//1st way  
	Pattern p = Pattern.compile(".s");//. represents single character  
	Matcher m = p.matcher("s");  
	boolean b = m.matches();  
//	
//	  
//	//2nd way  
//	//boolean b2=Pattern.compile(".s").matcher("as").matches();  
//	  
//	//3rd way  
//	//boolean b3 = Pattern.matches(".s", "as");  
//	  
//	System.out.println(b);  
//	
//
//	System.out.println(Pattern.matches(
//            "geeksforge*ks", "geeksforgeeks"));
	
	
	// Pattern pattern = Pattern.compile("w3schools", Pattern.CASE_INSENSITIVE);
	//Pattern pattern = Pattern.compile("[abc]", Pattern.CASE_INSENSITIVE);//check a or b or c in string ok
	//Pattern pattern = Pattern.compile("[^abc][0-9]", Pattern.CASE_INSENSITIVE);//check other then a,b,c - ok 
	//Pattern pattern = Pattern.compile("[ools$]", Pattern.CASE_INSENSITIVE);//check other then a,b,c - ok 
	//Pattern pattern = Pattern.compile("[^a-z0-9A-Z]");//w
	
	
	Matcher matcher = p.matcher("Visit W3Schools!");
	    boolean matchFound = matcher.find();
	    if(matchFound) {
	      System.out.println("Match found");
	    } else {
	      System.out.println("Match not found");
	    }
	
	
	
	
	
	
	
	}


	private static void test() {

//		System.out.println(Pattern.matches(
//	            "geeksforge*ks", "geeksforgeeks"));
		
		
		
		//Pattern pattern = Pattern.compile("geeks");
		//Pattern pattern = Pattern.compile("ge*");
		//Pattern pattern = Pattern.compile("3G*");
		//Pattern pattern = Pattern.compile("ge*", Pattern.CASE_INSENSITIVE);
		//Pattern pattern = Pattern.compile(".org", Pattern.CASE_INSENSITIVE);
		Pattern pattern = Pattern.compile("\\d", Pattern.CASE_INSENSITIVE);
		
		
        // Search above pattern in "geeksforgeeks.org"
        Matcher m = pattern.matcher("geeks1fGor2Geeks.orgeeks3GG");
        
        while (m.find())
        	 
            // Print starting and ending indexes
            // of the pattern in the text
            // using this functionality of this class
            System.out.println("Pattern found from "
                               + m.start() + " to "
                               + (m.end() - 1));
    }
        
		
	


	private static void basicTest1() {
		
		//System.out.println(Pattern.matches("\\d\\d", "11"));//true (digit and comes once)  

		//reg 1.pattern (compile methods )    2.matcher
				//java.util.regex API 
				
				//Meta char -searching 
				
				//character -[abc],[abc]pple,
				      // not  -[^] 
				      //range -[A-Z][a-z][0-9]   [1-6]   3[0-5]
				
				//pre-defined characters  \\d,\\D,\\s,\\S,\\w,\\W
				    
				
				
				//Pattern pattern = Pattern.compile("[a-z0-9A-Z]");//w
				//Pattern pattern = Pattern.compile("\\w"); //only alph,numbers [except special chars]
				
				 //Pattern pattern = Pattern.compile("[^a-z0-9A-Z]");//W
				//Pattern pattern = Pattern.compile("^[a-z0-9A-Z]");//starting char of string
				//Pattern pattern = Pattern.compile("3[0-9]");  //31,32..35 ok, 36-fail 
				//Pattern pattern = Pattern.compile("91[0-9]");  //911,912..
			//	Pattern pattern = Pattern.compile("[1-4[7-9]]"); 
				//Pattern pattern = Pattern.compile("[1-4[7-8]]");//union //5655699-fail  ,1st 4 dig(1-4) aftermath(7-8)
				//Pattern pattern = Pattern.compile("[0-9&&[^2468]]"); //13579
				
				
				//predefined
				Pattern pattern = Pattern.compile("\\d");  //number only [except char,sp.ch,alpherts]
				//Pattern pattern = Pattern.compile("\\D"); //non-digit  [except numbers ]
				//Pattern pattern = Pattern.compile("\\s"); //whitespace -> must \t\b\n blankspace
				//Pattern pattern = Pattern.compile("\\w"); //only alph,numbers [except special chars]
				//Pattern pattern = Pattern.compile("\\W"); //only special chars...
				
				
				//Quantifiers->number of occurrences to match against
		              // ? 
				      //{}
				      //*
				/*
				 
				X*        Zero or more occurrences of X
				X?        Zero or One occurrences of X  g+? >> egg   1 to 1,2to2
				X+        One or More occurrences of X  g+ >>  egg   from 1 to 2 
				X{n}      Exactly n occurrences of X 
				X{n, }    At-least n occurrences of X
				X{n, m}   Count of occurrences of X is from n to m
				
				*/
			
		

		//Pattern pattern = Pattern.compile("g+?");
		 Matcher m = pattern.matcher("#abc 123 ");
		 
		 while (m.find())
	            System.out.println("Pattern found from " + m.start() +
	                               " to " + (m.end()-1));
		
		
		
	}

	private static void omitDigit() {

		
		String text = "geeks1for2geeks3";
	    String delimiter = "\\d";
	  
	    Pattern pattern = Pattern.compile(delimiter, Pattern.CASE_INSENSITIVE);
	
	    String[] result = pattern.split(text);
	    // Matcher m = pattern.matcher("egg");

	    for (String temp : result)
	            System.out.println(temp);
	
	}
	
	
private static void validPassword() {

	  String password="Geeks@portal2345";
	  
	  
	/*	It contains at least 8 characters and at most 20 characters.
	  	It contains at least one digit.
		It contains at least one upper case alphabet.
		It contains at least one lower case alphabet.
		It contains at least one special character which includes !@#$%&*()-+=^.
		It doesn’t contain any white space.
	 * 
	 */
	
	// Regex to check valid password.
    String regex = "^(?=.*[0-9])"   //^ starting character of the string and digit must occur at least once
                   + "+=])"   // special character that must occur at least once
                   + "(?=\\S+$).{8,20}$"; //white spaces don’t allowed in the entire string
                                          //at least 8 characters and at most 20 characters.
                                          //$ represents the end of the string
    
          Pattern p = Pattern.compile(regex);
          
          
          Matcher m = p.matcher(password);
          boolean r=m.matches();
          System.out.println("result <<"+r);
		
	}




}
