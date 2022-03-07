import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;

public class HotelReservation {

	ArrayList<Hotel> hotelList = new ArrayList<Hotel>();

	public void addHotel(String hotelName, String customerType, int weekDayRates, int weekEndRates) {
		Hotel hotel = new Hotel(hotelName, customerType, weekDayRates, weekEndRates);
		hotelList.add(hotel);	
	}

	public int cheapestHotel(LocalDate startDate, LocalDate endDate) {
		int totalRate = 0;
		long noOfDaysBetween = ChronoUnit.DAYS.between(startDate, endDate);

		java.time.DayOfWeek dayOfWeek = startDate.getDayOfWeek();
		System.out.println("Booking Day : "+dayOfWeek);
		if(dayOfWeek == dayOfWeek.MONDAY || dayOfWeek == dayOfWeek.TUESDAY || dayOfWeek == dayOfWeek.WEDNESDAY || dayOfWeek == dayOfWeek.THURSDAY || dayOfWeek == dayOfWeek.FRIDAY) {
			totalRate = (int) (hotelList.get(0).getWeekDayRates()*noOfDaysBetween);
			System.out.println("Cheapest Hotel Name : "+hotelList.get(0).getHotelName());
			System.out.println("Total Rate For WeekDays : "+totalRate);

		}
		if(dayOfWeek == dayOfWeek.SATURDAY || dayOfWeek == dayOfWeek.SATURDAY) {
			totalRate = (int) (hotelList.get(0).getWeekEndRates()*noOfDaysBetween);
			System.out.println("Cheapest Hotel Name : "+hotelList.get(0).getHotelName());
			System.out.println("Total Rate For WeekEnds : "+totalRate);

		}
		return totalRate;
	}
}