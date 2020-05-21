public class Playground 
{
    private String NamePlayground;
    private String LocationPlayground ;
    private double Price;
    private String array_Hour[];
    private int BookingNumber;
    private int available_hour;
    private availableHours[] available;
    public Playground() {
    }

    public int getAvailable_hour() {
        return available_hour;
    }

    public void setAvailable_hour(int available_hour) {
        this.available_hour = available_hour;
    }

    public String getNamePlayground() {
        return NamePlayground;
    }

    public void setNamePlayground(String NamePlayground) {
        this.NamePlayground = NamePlayground;
    }

    public String getLocationPlayground() {
        return LocationPlayground;
    }

    public void setLocationPlayground(String LocationPlayground) {
        this.LocationPlayground = LocationPlayground;
    }

    public double getPrice() {
        return Price;
    }

    public void setPrice(double Price) {
        this.Price = Price;
    }

    public void setavailable(availableHours[] available) {
        this.available = available;
    }

    public availableHours[] getavailable() {
        return available;
    }

    public int getBookingNumber() {
        return BookingNumber;
    }

    public void setBookingNumber(int BookingNumber) {
        this.BookingNumber = BookingNumber;
    }
    
}