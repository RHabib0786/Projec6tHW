package constructor;

public class TestApartmentName {

	public static void main(String[] args) {
		
		    Apartment myapartment = new Apartment();
	    	myapartment.setapartmentName("Beautiful Apartment");
			System.out.println(myapartment.getapartmentName());
			
			Apartment k =new Apartment ("BlueHouse");
			k.lobby();

			Apartment s =new Apartment(500);
			s.playground();
			System.out.println(s.location);
			
			Apartment h = new Apartment("Grey Apartment", 500);
			h.swimmingpool();
			
			h.location = "mid-town";
			System.out.println(h.apartmentName);
			
			System.out.println(h.location);
			System.out.println(s.location);
	}

}
