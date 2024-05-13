package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class regex {

	public static final String EXAMPLE_TEST = "This is my small example "
            + "string which I'm going to " + "use  for pattern matching.";
	
	
	public static void main(String[] args) {
       // first_demo();
		//split();
	}

	private static void first_demo() 
	{

		 	//Pattern pattern = Pattern.compile("W3Schools", Pattern.CASE_INSENSITIVE);
			//Pattern pattern = Pattern.compile("W3Schools");
		 	//Pattern pattern = Pattern.compile("[zw]", Pattern.CASE_INSENSITIVE);
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
		 
		    
		    Matcher matcher = pattern.matcher("visited abc	w3schools!cat");
		  
		    boolean matchFound = matcher.find();
		   
		    
		    if(matchFound) {
		      System.out.println("Match found");
		    } else {
		      System.out.println("Match not found");
		    }
		
		
		
	}

	private static void split() {

		
		
		String str = "word1, word2 word3@word4?word5.word6";
        String[] arrOfStr = str.split("[, ?.@]+");
  
        for (String a : arrOfStr)
            System.out.println(a);
        
       
	}

}
