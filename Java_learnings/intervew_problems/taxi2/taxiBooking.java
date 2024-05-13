package taxi2;

import java.util.ArrayList;

import taxibooking.taxi;

public class taxiBooking {

	private static ArrayList<taxi2> taxiList=new ArrayList<taxi2>();
	private static int taxiListLimit=4;
	private static int taxiId=1;
	private static ArrayList<taxi2> taxiHistory=new ArrayList<taxi2>();
	
	public static String Booking(char pickupLocation,char DropLocation,int PicupTime) throws CloneNotSupportedException {
		
		
		if(taxiList.size()<taxiListLimit) {
			taxiList.add(new taxi2());
		}
		
		int min=Integer.MAX_VALUE;
		taxi2 taxiready=null;
		
		for(taxi2 t:taxiList) {
			if(t.getDropTime() < PicupTime &&Math.abs(pickupLocation - t.getCurrentLocation())< min) {
				taxiready=t;
				min=Math.abs(pickupLocation - t.getCurrentLocation());
			}
		}
		
		if(taxiready!=null) {
			taxiready.setCustomerId(taxiId++);
			taxiready.setPickupTime(PicupTime);
			taxiready.setPickuplocation(pickupLocation);
			taxiready.setDroplocation(DropLocation);
			taxiready.setCurrentLocation(DropLocation);	
			taxiready.setDropTime(PicupTime + Math.abs(DropLocation-pickupLocation));
			taxiready.setEarnings((taxiready.getEarnings())+ Math.abs(DropLocation-pickupLocation)*(100+(10*10)));
			taxiready.setTaxiId(taxiList.indexOf(taxiready)+1);
			taxiHistory.add((taxi2)taxiready.clone());
		}
		
		return taxiready!=null?"taxi number"+taxiready.getTaxiId()+"is booked!":"taxi not available";
	}
	
	public static void Display() {
		System.out.println("----------------------------------");
		for(taxi2 t:taxiHistory) {
			System.out.println(t.toString());
			System.out.println("----------------------------------");
		}
		
	}
	
}
