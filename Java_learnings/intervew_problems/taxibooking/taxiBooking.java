package taxibooking;

import java.util.ArrayList;

public class taxiBooking {

	private static ArrayList<taxi> taxiList=new ArrayList<taxi>();
	private static int taxiListLimit=4;
	private static int idGenerator=1;
	private static ArrayList<taxi> taxibookedhistory=new ArrayList<taxi>();
	
	
	public static String Booking(char pickuplocation,char droplocation,int pickupTime) throws CloneNotSupportedException
	{
	
		if(taxiList.size()<taxiListLimit) {
			taxiList.add(new taxi());
		}
		
		int min=Integer.MAX_VALUE;
		taxi taxiReady=null;
		
		for(taxi t:taxiList) {
			
			if(t.getDropTime()<=pickupTime &&Math.abs(pickuplocation - t.getCurrentLocation()) < min) {
				taxiReady=t;
				min=Math.abs(pickuplocation - t.getCurrentLocation());
			}
			
		}
		
		if(taxiReady!=null) {
			taxiReady.setCustomerId(idGenerator++);
			taxiReady.setPicuptime(pickupTime);
			taxiReady.setPickupLocation(pickuplocation);
			taxiReady.setDropLocation(droplocation);
			taxiReady.setCurrentLocation(droplocation);	
			taxiReady.setDropTime(pickupTime + Math.abs(droplocation-pickuplocation));
			taxiReady.setEarnings((taxiReady.getEarnings())+ Math.abs(droplocation-pickuplocation)*(100+(10*10)));
			taxiReady.setTaxiId(taxiList.indexOf(taxiReady)+1);
			taxibookedhistory.add((taxi)taxiReady.clone());
		}
		
		return taxiReady!=null?"taxi number"+taxiReady.getTaxiId()+"is booked!":"taxi not available";
		
	}
	
	public static void Display() {
		
		System.out.println("-----------------------------------------");
		for(taxi t:taxibookedhistory) {
			System.out.println(t.toString());
			System.out.println("-----------------------------------------");
		}
		
	}
	
	
}
