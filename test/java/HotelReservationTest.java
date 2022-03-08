
import org.junit.Assert;
import org.junit.Test;
import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class HotelReservationTest {

	@Test
	public void GivenHotelName_ShouldReturnProperHotelName() {
		HotelReservation hotelReservation = new HotelReservation();
		hotelReservation.addHotel("LakeWood","RegularCustomer",110,80);
		String hotelName = hotelReservation.hotelList.get(0).getHotelName();
		Assert.assertEquals("LakeWood", hotelName);
	}
	@Test
	public void GivenRates_shouldReturnProperRates() {
		HotelReservation hotelReservation = new HotelReservation();
		hotelReservation.addHotel("LakeWood","RegularCustomer",110,80);
		int hotelRate = hotelReservation.hotelList.get(0).getWeekDayRates();
		Assert.assertEquals(110, hotelRate);
	}

	@Test
	public void GivenWeekEndRates_shouldReturnProperRates() {
		HotelReservation hotelReservation = new HotelReservation();
		hotelReservation.addHotel("LakeWood","RegularCustomer",110,80);
		int hotelRate = hotelReservation.hotelList.get(0).getWeekEndRates();
		Assert.assertEquals(80, hotelRate);
	}

	@Test
	public void GivenCustomer_shouldReturnProperCustomerType() {
		HotelReservation hotelReservation = new HotelReservation();
		hotelReservation.addHotel("LakeWood","RegularCustomer",110,80);
		String customerType = hotelReservation.hotelList.get(0).getCustomerType();
		Assert.assertEquals("RegularCustomer", customerType);
	}
	
	@Test
	public void AddedHotels_shouldReturn_CheapestHotelName() {
		HotelReservation hotelReservation = new HotelReservation();
		hotelReservation.addHotel("LakeWood", "Regular", 300, 20);
		hotelReservation.addHotel("BridgeWood", "Regular", 120, 90);
		hotelReservation.addHotel("FireWood", "Regular", 200, 130);
		LocalDate startDate = LocalDate.of(2020, Month.SEPTEMBER, 10);
		LocalDate endDate = LocalDate.of(2020, Month.SEPTEMBER, 11);
		String cheapestHotelName = hotelReservation.cheapestHotel(startDate, endDate);
		Assert.assertEquals("BridgeWood", cheapestHotelName);
	}
}
