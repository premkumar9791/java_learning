package core.basic;

import java.util.Arrays;
import java.util.Scanner;

public class Test 
{

	public static void main(String[] args)
	
	{

		//Test t1=new Test();
		
//		t1.sampleMethod();
	
		//t1.samplemethor2();
//		t1.sampleMethod();
		//t1.sampleTest2();
		
		lengthOfLongestSubstring("abcabcbb");
	}
	
	  public static int lengthOfLongestSubstring(String s) {
	        
	       String a[]=new String[s.length()];
	       int b[]=new int[s.length()]; 
	     int n=0;
	     for(int i=0;i<s.length();i++){
	         a[i]="m";
	         b[i]=0;
	         for(int j=n;j<s.length();j++){
	             if(s.charAt(j)!=s.charAt(j+1) && num(a[i],s.charAt(j)) ){
	                 a[i]+=s.charAt(j);
	                     b[i]++;
	             }
	             else{
	                 n=j;
	                 break;
	             }
	             
	         }
	         
	     }
	      
	     Arrays.sort(b);
	     
	        if(a[0].isEmpty()){
	            return 1;
	        }
	        
	        return b[b.length-1];
	    }
	    
	   public static  boolean num(String a,char b){
	            for(int k=0;k<a.length();k++){
	                 if(b==a.charAt(k)){
	                     return false;
	                 }  
	               }
	            return true;
	        }

	
	private void samplemethor2() {
		// TODO Auto-generated method stub
		int a,b,c;
		Scanner n=new Scanner(System.in);
		
		a=n.nextInt();
		b=n.nextInt();
	    c=a+b;
		
		System.out.println(c);
	}


	void sampleMethod() 
	
	{
		
		//System.out.println("welcome to all ");
		
		
		int a,b,c;
		
		Scanner s=new Scanner(System.in);
		
		
		a=s.nextInt();
		b= s.nextInt();
		
		c=a+b;
		
		System.out.println(c);
		
		
		
		
		
	}
	
	void sampleTest2() {
		int a = 10;
		 int b = 20;
	        System.out.println (a == b); // returns false because 10 is not equal to 20
	        System.out.println (a != b); // returns true because 10 is not equal to 20
	        System.out.println (a > b); // returns false 
	        System.out.println (a < b); // returns true 
	        System.out.println (a >= b); // returns false
	        System.out.println (a <= b); // returns true  
		
	}
	
	
}
