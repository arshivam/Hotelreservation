import java.time.LocalDate;
import java.time.Month;

public class HotelReservationMain {
	
	
	public static void main(String[] args) {
		HotelReservation hotelReservation = new HotelReservation();
		hotelReservation.addHotel("LakeWood", "Regular", 300, 20);
		hotelReservation.addHotel("BridgeWood", "Regular", 120, 90);
		hotelReservation.addHotel("FireWood", "Regular", 200, 130);
		
		hotelReservation.DisplayHotels();
		
		LocalDate startDate = LocalDate.of(2020, Month.SEPTEMBER, 10);
		LocalDate endDate = LocalDate.of(2020, Month.SEPTEMBER, 11);
		System.out.println("Cheapest Hotel Name is : "+hotelReservation.cheapestHotel(startDate, endDate));
		

	}
}
