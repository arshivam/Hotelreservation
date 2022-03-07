import static org.junit.Assert.*;

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
	

}
