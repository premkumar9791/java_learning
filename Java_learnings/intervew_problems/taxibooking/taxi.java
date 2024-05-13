package taxibooking;

public class taxi implements Cloneable {

	private char currentLocation='A';
	private int customerId;
	private int taxiId;
	private char pickupLocation;
	private char dropLocation;
	private int picuptime;
	private int dropTime;
	private int earnings;
	
	
	
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	@Override
	public String toString() {
		return "taxi [currentLocation=" + currentLocation + ", customerId=" + customerId + ", taxiId=" + taxiId
				+ ", pickupLocation=" + pickupLocation + ", dropLocation=" + dropLocation + ", picuptime=" + picuptime
				+ ", dropTime=" + dropTime + ", earnings=" + earnings + "]";
	}
	public char getCurrentLocation() {
		return currentLocation;
	}
	public void setCurrentLocation(char currentLocation) {
		this.currentLocation = currentLocation;
	}
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public int getTaxiId() {
		return taxiId;
	}
	public void setTaxiId(int taxiId) {
		this.taxiId = taxiId;
	}
	public char getPickupLocation() {
		return pickupLocation;
	}
	public void setPickupLocation(char pickupLocation) {
		this.pickupLocation = pickupLocation;
	}
	public char getDropLocation() {
		return dropLocation;
	}
	public void setDropLocation(char dropLocation) {
		this.dropLocation = dropLocation;
	}
	public int getPicuptime() {
		return picuptime;
	}
	public void setPicuptime(int picuptime) {
		this.picuptime = picuptime;
	}
	public int getDropTime() {
		return dropTime;
	}
	public void setDropTime(int dropTime) {
		this.dropTime = dropTime;
	}
	public int getEarnings() {
		return earnings;
	}
	public void setEarnings(int earnings) {
		this.earnings = earnings;
	}

	
	
}
