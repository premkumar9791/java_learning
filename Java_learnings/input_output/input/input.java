package input;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilterInputStream;
import java.io.InputStream;
import java.io.SequenceInputStream;
import java.util.Scanner;
import java.util.regex.Pattern;

public class input {

	public static void main(String[] args) {

		//read();
		//r1();
		//r2();
		//r3();
		//r4();
		//r5();
		//r6();
		  r7();
          
	}

	private static void r7() {
		 try{      
			    File file = new File("C:\\java io_file\\textandnum.txt");
	            Scanner scanner = new Scanner(file);
	       	 FileOutputStream fout=new FileOutputStream("C:\\java io_file\\numbers.txt");    
      	     BufferedOutputStream bout=new BufferedOutputStream(fout);
	           

	            while (scanner.hasNext()) {
	                String token = scanner.next();
	                if(Pattern.matches("[0-9]{10}",token)) {
	                
	                     
	           	     String s=token + System.lineSeparator();    
	           	     byte b[]=s.getBytes();    
	           	     bout.write(b);    
	           	       
	           	  
	                }
	            }
	            bout.flush();    
          	     bout.close();    
          	     fout.close(); 
	            scanner.close(); 
	            System.out.println("success"); 
			  }catch(Exception e){System.out.println(e);} 
		
	}

	private static void r6() {
		try {
			  File data = new File("C:\\java io_file\\testout2.txt");  
		        FileInputStream  file = new FileInputStream(data);  
		        FilterInputStream filter = new BufferedInputStream(file);  
		        int k =0;  
		        while((k=filter.read())!=-1){  
		            System.out.print((char)k);  
		        }  
		        file.close();  
		        filter.close();  
		    
		}
	catch(Exception e) {
		System.out.println(e);	
	}
		
	}

	private static void r5() {
		try {
			 InputStream input = new FileInputStream("C:\\java io_file\\testout1.txt");  
			    DataInputStream inst = new DataInputStream(input);  
			    int count = input.available();  
			    byte[] ary = new byte[count];  
			    inst.read(ary);  
			    for (byte bt : ary) {  
			      char k = (char) bt;  
			      System.out.print(k+"-");  
			    } 
		}
		catch(Exception e) {
			System.out.println(e);	
		}
		
	}

	private static void r4() {
		try {
			   byte[] buf = { 35, 36, 37, 38 };  
			    // Create the new byte array input stream  
			    ByteArrayInputStream byt = new ByteArrayInputStream(buf);  
			    int k = 0;  
			    while ((k = byt.read()) != -1) {  
			      //Conversion of a byte into character  
			      char ch = (char) k;  
			      System.out.println("ASCII value of Character is:" + k + "; Special character is: " + ch);  
			    }  
		}
		catch(Exception e) {
			System.out.println(e);	
		}
		
	}

	private static void r3() {
		try {
			   FileInputStream input1=new FileInputStream("C:\\java io_file\\testout1.txt");    
			   FileInputStream input2=new FileInputStream("C:\\java io_file\\testout2.txt");    
			   SequenceInputStream inst=new SequenceInputStream(input1, input2);    
			   int j;    
			   while((j=inst.read())!=-1){    
			    System.out.print((char)j);    
			   }    
			   inst.close();    
			   input1.close();    
			   input2.close();    
			  } 
		catch(Exception e) {
			System.out.println(e);	
		}
		}
		
	

	private static void r2() {
		
		try {
			FileInputStream fin=new FileInputStream("C:\\java io_file\\testout1.txt");
			 BufferedInputStream n=new BufferedInputStream(fin);
			int i;
			while((i=n.read())!= -1) {
				System.out.print((char)i);
			}
			n.close();
		}
		catch(Exception e) {
			System.out.println(e);	
		}
	}

	private static void r1() {
		  try{    
			    FileInputStream fin=new FileInputStream("C:\\java io_file\\testout.txt");    
			    BufferedInputStream bin=new BufferedInputStream(fin);    
			    int i;    
			    while((i=bin.read())!=-1){    
			     System.out.print((char)i);    
			    }    
			    bin.close();    
			    fin.close();    
			  }catch(Exception e){System.out.println(e);}   
		
	}

	private static void read() {
		
		 try{    
	            FileInputStream fin=new FileInputStream("C:\\java io_file\\testout.txt");    
	            int i=fin.read();  
	            System.out.print((char)i);    
	  
	            fin.close();    
	          }catch(Exception e){System.out.println(e);}  
		
	}

}
