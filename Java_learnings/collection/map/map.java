package map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;



class Book {    
	int id;    
	String name,author,publisher;    
	int quantity;    
	public Book(int id, String name, String author, String publisher, int quantity) {    
	    this.id = id;    
	    this.name = name;    
	    this.author = author;    
	    this.publisher = publisher;    
	    this.quantity = quantity;    
	} 
}

public class map {

	public static void main(String[] args) {
		
     // hashmap();
     // Linkedhashmap();
        treemap();
	}
	


	private static void treemap() {
		
		
	    Map<Integer,Book> map=new TreeMap<Integer,Book>();    
	    //Creating Books    
	    Book b1=new Book(101,"Let us C","Yashwant Kanetkar","BPB",8);    
	    Book b2=new Book(102,"Data Communications & Networking","Forouzan","Mc Graw Hill",4);    
	    Book b3=new Book(103,"Operating System","Galvin","Wiley",6);    
	    //Adding Books to map   
	    map.put(2,b2);  
	    map.put(1,b1);  
	    map.put(3,b3);  
	      
	    //Traversing map  
	    for(Map.Entry<Integer, Book> entry:map.entrySet()){    
	        int key=entry.getKey();  
	        Book b=entry.getValue();  
	        System.out.println(key+" Details:");  
	        System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);   
	    }
		
	}



	private static void Linkedhashmap() {
		   //Creating map of Books    
	    Map<Integer,Book> map=new LinkedHashMap<Integer,Book>();    
	    //Creating Books    
	    Book b1=new Book(101,"Let us C","Yashwant Kanetkar","BPB",8);    
	    Book b2=new Book(102,"Data Communications & Networking","Forouzan","Mc Graw Hill",4);    
	    Book b3=new Book(103,"Operating System","Galvin","Wiley",6);    
	    //Adding Books to map   
	    map.put(2,b2);  
	    map.put(1,b1);  
	    map.put(3,b3);  
	      
	    //Traversing map  
	    for(Map.Entry<Integer, Book> entry:map.entrySet()){    
	        int key=entry.getKey();  
	        Book b=entry.getValue();  
	        System.out.println(key+" Details:");  
	        System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);   
	    } 
		
	}



	private static void hashmap() {
//		 HashMap<Integer,String> map=new HashMap<Integer,String>();//Creating HashMap    
//		   map.put(1,"Mango");  //Put elements in Map  
//		   map.put(2,"Apple");    
//		   map.put(3,"Banana");   
//		   map.put(4,"Grapes");   
//		       
//		   System.out.println("Iterating Hashmap...");  
//		   for(Entry<Integer,String> m:map.entrySet()){    
//		    System.out.println(m.getKey()+" "+m.getValue());
//		   }
		   
		   
		   //Creating map of Books    
		    Map<Integer,Book> map=new HashMap<Integer,Book>();    
		    //Creating Books    
		    Book b1=new Book(101,"Let us C","Yashwant Kanetkar","BPB",8);    
		    Book b2=new Book(102,"Data Communications & Networking","Forouzan","Mc Graw Hill",4);    
		    Book b3=new Book(103,"Operating System","Galvin","Wiley",6);    
		    //Adding Books to map   
		    map.put(1,b1);  
		    map.put(2,b2);  
		    map.put(3,b3);  
		      
		    //Traversing map  
		    for(Map.Entry<Integer, Book> entry:map.entrySet()){    
		        int key=entry.getKey();  
		        Book b=entry.getValue();  
		        System.out.println(key+" Details:");  
		        System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);   
		    }   
		
	}
	
	
	
}
