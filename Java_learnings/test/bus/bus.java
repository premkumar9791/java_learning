package bus;

public class bus {
	
	int busNo;
	boolean ac;
	int capacity;
	
	public bus(int busNo,boolean ac,int capacity) {
		this.ac=ac;
		this.busNo=busNo;
		this.capacity=capacity;
		
	}
	
	public void display() {
		System.out.println("BusNo"+busNo+"  ac="+ac+" Seats="+capacity);
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	

}
