package com.company;

public class RegularTicket extends Ticket{
    private String specialServices;

    public RegularTicket(String pnrNum, String from, String to, String departureTimeStamp, String arrivalTimeStamp, boolean cancelled, Flight flight, Passenger passenger,String specialServices) {
        super(pnrNum, from, to, departureTimeStamp, arrivalTimeStamp, cancelled, flight, passenger);
    }

    public String getTicketDetails(){
      return  super.getTicket();
    }

    public String getSpecialServices() {
        return specialServices;
    }

    public void setSpecialServices(String specialServices) {
        this.specialServices = specialServices;
    }



    @Override
    public String toString() {
        return "RegularTicket{" +
                "specialServices='" + specialServices + '\'' +
                ", flight=" + flight +
                ", passenger=" + passenger +
                '}';
    }
}
