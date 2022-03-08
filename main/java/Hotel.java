
public class Hotel {
	private String hotelName;
	private String customerType;
	private int weekDayRates;
	private int weekEndRates;
	
	
	public Hotel(String hotelName, String customerType, int weekDayRates, int weekEndRates) {
		super();
		this.hotelName = hotelName;
		this.customerType = customerType;
		this.weekDayRates = weekDayRates;
		this.weekEndRates = weekEndRates;
	}
	
	public String getHotelName() {
		return hotelName;
	}
	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}
	public int getWeekDayRates() {
		return weekDayRates;
	}
	public void setWeekDayRates(int weekDayRates) {
		this.weekDayRates = weekDayRates;
	}
	public int getWeekEndRates() {
		return weekEndRates;
	}
	public void setWeekEndRates(int weekEndRates) {
		this.weekEndRates = weekEndRates;
	}

	public String getCustomerType() {
		return customerType;
	}

	public void setCustomerType(String customerType) {
		this.customerType = customerType;
	}
    @Override
    public String toString() {
    	return "\n Hotel Name : " + hotelName +
    			"\n Customer Type : "+customerType+
    			"\n Hotel WeekDayRates : "+weekDayRates +
    			"\n Hotel WeekEndRates : "+weekEndRates ;
    }
}
