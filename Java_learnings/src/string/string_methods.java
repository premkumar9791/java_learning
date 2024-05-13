package string;

public class string_methods {
	
	public static void main (String[] agrs) {
		
		
	   //  Strings();
	   //  String1();
	   //  String2();
	   //  String3();
	   //  String4();
	   //  String5();
	   //  String6();
	   //  String7();
	   //  String8();
	   //  String9();
	   //  String10();
	   //  String11();
	       String12();
	
	
	}
    private static void String12() {
		// java land string method
    	
    	String a="prem";
    	String b="kumar";
    	String c="prem";
    	String d="PREM";
    	String e="";
    	char[] f= {'a','s','d','f','g'};
    	String h="    what is the fundamental of process   ";
    	
    	System.out.println("given String = "+a);
    	System.out.println("a.charAt(0)= "+a.charAt(0));
    	System.out.println("--------------------------------------");
    	
     	System.out.println("given String = "+a);
    	System.out.println("given String = "+b);
    	System.out.println("a.concat(b)= "+a.concat(b));
    	System.out.println("--------------------------------------");
		
    	System.out.println("given String = "+a);
    	System.out.println("given String = "+b);
    	System.out.println("given String = "+d);
    	System.out.println("a.compareTo(a)= "+a.compareTo(a));
    	System.out.println("a.compareTo(b)= "+a.compareTo(b));
    	System.out.println("a.compareTo(d)= "+a.compareTo(d));
    	System.out.println("--------------------------------------");
    	
      	System.out.println("given String = "+a);
    	System.out.println("given String = "+b);
    	System.out.println("given String = "+c);
    	System.out.println("a.endsWith(b)= "+a.endsWith(b));
    	System.out.println("a.endsWith(c)= "+a.endsWith(c));
    	System.out.println("--------------------------------------");
    	
      	System.out.println("given String = "+a);
    	System.out.println("given String = "+b);
    	System.out.println("a.startsWith(b)= "+a.startsWith(b));
    	System.out.println("--------------------------------------");
    	
    	System.out.println("given String = "+a);
    	System.out.println("given String = "+b);
    	System.out.println("given String = "+c);
    	System.out.println("a.contains(c)= "+a.contains(c));
    	System.out.println("a.contains(b)= "+a.contains(b));
    	System.out.println("--------------------------------------");
    	
    	System.out.println("given String = "+a);
    	System.out.println("given String = "+b);
    	System.out.println("given String = "+c);
    	System.out.println("a.contentEquals(c)= "+a.contentEquals(c));
    	System.out.println("a.contentEquals(b)= "+a.contentEquals(b));
    	System.out.println("--------------------------------------");
    	
     	System.out.println("given char array f = "+"'a','s','d','f','g'");
    	System.out.println("given String = "+e);
    	System.out.println("String.copyValueOf(f,0,2)= "+String.copyValueOf(f,0,2));
    	System.out.println("--------------------------------------");
    	
    	System.out.println("given String = "+a);
    	System.out.println("given String = "+b);
    	System.out.println("given String = "+c);
    	System.out.println("a.equals(c)= "+a.equals(c));
    	System.out.println("a.equals(b)= "+a.equals(b));
    	System.out.println("--------------------------------------");
    	
    	System.out.println("given String = "+a);
    	System.out.println("given String = "+b);
    	System.out.println("given String = "+c);
    	System.out.println("a.equalsIgnoreCase(c)= "+a.equalsIgnoreCase(c));
    	System.out.println("a.equalsIgnoreCase(b)= "+a.equalsIgnoreCase(b));
    	System.out.println("--------------------------------------");
    	
    	System.out.println("String.format(\"%6.5f\",36.2)= "+String.format("%6.5f",36.2));
    	System.out.println("--------------------------------------");
    	
    	System.out.println("given String = "+a);
    	System.out.println("a.indexof(p)= "+a.indexOf("p"));
    	System.out.println("--------------------------------------");
    	
    	System.out.println("given String = "+a);
    	System.out.println("a.lastindexof(e)= "+a.lastIndexOf("m"));
    	System.out.println("--------------------------------------");
    	
    	System.out.println("given String = "+a);
    	System.out.println("a.intern()= "+a.intern());
    	System.out.println("--------------------------------------");
    	
    	System.out.println("given String = "+a);
    	System.out.println("a.isEmpty()= "+a.isEmpty());
    	System.out.println("--------------------------------------");
    	
    	System.out.println("given String = "+a);
    	System.out.println("a.length()= "+a.length());
    	System.out.println("--------------------------------------");
    	
    	System.out.println("given String = "+a);
    	System.out.println("a.matches(c)= "+a.matches(c));
    	System.out.println("--------------------------------------");
    	
    	System.out.println("given String = "+a);
    	System.out.println("a.replace(\"p\",\"k\")= "+a.replace("p","k"));
    	System.out.println("--------------------------------------");
    	
    	System.out.println("given String = "+a);
    	System.out.println("a.replaceAll(\"p\",\"k\")= "+a.replaceAll("p","k"));
    	System.out.println("--------------------------------------");
    	
    	System.out.println("given String = "+a);
    	System.out.println("a.replacefirst(\"p\",\"k\")= "+a.replaceFirst("p","k"));
    	System.out.println("--------------------------------------");
    	
       	System.out.println("given String = "+h);
       	String n[]=h.split(" ");
       for(int i=0;i<n.length;i++) {
       		System.out.println("a.split( )= "+n[i]);
       }
    	System.out.println("--------------------------------------");
    	
    	System.out.println("given String = "+a);
    	System.out.println("a.substring(0)= "+a.substring(2));
    	System.out.println("--------------------------------------");
    	
    	System.out.println("given String = "+a);
    	char[] o=a.toCharArray();
    	 for(int i=0;i<o.length;i++) {
    	    	System.out.println("a.substring(i)= "+o[i]);
        }

    	System.out.println("--------------------------------------");
    	
    	System.out.println("given String = "+a);
    	System.out.println("a.toLowerCase(0)= "+a.toLowerCase());
    	System.out.println("--------------------------------------");
    	
     	System.out.println("given String = "+a);
    	System.out.println("a.toUpperCase(0)= "+a.toUpperCase());
    	System.out.println("--------------------------------------");
    	
     	System.out.println("given String = "+h);
    	System.out.println("a.trim()= "+h.trim());
    	System.out.println("--------------------------------------");
    	
     	System.out.println("given String = "+o);
    	System.out.println("a.valueof()= "+String.valueOf(o));
    	System.out.println("--------------------------------------");
    	
    	
       	System.out.println("given String = "+h);
    	System.out.println("join()= "+String.join("//s", a));
    	System.out.println("--------------------------------------");
	}
	
