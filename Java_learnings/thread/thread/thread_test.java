package thread;


 class man1 extends Thread{
	
	 public void run() {
		
			    try {  
			    	 for(int i=1;i<10;i++) {
			    		 System.out.println("run = "+i); 
			            Thread.sleep(1000);  
			        }  
			    }catch (InterruptedException e) {  
			        System.out.println(" thread Interrupted");  
			    } 
			
		 }
	 
	 
}

 class man2 extends Thread{
	
	 public void run() {
		 for(int i=1;i<10;i++) {
			 System.out.println("run2 = "+i);
		 }
	 }
	 
}

public class thread_test {
	
	public static void main(String[] args) {

	man1 n1=new man1();
	Thread r=new Thread(n1);
	
	man2 n2=new man2();
	Thread r2=new Thread(n2);
	
	r.start();
	r2.start();
	
	}
	
}
