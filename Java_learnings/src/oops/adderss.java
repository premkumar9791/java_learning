package oops;

public class adderss {

	
	String addline1;
	String addline2;
	String city;
	String Street;
	
	
	@Override
	public String toString() {
		return "adderss [addline1=" + addline1 + ", addline2=" + addline2 + ", city=" + city + ", Street=" + Street
				+ "]";
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public String getStreet() {
		return Street;
	}


	public void setStreet(String street) {
		Street = street;
	}


	public String getAddline2() {
		return addline2;
	}


	public void setAddline2(String addline2) {
		this.addline2 = addline2;
	}


	public String getAddline1() {
		return addline1;
	}


	public void setAddline1(String addline1) {
		this.addline1 = addline1;
	}


	public adderss() {
		super();
	}


	public adderss(String addline1, String addline2, String city, String street) {
		super();
		this.addline1 = addline1;
		this.addline2 = addline2;
		this.city = city;
		Street = street;
	}
	
	
}
