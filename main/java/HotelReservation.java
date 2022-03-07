import java.util.ArrayList;

public class HotelReservation {

	ArrayList<Hotel> hotelList = new ArrayList<Hotel>();



	public void addHotel(String hotelName, String customerType, int weekDayRates, int weekEndRates) {
		Hotel hotel = new Hotel(hotelName, customerType, weekDayRates, weekEndRates);
		hotelList.add(hotel);	
	}

	public static void main(String[] args) {
		System.out.println("Welcome to hotelreservation program");
	}


}
