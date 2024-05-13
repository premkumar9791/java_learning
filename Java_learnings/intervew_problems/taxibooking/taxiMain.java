package taxibooking;

import java.util.Scanner;

public class taxiMain {

	public static void main(String[] args) throws CloneNotSupportedException {
		boolean loop=true;
		
		while(loop) {
			System.out.println("choose any one\n1.book taxi\n2.display Detials\n3.exit ");
			Scanner s=new Scanner(System.in);
			int n=s.nextInt();
			
			
			switch(n) {
			case 1:
			{
				System.out.println("enter pickup location");
				char pickuplocation=s.next().charAt(0);
				System.out.println("enter drop location");
				char droplocation=s.next().charAt(0);
				System.out.println("enter pickup time");
				int pickupTime=s.nextInt();
				System.out.println(taxiBooking.Booking(pickuplocation, droplocation, pickupTime));
				break;
			}
			case 2:
			{
				taxiBooking.Display();
				break;
			}
			
			case 3:
			{
				loop = false;
				System.out.println("\tThank You!!!");
				s.close();
				break;
			}
			
			
			
			}
			
			
			
		}

		
		
		
		
		
		
		
		
		
		
		
		
	}

}
