package bus;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class booking {
	String pasangername;
	int busno;
	Date date;
	int Seat;
	
	


	public booking(String pasangername, int busno, Date date, int seat) {
		super();
		this.pasangername = pasangername;
		this.busno = busno;
		this.date = date;
		this.Seat = seat;
	}

    public  void pasangerdetails()
    {
    	System.out.println("PasangerName:"+this.pasangername+"  BusNo:"+this.busno+"  date:"+this.date+"  seat:"+this.Seat);
    }


	public static void main(String[] agr) {
		
		  ArrayList<bus> l=new ArrayList<bus>();
		  l.add(new bus(1,true,50));
		  l.add(new bus(2,false,50));
		  l.add(new bus(3,true,50));
		  
		  ArrayList<booking> B=new ArrayList<>();
		 
	  boolean loop=true;
	  while(loop) {
				  
		  for(bus t:l) {
			  t.display();
		  }
		  
		  Scanner n=new Scanner(System.in);
		  System.out.println("choose any one \n1.booking \n2.exit \n3.disaply passenger Details");
		  int k=n.nextInt();
		  System.out.println("------------");
		  
		  switch(k) {
		  
		  case 1:{
			  System.out.println("enter name");
			  String passangername=n.next();
			  System.out.println("enter busno");
			  int busno=n.nextInt();
			  System.out.println("enter how many seat you want");
			  int seat=n.nextInt();
			  System.out.println("enter date (DD/MM/YYYY)");
			  String dates=n.next();
			  SimpleDateFormat d=new SimpleDateFormat("dd/MM/yyyy");
			  Date date = null;
			  
			try {
				date = d.parse(dates);
			} catch (ParseException e) {
				e.printStackTrace();
			}
			
			  boolean ans=Booking(l,B,passangername,busno,date,seat);
			  if(ans) {
				  B.add(new booking(passangername,busno,date,seat));
				  System.out.println("your  ticket is booked");
			  }
			  else {
				  System.out.println("passenger seat is not available");
			  }
			  break;
			  
			  
		  }
		  case 2:{
			  loop=false;
			  System.out.println("------Thank you------");
			  n.close();
			  break;
		  }
		  case 3:{
			  for(booking t:B) {
			  t.pasangerdetails();
		  }
			  break;
			  
		  }
		  
		  
		  
		  }
		 
		  
		  
	  }
	  

	
	  
	  
	  
	}

	private static boolean Booking( ArrayList<bus> l,ArrayList<booking> b, String passangername, int busno2, Date date2, int seat2) {
		int capacity=0;
		int seat=0;
		for(bus t:l) {
			if(t.busNo == busno2) {
				capacity=t.getCapacity();
			}
		}
		
		for(booking t:b) {
			if(t.busno == busno2 && t.date.equals(date2)) {
			 seat+=t.Seat;
			}
		}
	    seat+=seat2;
		
		return  seat<=capacity?true:false;
	}


}
