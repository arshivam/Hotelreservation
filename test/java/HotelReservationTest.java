
import org.junit.Assert;
import org.junit.Test;

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
}
