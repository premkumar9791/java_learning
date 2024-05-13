package taxi2;

import java.util.Scanner;

public class MainTaxi {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		boolean loop=true;
		
		while(loop) {
			
			Scanner s=new Scanner(System.in);
			System.out.println("Choose any one \n1.Book taxi \n2.Display detiels \n3.exit");
			int n=s.nextInt();
			
			switch(n) {
			case 1:{
				System.out.println("enter piclup location");
				char pickupLocation=s.next().charAt(0);
				System.out.println("enter drop location");
				char DropLocation=s.next().charAt(0);
				System.out.println("enter pickup time");
				int PicupTime=s.nextInt();
				System.out.println(taxiBooking.Booking(pickupLocation, DropLocation, PicupTime));
				break;
				
			}
			case 2:{
				
				taxiBooking.Display();
				break;
			}
			case 3:{
				System.out.println("--- Thank you ! ---");
				loop=false;
				s.close();
				break;
			}
			}
		}

	}

}
