package taxi4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;



public class Booking {

	public static void main(String[] args) {
		
		
		List<taxi> taxis=createdaxi(4); 
		
		boolean loop=true;
		
		while(loop) {
			
			Scanner s=new Scanner(System.in);
			int taxiId=1;
			System.out.println("choose any one \n1.booking taxi\n2.taxi details\n3.exit");
			int n=s.nextInt();
			
			switch(n) {
			case 1:{
				int customerId=taxiId;
				System.out.println("enter pickup location");
				char pickupLocation=s.next().charAt(0);
				System.out.println("enter drop location");
				char dropLocation=s.next().charAt(0);
				System.out.println("enter pickup time");
				char pickuptime=s.next().charAt(0);
				
				if('A' > pickupLocation || pickupLocation > 'F' || 'A' > dropLocation || dropLocation > 'F'   ) {
					
					System.out.println("valid pickup and drop A,B,C,D,E,F . Existing");
					s.close();
					return;
				}
				
				List<taxi> freeTaxi= getFreeTaxi(taxis,pickupLocation,pickuptime);
				
				if(freeTaxi.size() == 0) {
					
					System.out.println("no taxi can be alloted.Existing");
					s.close();
					return;
					
				}
				
				Collections.sort(freeTaxi,(a,b)->a.totalEarnings-b.totalEarnings);
				
				booktaxi(taxiId,pickupLocation,dropLocation,pickuptime,freeTaxi);
				taxiId++;
				break;
				
				}
			case 2:{
				
				for(taxi t:taxis) {
					t.PrintTaxiDetails();
				}
				for(taxi t:taxis) {
					t.printDetails();
				}
				break;
			}
			case 3:{
				loop=false;
				s.close();
				break;
			}
			default:{
				s.close();
				return;
				}
			
			
			
			
			
			}
		}
	}

	private static void booktaxi(int taxiId, char pickupLocation, char dropLocation, char pickuptime,
			List<taxi> freeTaxi) {
		// to find nearest
        int min = 999;

        //distance between pickup and drop
        int distanceBetweenpickUpandDrop = 0;

        //this trip earning
        int earning = 0;

        //when taxi will be free next
        int nextfreeTime = 0;

        //where taxi is after trip is over
        char nextSpot = 'Z';

        //booked taxi
        taxi bookedTaxi = null;

        //all details of current trip as string
        String tripDetail = "";
        
        for(taxi t : freeTaxi)
        {
            int distanceBetweenCustomerAndTaxi = Math.abs((t.currentSpot - '0') - (pickupLocation - '0')) * 15;
            if(distanceBetweenCustomerAndTaxi < min)
            {
                bookedTaxi = t;
                //distance between pickup and drop = (drop - pickup) * 15KM
                distanceBetweenpickUpandDrop = Math.abs((dropLocation - '0') - (pickupLocation - '0')) * 15;
                //trip earning = 100 + (distanceBetweenpickUpandDrop-5) * 10
                earning = (distanceBetweenpickUpandDrop-5) *  10 + 100;
                
                //drop time calculation
                int dropTime  = pickuptime + distanceBetweenpickUpandDrop/15;
                
                //when taxi will be free next
                nextfreeTime = dropTime;

                //taxi will be at drop point after trip
                nextSpot = dropLocation;

                // creating trip detail
                tripDetail = taxiId + "               " + taxiId + "          " + pickupLocation +  "      " + dropLocation + "       " + pickuptime + "          " +dropTime + "           " + earning;
                min = distanceBetweenCustomerAndTaxi;
            }
            
        }

        //setting corresponding details to allotted taxi
        bookedTaxi.setDetails(true,nextSpot,nextfreeTime,bookedTaxi.totalEarnings + earning,tripDetail);
        //BOOKED SUCCESSFULLY
        System.out.println("Taxi " + bookedTaxi.taxiId + " booked");
	}

	private static List<taxi> getFreeTaxi(List<taxi> taxis, char pickupLocation, char pickuptime) {
		
		List<taxi> freeTaxis = new ArrayList<taxi>();
        for(taxi t : taxis)
        {   
            //taxi should be free
            //taxi should have enough time to reach customer before pickuptime
            if(t.freeTime <= pickuptime && (Math.abs((t.currentSpot - '0') - (pickupLocation - '0')) <= pickuptime - t.freeTime))
            freeTaxis.add(t);

        }
        return freeTaxis;
	}

	private static List<taxi> createdaxi(int n) {
		
		List<taxi> taxis=new ArrayList<>();
		
		for(int i=1;i<=n;i++) {
			taxi t=new taxi();
			taxis.add(t);
		}
		
		return taxis;
	}
}
