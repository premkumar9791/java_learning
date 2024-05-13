package List;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ArrayList {

	public static void main(String[] args) {
		
           Arraylist();
	}

	private static void Arraylist() {

		List<Integer> listNumbers = List.of(1, 2, 3, 4, 5, 6);
		
		
		List<String> a=new java.util.ArrayList<>();
		
		// Adding elements to a List:
		    a.add("n");
		    a.add("e");
		    a.add("t");
		    a.add("u");
		    a.add("w");
		    a.add("n");
		    System.out.println(a);
		    
		  List<String> b=new java.util.ArrayList<>();
		  b.add("o");
		  b.add("o");
		  b.add("o");
		  b.add("o");
	      b.addAll(2,a);
	      System.out.println(b); 
	       
	       
	       List<String> c=new java.util.ArrayList<>(b);
	        c.add("f");
		    c.add("h");
		    c.add("s");
		    c.add("f");
		    c.add("s");
		    c.add("c");
		    
		    c.add(2,"number");
		    System.out.println(c);
	       
	       
	       // Retrieving elements from a List
	       
		    System.out.println(c.get(2));
		    
		  //  Updating elements in a List
		    c.set(5, "set the value");
		    System.out.println(c);
	       
	     //Removing elements from a List
		    c.remove("number");
		    c.remove(3);
		    System.out.println(c);
		    
		 //  Iterating over elements in a list
   
		    for (String element : c) {
		        System.out.println(element);
		    }
	       
	       
		    Iterator<String> iterator = c.iterator();
		    while (iterator.hasNext()) {
		        System.out.println(iterator.next());
		    }
	       
		    a.forEach(s -> System.out.println(s));
		    
		    
		//    Searching for an element in a list
		    
		    if(c.contains("u")) {
		    	System.out.println("yes");
		    }
		    else {
		    	System.out.println("no");
		    }
		    
		    int a1=c.indexOf("u");
		    
		    
		  //Sorting a list
		    
		    Collections.sort(c);
		    System.out.println(c);
		    
		    //7. Copying elements from one list into another
		    
		    
		    List<String> sourceList = new java.util.ArrayList<>();
		    sourceList.add("A");
		    sourceList.add("B");
		    sourceList.add("C");
		    sourceList.add("D");
		    List<String> destList = new java.util.ArrayList<String>();
		    destList.add("V");
		    destList.add("W");
		    destList.add("X");
		    destList.add("Y");
		    destList.add("Z");
		    System.out.println("destList before copy: " + destList);
		    Collections.copy(destList, sourceList);
		    System.out.println("destList after copy: " + destList);
		    
		    // Shuffling elements in a list
		    
		    
		    List<Integer> numbers = new java.util.ArrayList<Integer>();
		    for (int i = 0; i <= 10; i++) 
		    	numbers.add(i);
		    System.out.println("List before shuffling: " + numbers);
		    Collections.shuffle(numbers);
		    System.out.println("List after shuffling: " + numbers);
		    
		    
		   //Reversing elements in a list 
		    
		    Collections.reverse(numbers);
		    System.out.println("List after shuffling: " + numbers);
		    
		   // Extracting a portion of a list
		    
		    System.out.println(a.subList(0, 3));
		    
		    // Converting between Lists and arrays
		    
		    Object [] n1=a.toArray();
		    System.out.println(n1);
		    for(Object x:n1) {
		    	System.out.println(x);	
		    }
		    
		    
	       
	}

}
