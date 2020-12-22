package com.company;

public class Passenger {

    private static int idCounter = 0;
    private int id;


    private static class Address{
        String street;
        String city;
        String state;

        public Address(String street, String city, String state) {
            this.street = street;
            this.city = city;
            this.state = state;
        }

        public String toString() {
            return "Address{" +
                    "street='" + street + '\'' +
                    ", city='" + city + '\'' +
                    ", state='" + state + '\'' +
                    '}';
        }
    }
    private static class Contact{
        String name;
        String email;
        String phone;

        public Contact(String name, String email, String phone) {
            this.name = name;
            this.email = email;
            this.phone = phone;
        }


        public String toString() {
            return "Contact{" +
                    "name='" + name + '\'' +
                    ", email='" + email + '\'' +
                    ", phone='" + phone + '\'' +
                    '}';
        }
    }

    private Contact contact;
    private Address address;


    public Passenger(String street, String city, String state, String name, String email, String phone){
        this.id = ++idCounter;
        this.address = new Address(street,city,state);
        this.contact = new Contact(name,email,phone);

    }
    public int getId(){
        return this.id;
    }

    public String getAddressDetails(){
        return "Street : " + address.street + "City : " + address.city + "State : " + address.state ;
    }

    public String getContactDetails(){
        return "Name : " + contact.name + "Phone : " + contact.phone + "Email : " + contact.email ;
    }
    public static int getPassengerCount(){
        return idCounter;

    }

    public static void setIdCounter(int idCounter) {
        Passenger.idCounter = idCounter;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setContact(Contact contact) {
        this.contact = contact;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String toString() {
        return "Passenger{" +
                "id=" + id +
                ", contact=" + contact +
                ", address=" + address +
                '}';
    }
}