	private static void String11() {
		// 5.Write a Java program that removes a specified word from given text
    	
    	String a="Java is the is foundation for virtually every type of "+
 	           "networked application and is the global standard for developing and "+
 	           " delivering embedded and mobile applications,millions games, Web-based content, "+
 	           " and enterprise software. With more than 9 million developers worldwide,"+
 	           " Java enables you to efficiently develop, deploy and use exciting applications and services.";
    	
    	String b="is";
    	
    	String result=a.replace(b,"");
    	result = result.replaceAll("\\s+", " ");
    	System.out.print(result);
		
	}
	private static void String10() {
//    	Write a Java program to count how many times the substring 'life' appears anywhere in a given string. Counting can also happen with the substring 'li?e', any character instead of 'f'.
//
//    	he given string is: liveonwildlife
//    	The substring life or li?e appear number of times: 2
		
    	String a="liveonwildlife";
    	String first="li";
    	String last="e";
    	int count=0;
    	
    	for(int i=0;i<a.length()-3;i++) {
    		if(first.compareTo(a.substring(i,i+2))==0&&last.compareTo(a.substring(i+3,i+4))==0) 
    			count=count+1;
    		
    	}
    	System.out.println(count);
    	
	}
	private static void String9() {
//    	Write a Java program to return the sum of the digits present in the given string. In the absence of digits, the sum is 0.
//
//    			Sample Output:
//
//    			The given string is: ab5c2d4ef12s
//    			The sum of the digits in the string is: 14
    	
    	String a="ab5c2d4ef12s";
    	int c=0;
    	
    	for(int i=0;i<a.length();i++) {
    		if(Character.isDigit(a.charAt(i))) {
    			String n=String.valueOf(a.charAt(i));
    			 c+=Integer.parseInt(n);
    		}
    	}
    	System.out.println(c);
		
	}
	private static void String8() {
		// Write a Java program to check whether the first instance of a given character is immediately followed by the same character in a given string.
//		
//    	Sample Output:
//
//    		The given string is: fizzez
//    		Is 'z' appear twice respectively? true
    	
    	String a="fizzez";
    	boolean n=appearTwice(a); 
    	System.out.println(n);
	}
    static boolean appearTwice(String stng) 
    {
      int i = stng.indexOf("z");
      if (i == -1) return false; 
      if (i+1 >= stng.length()) return false; 
      return stng.substring(i+1, i+2).equals("z");
    }
	private static void String7() {
		// Write a Java program to check if a given string contains another string. Returns true or false.
		
    	 String  a= "Java is the foundation for virtually every type of "+
    	           "networked application and is the global standard for developing and "+
    	           " delivering embedded and mobile applications,millions games, Web-based content, "+
    	           " and enterprise software. With more than 9 million developers worldwide,"+
    	           " Java enables you to efficiently develop, deploy and use exciting applications and services.";
    	           

    	           String b= "million";
    	            String c= "millions";

    	           boolean result1 = is_present(a, c);
    	            System.out.println(result1);
	}
    
