package taxi4;

import java.util.ArrayList;
import java.util.List;

public class taxi {

	static int taxiCount=0;
	int taxiId;
	boolean booked;
	char currentSpot;
	int freeTime;
	int totalEarnings;
	List<String> trips;
	
	public taxi() {
		
		taxiCount=taxiCount+1;
		taxiId=taxiCount;
		booked=false;
		currentSpot='A';
		freeTime=6;
		totalEarnings=0;
		trips = new ArrayList<String>();
	}
	
	public void setDetails(boolean booked,char currentSpot,int freeTime,int totalEarnings,String tripDetail) {
		this.booked=booked;
		this.currentSpot=currentSpot;
		this.freeTime=freeTime;
		this.totalEarnings=totalEarnings;
		this.trips.add(tripDetail);
		
	}
	
	public void printDetails() {
		
		System.out.println("Taxi - "+this.taxiId  +"TotalEarnings - "+ this.totalEarnings);
		System.out.println("TaxiId    BookingId    customerId   From    To   Pickuptime    DropTime    Amount");
		for(String trip:trips) {
			System.out.println(taxiId +"                              "+trip);
		}
		System.out.println("--------------------------------------------------------------------------------------");
	}
	
	public void PrintTaxiDetails() {
		System.out.println("Taxi - "+this.taxiId + "totalEarnings -"+this.totalEarnings+"CurrentSpot -"+this.currentSpot+"Freetime - "+ this.freeTime );
	}
	
	
	
}
