package taxi2;

public class taxi2 implements Cloneable {
	
	private char currentLocation;
	private int customerId;
	private int taxiId;
	private char pickuplocation;
	private char droplocation;
	private int pickupTime;
	private int dropTime;
	private int earnings;
	
	
	
	
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	
	@Override
	public String toString() {
		return "taxi2 [currentLocation=" + currentLocation + ", customerId=" + customerId + ", taxiId=" + taxiId
				+ ", pickuplocation=" + pickuplocation + ", droplocation=" + droplocation + ", pickupTime=" + pickupTime
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
	public char getPickuplocation() {
		return pickuplocation;
	}
	public void setPickuplocation(char pickuplocation) {
		this.pickuplocation = pickuplocation;
	}
	public char getDroplocation() {
		return droplocation;
	}
	public void setDroplocation(char droplocation) {
		this.droplocation = droplocation;
	}
	public int getPickupTime() {
		return pickupTime;
	}
	public void setPickupTime(int pickupTime) {
		this.pickupTime = pickupTime;
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