    public static boolean is_present(String main_string, String sub_string) {
        if (main_string == null || sub_string == null || main_string.isEmpty() || sub_string.isEmpty()) {
              return false;
         }
         return main_string.indexOf(sub_string) != -1;
     }
	private static void String6() {
		//  Write a Java program to test if a string contains only digits. Returns true or false.
    	
    	String a="8989285929925196";
    	String b="4888285826hyr9r86127";
    	
    	boolean n=check_String(a);
    	System.out.print(n);
		
	}
	private static boolean check_String(String a) {
		
		for(int i=0;i<a.length();i++) {
			if(!Character.isDigit(a.charAt(i))) {
				return false;
			}
		}
		return true;
	}
	//  way2:

		public static boolean check_String2(String str) {

		        if (str == null || str.isEmpty()) {
		            // or throw IllegalArgumentException
		            return false;
		        }

		        return str.matches("[0-9]+");
		    }

	//	way3:

		public static boolean check_String3(String str) {

		        if (str == null || str.isEmpty()) {
		            // or throw IllegalArgumentException
		            return false;
		        }

		        return !str.chars()
		                .anyMatch(n -> !Character.isDigit(n));
		    }
	private static void String5() {
		//Write a Java program to convert a given string to int, long, floating and double.

    	        String int1 = "1323";
    	        String  long1= "13625478965325";
    	        String float1 = "25.135F";
    	        String double1 = "21.25478254D";
    	        
    	        
    	        //String to int
    	        Integer num1=Integer.valueOf(int1);
    	        int num2=Integer.parseInt(int1);
    	        System.out.println("String to integer="+num1+num2);
    	        
    	        //string to long
    	        Long num3=Long.valueOf(long1);
    	        long num4=Long.parseLong(long1);
    	        System.out.println("String to Long="+num3+num4);
    	     
    	        //string to float
    	        Float num5=Float.valueOf(float1);
    	        float num6=Float.parseFloat(float1);
    	        System.out.println("String to float="+num5+num6);
    	        
    	        //string to double
    	        Double num7=Double.valueOf(double1);
    	        double num8=Double.parseDouble(double1);
    	        System.out.println("String to double="+num7+num8);

		
	}
	private static void String4() {
		// Find the mobile number in paragraph
    	
    	String a="This is your README. READMEs are where 9841158238 you can communicate what your project is and how to use it."
    			+ "Write your name on line 9940101066 save it, and then 9791090240 head back to GitHub Desktop.";
    	String[] c=a.split(" ");
    	
    	for(int i=0;i<c.length;i++){
    		String p ="";
    		String b=c[i];	
    		if(b.length()==10) {
    			for(int k=0;k<10;k++) {
    				char n=b.charAt(k);
    				if(n<='9') {
    				    p=p+String.valueOf(n);
    				}
    				else {
    					break;
    				}
    			}
    			if(p.length()==10) {
    				System.out.println(p);	
    			}
    			
    		}
    	}	
    	
    
	}
	private static void String3() {
		// count the number of vowels
    	char a[]= {'a','e','i','o','u'};
    	String b="vowoles";
    	
    	
    	for(int i=0;i<a.length;i++) {
    		int c=0;
    		for(int j=0;j<b.length();j++) {
    			if(a[i]==b.charAt(j)) {
    				
    				c++;
    			}
    		}
    		if(c>=1) {
    			System.out.println(a[i]+"-"+c);
    		}
    	}
    	
	}
	private static void String2() {
		// palindrom or not
    	
    	boolean n=palindrom("moma");
    	if(n)System.out.println("palindrom");
    	else System.out.println("not a palindrom");
		
	}
    public static boolean palindrom(String a) {
    	boolean n=true;
    	int j=a.length()-1;
    	for(int i=0;i<a.length();i++) {
    		
    			if(a.charAt(i)==a.charAt(j)) {
    				n=true;
    				j--;
    			}
    			else {
    				n=false;
    				break;
    			}
    		
    	}
		return n;
    	
    }
	private static void String1() {
	String a="java.com";
	int k=a.length()-1;
	for(int i=k;i>=0;i--){
	    System.out.print(a.charAt(i));	
	}
		
	
		
	}
	private static void Strings() {
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
    
    
    
}