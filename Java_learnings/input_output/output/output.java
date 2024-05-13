package output;

import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class output {

	public static  void main(String[] args) {
		
		//innerpath();
		//creatfile();
		//c2();
		//c3();
	    //c4();
		//c5();
		//c6();
		//c7();
		//c8();
		//c9();
		//c10();
		//c11();
		
	}

	

	private static void c11() {
		
try { 
			
	        FileOutputStream n=new FileOutputStream("C:\\java io_file\\textandnum.txt");  
            BufferedOutputStream k=new BufferedOutputStream(n);
  
            String m="In the heart of the city, where skyscrapers kissed the clouds and"
            		+ " streets pulsed with the energy 9841158238 of a million dreams, mobile phones were the lifelines"
            		+ " that connected the diverse tapestry of humanity. From the bustling markets to the "
            		+ "tranquil parks, these devices were ubiquitous, each bearing the promise of communication"
            		+ " and connection. In the cafes, people hunched over screens, their fingers dancing across "
            		+ "virtual keyboards as they sent messages, made calls, and scrolled through endless streams"
            		+ " of information. Each phone 9841158453 held a unique digital identity, a string"
            		+ " of numbers that represented a gateway to another soul. Some dialed in search of"
            		+ " love, while others sought solace in the familiar voices of friends or family."
            		+ " Amidst the cacophony of urban life, amidst the honking of horns and the chatter of "
            		+ "crowds, these numbers danced 9791090240 in the ether, each a silent 9498486467 messenger of human longing and"
            		+ " desire. And so, in this modern age, where technology intertwined with every facet of "
            		+ "existence, the mobile phone became more than just a device; it became a symbol of human"
            		+ " connection in an increasingly interconnected world. Across the cityscape, from the"
            		+ " neon-lit streets to the shadowy  9940401066 alleys, the glow of screens illuminated faces both"
            		+ " young and old, each one a testament to the power of communication in forging bonds that transcended time"
            		+ " and space. And as the sun set on the horizon, casting long shadows over the city, the phones continued "
            		+ "to buzz and ring, a symphony of sound that echoed through the night, reminding all who listened of the endless"
            		+ " possibilities that lay just a dial tone away.";  
  
            byte b[]= m.getBytes();
  		  k.write(b);
  		  k.flush();
  		  k.close();
  		  n.close();
  		  System.out.println("success");
        } catch (Exception e) {  
            e.getMessage();  
        }
		
	}
		
	



	private static void c10() {
		try { 
			
            OutputStream outputStream = new FileOutputStream("output.txt");  
            Writer outputStreamWriter = new OutputStreamWriter(outputStream);  
  
            outputStreamWriter.write("Hello World");  
  
            outputStreamWriter.close();  
        } catch (Exception e) {  
            e.getMessage();  
        }
		
	}



	private static void c9() {
		
		   try {  
	            Writer w = new FileWriter("output.txt");  
	            String content = "I love my country";  
	            w.write(content);  
	            w.close();  
	            System.out.println("Done");  
	        } catch (IOException e) {  
	            e.printStackTrace();  
	        } 
		
	}



	private static void c8() {
		try {
			File data = new File("C:\\java io_file\\testout1.txt");  
	        FileOutputStream file = new FileOutputStream(data);  
	        FilterOutputStream filter = new FilterOutputStream(file);  
	        String s="Welcome to javaTpoint.";      
	        byte b[]=s.getBytes();      
	        filter.write(b);     
	        filter.flush();  
	        filter.close();  
	        file.close();  
	        System.out.println("Success...");  
  
		     
		}
		catch(Exception e){
			System.out.println(e);
		}
		
	}



	private static void c7() {
		
		try {
			   FileOutputStream file = new FileOutputStream("C:\\java io_file\\testout1.txt");  
		        DataOutputStream data = new DataOutputStream(file);  
		        data.writeInt(65);  
		        data.flush();  
		        data.close();  
		        System.out.println("Succcess...");  
		     
		}
		catch(Exception e){
			System.out.println(e);
		}
	}



	private static void c6() {
		
		try {
		 FileOutputStream fout1=new FileOutputStream("C:\\java io_file\\testout1.txt");    
	      FileOutputStream fout2=new FileOutputStream("C:\\java io_file\\testout2.txt");    
	        
	      ByteArrayOutputStream bout=new ByteArrayOutputStream();   
	      String m="vilevbueiv jnveijvbe  ijnvireuvbqiv  eivjbeiuvbevij ";
		  byte b[]= m.getBytes();
	      bout.write(b);    
	      bout.writeTo(fout1);    
	      bout.writeTo(fout2);    
	        
	      bout.flush();    
	      bout.close();//has no effect    
	      System.out.println("Success...");   
	}
	catch(Exception e){
		System.out.println(e);
	}
	}



	private static void c5() {
		
		try {
		   FileOutputStream n=new FileOutputStream("C:\\java io_file\\testout2.txt");	
		   BufferedOutputStream k=new BufferedOutputStream(n);
		   String m="vilevbueiv jnveijvbe  ijnvireuvbqiv  eivjbeiuvbevij ";
		  byte b[]= m.getBytes();
		  k.write(b);
		  k.flush();
		  k.close();
		  n.close();
		  System.out.println("success");
		}
		catch(Exception e){
			System.out.println(e);
		}
		
	}



	private static void c4() {
		try {
		  FileOutputStream k= new FileOutputStream("C:\\java io_file\\testout2.txt");
		  
		  String n="welcome ";
		  for(int i=0;i<n.length();i++) {
			  k.write(n.charAt(i));  
		  }
		 
		  k.close();
		  System.out.println("succses");
		}
		catch(Exception e){
			System.out.println(e);
		}
	}

	private static void c3() {
		   try{
	    FileOutputStream fout=new FileOutputStream("C:\\java io_file\\testout2.txt");    
	     BufferedOutputStream bout=new BufferedOutputStream(fout);    
	     String s="Welcome to javaTpoint.";    
	     byte b[]=s.getBytes();    
	     bout.write(b);    
	     bout.flush();    
	     bout.close();    
	     fout.close();    
	     System.out.println("success");  
	 }
		   catch(Exception e){System.out.println(e);}  
		
	}

	private static void c2() {
		
	    try{    
            FileOutputStream fout=new FileOutputStream("C:\\java io_file\\testout.txt");    
            String s="Welcome to javaTpoint.";    
            byte b[]=s.getBytes();//converting string into byte array    
            fout.write(b);    
            fout.close();    
            System.out.println("success...");    
           }catch(Exception e){System.out.println(e);}  
		
	}

	private static void creatfile() {
		
		 try{ 
			 
             FileOutputStream fout=new FileOutputStream("C:\\java io_file\\testout.txt");    
             fout.write(65);    
             fout.close();    
             System.out.println("success...");  
             
            }
		 catch(Exception e)
		 {
			 System.out.println(e);
			 }
		
		
		
	}
	
	private static void innerpath() {
		   String p = System.getProperty("user.dir");
		   System.out.println(p);
		
	}
	
}
