package set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import javax.swing.text.html.HTMLDocument.Iterator;

public class Hashset {

	public static void main(String[] args) {
		
		
		  Set<String> hash_Set = new HashSet<String>(); 
		  
	        // Adding elements to the Set 
	        // using add() method 
	        hash_Set.add("Geeks"); 
	        hash_Set.add("For"); 
	        hash_Set.add("Geeks"); 
	        hash_Set.add("Example"); 
	        hash_Set.add("Set"); 
	  
	        // Printing elements of HashSet object 
	        System.out.println(hash_Set); 
	        
	        
	        Set<Integer> a = new HashSet<Integer>(); 
	        
	        // Adding all elements to List  
	        a.addAll(Arrays.asList( 
	            new Integer[] { 1, 3, 2, 4, 8, 9, 0 })); 
	        
	      // Again declaring object of Set class 
	      // with reference to HashSet 
	        Set<Integer> b = new HashSet<Integer>(); 
	          
	      b.addAll(Arrays.asList( 
	            new Integer[] { 1, 3, 7, 5, 4, 0, 7, 5 })); 
	  
	          
	        // To find union 
	        Set<Integer> union = new HashSet<Integer>(a); 
	        union.addAll(b); 
	        System.out.print("Union of the two Set"); 
	        System.out.println(union); 
	  
	        // To find intersection 
	        Set<Integer> intersection = new HashSet<Integer>(a); 
	        intersection.retainAll(b); 
	        System.out.print("Intersection of the two Set"); 
	        System.out.println(intersection); 
	  
	        // To find the symmetric difference 
	        Set<Integer> difference = new HashSet<Integer>(a); 
	        difference.removeAll(b); 
	        System.out.print("Difference of the two Set"); 
	        System.out.println(difference); 
	        
	        Set<String> hs = new HashSet<String>(); 
	        
	        // Elements are added using add() method 
	        // Later onwards we will show accessing the same 
	  
	        // Custom input elements 
	        hs.add("A"); 
	        hs.add("B"); 
	        hs.add("C"); 
	        hs.add("A"); 
	  
	        // Print the Set object elements 
	        System.out.println("Set is " + hs); 
	  
	        // Declaring a string 
	        String check = "D"; 
	  
	        // Check if the above string exists in 
	        // the SortedSet or not 
	        // using contains() method 
	        System.out.println("Contains " + check + " "
	                           + hs.contains(check)); 
	        
	   
	  
	        // Printing Set elements after removing an element 
	        // and printing updated Set elements 
	        System.out.println("After removing element " + hs); 

	    
	        
	        
	        
	        Set<String> h = new HashSet<String>(); 
	        
	        // Adding elements into the HashSet 
	        // using add() method 
	  
	        // Custom input elements 
	        h.add("India"); 
	        h.add("Australia"); 
	        h.add("South Africa"); 
	  
	        // Adding the duplicate element 
	        h.add("India"); 
	  
	        // Displaying the HashSet 
	        System.out.println(h); 
	  
	        // Removing items from HashSet 
	        // using remove() method 
	        h.remove("Australia"); 
	        System.out.println("Set after removing "
	                           + "Australia:" + h); 
	  
	        // Iterating over hash set items 
	        System.out.println("Iterating over set:"); 
	  
	        // Iterating through iterators 

	}

}
