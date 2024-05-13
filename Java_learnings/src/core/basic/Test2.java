package core.basic;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {

		
		
		
	//	m1();
	//	m2();
		m3();
	}

	private static void m3() {
		LinkedList<String> ll = new LinkedList<String>(); 

		ArrayList<String> removedList=new ArrayList<>();
        // Adding elements to the linked list 
        ll.add("A"); 
        ll.add("B"); 
        ll.addLast("C"); 
        ll.addFirst("D"); 
        ll.add(2, "E"); 
  
         System.out.println(ll); 
      
        
        Scanner scr=new Scanner(System.in);
        String item,opt;
        for (int i = 0; i < ll.size(); i++) 
        {  
           if(!ll.isEmpty()) {
        	
        	System.out.println("which item u want delete? if yes-> delete else loop contine[y/n]");
            opt=scr.next();
            
        	if (opt.equalsIgnoreCase("Y"))
        	{
        		System.out.println("which item u want delete?");
        	    item=scr.next();
        	    
        	    
        	    
        	    if(ll.contains(item)) {
        	    	for(int j=0;j<ll.size();j++) {
        	    		if(item.equalsIgnoreCase(ll.get(j))) {
        	    	removedList.add(ll.get(j));
        	    	ll.remove(j);
        	    		}
        	    	}
        	    }
        	    else {
        	    	System.out.println("item not found");
        	    }
        	    
        		
        	}
        
           }
           
           else {
        	   System.out.println("list is emty");
           }
	}
        
        
            
           
           for (String str :removedList) { 
               System.out.print(str + " "); 
           
              }
		
	}
	
	
	
	
	
	

	private static void m2() {

		
		System.out.println("wekcine");
	}

	private static void m1() {

		 int num;
		 Scanner n=new Scanner(System.in);
		 num=n.nextInt();
		 int num2=num%2;
		 if(num2==0){
			 System.out.println("this is a even number");
		 }
		 else {
			 System.out.println("this is a odd number");
		 }
	}

}
