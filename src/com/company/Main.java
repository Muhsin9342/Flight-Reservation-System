package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("--------PASSENGER DETAILS--------");
	    Passenger passenger = new Passenger("23 Street","Bangalore","Karnataka","muhsin","muhsin@gmail","998979");
	    System.out.println(passenger.toString());
	    System.out.println(passenger.getContactDetails());
	    System.out.println(passenger.getAddressDetails());
	    System.out.println("Passenger Count :" + passenger.getPassengerCount());

	    System.out.println("--------FLIGHT DETAILS----------");
        Flight flight = new Flight("muh123","muh airlines",250,50);
        System.out.println(flight);
        System.out.println(flight.getFlightDetails());
        System.out.println("-------FLIGHT STATUS---------");
        System.out.println(flight.checkAvailability());
        System.out.println("-------REGULAR TICKET---------");
        RegularTicket regularTicket  = new RegularTicket("REGULAR-786","bangalore","Mumbai","21-12-20 12:30:54","22-12-20 13:30:54",false,flight,passenger,"Food");
        System.out.println(regularTicket.getTicketDetails());


        System.out.println("-------TOURIST TICKET---------");
        TouristTicket touristTicket = new TouristTicket("TOURIST-197","bangalore","Mumbai","21-12-20 10:30:54","22-12-20 11:30:54",false,flight,passenger);
        System.out.println(touristTicket.getTicketDetails());
        System.out.println("----ADDING LOCATION-----");
        touristTicket.getSelectedTouristLocation();
        System.out.println("-------PNR NUMBER---------");
        printTicketDetails(regularTicket);
        printTicketDetails(touristTicket);

    }
    public static void printTicketDetails(Ticket ticket){
        System.out.println(ticket.getPnrNum());
    }
}
