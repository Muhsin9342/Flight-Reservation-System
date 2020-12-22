package com.company;
import java.util.Scanner;
public class TouristTicket extends Ticket{

    private String hotelAddress;
    private String[] selectedTouristLocation;

    public TouristTicket(String pnrNum, String from, String to, String departureTimeStamp, String arrivalTimeStamp, boolean cancelled, Flight flight, Passenger passenger) {
        super(pnrNum, from, to, departureTimeStamp, arrivalTimeStamp, cancelled, flight, passenger);

    }

    public String getHotelAddress() {
        String hotelAddress = "Red pavilion Bangalore";
        return hotelAddress;
    }

    public void setHotelAddress(String hotelAddress) {
        this.hotelAddress = hotelAddress;
    }

    public void setSelectedTouristLocation(String[] selectedTouristLocation) {
        this.selectedTouristLocation = selectedTouristLocation;
    }

    public String getTicketDetails(){
        return  super.getTicket();
    }
    public String[] getSelectedTouristLocation(){
        String[] location = new String[5];
        location[0] = "Bangalore";
        location[1] = "Jaipur";
        location[2] = "Jabalpur";
        location[3] = "Mysore";
        location[4] = "Goa";
        for(String loc : location){
            System.out.println(loc);
        }
        return location;
    }


}
