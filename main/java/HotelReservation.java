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

	public String cheapestHotel(LocalDate startDate, LocalDate endDate) {
		int totalRate = 0;
		long noOfDaysBetween = ChronoUnit.DAYS.between(startDate, endDate);
		int cheapestRate = (int) Math.max(hotelList.get(0).getWeekEndRates() * noOfDaysBetween, (hotelList.get(0).getWeekDayRates() * noOfDaysBetween));
		String ans = hotelList.get(0).getHotelName();


		java.time.DayOfWeek dayOfWeek = startDate.getDayOfWeek();
		System.out.println("Booking Day : "+dayOfWeek);
		if(dayOfWeek == dayOfWeek.MONDAY || dayOfWeek == dayOfWeek.TUESDAY || dayOfWeek == dayOfWeek.WEDNESDAY || dayOfWeek == dayOfWeek.THURSDAY || dayOfWeek == dayOfWeek.FRIDAY) {
			for(int i =0; i<hotelList.size();i++) {
				totalRate = (int) (hotelList.get(i).getWeekDayRates()*noOfDaysBetween);
				if (totalRate < cheapestRate) {
					cheapestRate = totalRate;
					ans = hotelList.get(i).getHotelName();
				}
				System.out.println("Hotel Name : "+hotelList.get(i).getHotelName());
				System.out.println("Total Rate For WeekDays : "+totalRate);
			}

		}
		if(dayOfWeek == dayOfWeek.SATURDAY || dayOfWeek == dayOfWeek.SATURDAY) {
			for(int i =0; i<hotelList.size();i++) {
				totalRate = (int) (hotelList.get(i).getWeekEndRates()*noOfDaysBetween);
				if (totalRate < cheapestRate) {
					cheapestRate = totalRate;
					ans = hotelList.get(i).getHotelName();
				}
				System.out.println("Hotel Name : "+hotelList.get(i).getHotelName());
				System.out.println("Total Rate For WeekEnds : "+totalRate);
			}
		}
		return ans;
	}

	public void DisplayHotels() {
		System.out.println("\nDifferent Hotel in List are : ");
		for(int i=0;i<hotelList.size();i++) {
			System.out.println(hotelList.get(i));
		}
	}

}
