package com.company;

public class Flight {
    private String flightNumber;
    private String airlines;
    private int capacity;
    private int bookedSeats;

    public Flight(String flightNumber, String airlines, int capacity, int bookedSeats) {
        this.flightNumber = flightNumber;
        this.airlines = airlines;
        this.capacity = capacity;
        this.bookedSeats = bookedSeats;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getAirlines() {
        return airlines;
    }

    public void setAirlines(String airlines) {
        this.airlines = airlines;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getBookedSeats() {
        return bookedSeats;
    }

    public void setBookedSeats(int bookedSeats) {
        this.bookedSeats = bookedSeats;
    }

    public void incrementBookingCounter(){
        this.bookedSeats++;
    }

    public boolean checkAvailability(){
        if(this.bookedSeats < capacity)
            return true;
        else
            return false;
    }

    @Override
    public String toString() {
        return "Flight{" +
                "flightNumber='" + flightNumber + '\'' +
                ", airlines='" + airlines + '\'' +
                ", capacity=" + capacity +
                ", bookedSeats=" + bookedSeats +
                '}';
    }
    public String getFlightDetails(){
        return "flightNumber : " + this.getFlightNumber() + "airlines : " + this.getAirlines() + "capacity : " + this.getCapacity() + "bookedSeats :" + this.getBookedSeats();
    }

}
