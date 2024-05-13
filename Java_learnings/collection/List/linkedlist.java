package List;

import java.util.Iterator;
import java.util.LinkedList;

class book{
	int bookcode;
	String name;
	
	public book(int bookcode,String name){
		this.bookcode=bookcode;
		this.name=name;
	}
	
}

public class linkedlist {

	public static void main(String[] args) {
		
		llist();

	}

	private static void llist() {
		
		LinkedList<String> al=new LinkedList<>();
		
		 al.add("Ravi");  
		  al.add("Vijay");  
		  al.add("Ravi");  
		  al.add("Ajay");
		  
		  Iterator<String> i=al.descendingIterator();
		  
		  while(i.hasNext()) {
			  System.out.println(i.next());
		  }
		  
		  
		   al.add(1, "Gaurav");  
           System.out.println("After invoking add(int index, E element) method: "+al);  
          
           
           
           LinkedList<String> ll3=new LinkedList<String>();  
           ll3.add("John");  
           ll3.add("Rahul");   
           al.addAll(1, ll3);  
           System.out.println("After invoking addAll(int index, Collection<? extends E> c) method: "+al); 
           
           
    
           al.remove("Vijay");  
           System.out.println("After invoking remove(object) method: "+al);   
           al.remove(0);  
           System.out.println("After invoking remove(index) method: "+al);
           
           LinkedList<String> ll=new LinkedList<String>();  
           ll.add("Ravi");  
           ll.add("Vijay");  
           ll.add("Ajay");  
           ll.add("Anuj");  
           ll.add("Gaurav");  
           ll.add("Harsh");  
           ll.add("Virat");  
           ll.add("Gaurav");  
           ll.add("Harsh");  
           ll.add("Amit");  
           System.out.println("Initial list of elements: "+ll);  
         //Removing specific element from arraylist  
              ll.remove("Vijay");  
              System.out.println("After invoking remove(object) method: "+ll);   
         //Removing element on the basis of specific position  
              ll.remove(0);  
              System.out.println("After invoking remove(index) method: "+ll);   
              LinkedList<String> ll2=new LinkedList<String>();  
              ll2.add("Ravi");  
              ll2.add("Hanumat");  
         // Adding new elements to arraylist  
              ll.addAll(ll2);  
              System.out.println("Updated list : "+ll);   
         //Removing all the new elements from arraylist  
              ll.removeAll(ll2);  
              System.out.println("After invoking removeAll() method: "+ll);   
         //Removing first element from the list  
              ll.removeFirst();  
              System.out.println("After invoking removeFirst() method: "+ll);  
          //Removing first element from the list  
              ll.removeLast();  
              System.out.println("After invoking removeLast() method: "+ll);  
          //Removing first occurrence of element from the list  
              ll.removeFirstOccurrence("Gaurav");  
              System.out.println("After invoking removeFirstOccurrence() method: "+ll);  
          //Removing last occurrence of element from the list  
              ll.removeLastOccurrence("Harsh");  
              System.out.println("After invoking removeLastOccurrence() method: "+ll);  
              
              
              LinkedList<book> book=new LinkedList<>();
              
              book b1=new book(102,"book1");
              book b2=new book(101,"book2");
              book b3=new book(105,"book3");
              book b4=new book(103,"book4");
              book b5=new book(104,"book5");
              book b6=new book(106,"book6");
              
              
              book.add(b1);
              book.add(b2);
              book.add(b3);
              book.add(b4);
              book.add(b5);
              book.add(b6);
              
              for(book b:book) {
            	  System.out.println(b.name+" "+b.bookcode);
              }
              
              
		  
	}

}
