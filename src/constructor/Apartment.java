package constructor;

public class Apartment {
	

	//variable non-static
	public String apartmentName;
	public int address;
	
	//static
	
	public static String location = "downtown";
	
	//constructor
	public Apartment() {} 
	
	public Apartment(String apartmentName) {
		this. apartmentName = apartmentName;
		System.out.println(apartmentName);
}
	public Apartment(String apartmentName, int address) {
		this.apartmentName = apartmentName;
		this.address =address;
		System.out.println(apartmentName + address);
		
	}
		public Apartment(int address) {
			this.address = address;
			System.out.println(address);
}
	//method
	public void lobby() {
		System.out.println("Nice setting area");
	}
	public void playground() {
		System.out.println("Where kids can play");
	}
	 public void swimmingpool() {
		 System.out.println("large swimming pool");
	 }
	 public void setapartmentName(String apartmentName) {
		this.apartmentName = apartmentName;
     }
	 public String getapartmentName() {
		return apartmentName;
	 }
}


