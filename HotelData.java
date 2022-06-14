/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectfolder;

/**
 *
 * @author ROGUE
 */
public class HotelData {
    private String hotelName;
    private String location;
    private int price;
    private long contact;
    private String rating;
    private String category;

    public HotelData(String hotelName, String location, int price, long contact, String rating, String category) {
        this.hotelName = hotelName;
        this.location = location;
        this.price = price;
        this.contact = contact;
        this.rating = rating;
        this.category = category;
    }

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public long getContact() {
        return contact;
    }

    public void setContact(long contact) {
        this.contact = contact;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "HotelData{" + "hotelName=" + hotelName + ", location=" + location + ", price=" + price + ", contact=" + contact + ", rating=" + rating + ", category=" + category + '}';
    }
    
}
