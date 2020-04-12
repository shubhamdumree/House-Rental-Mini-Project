package com.company;

class Accommodation {

     //Data Members
    //instance variables

        int accommodation_id;
        String type_of_accommodation;
        String owner;
        int telephone_number;
        double cost;
        String location;
        String booking_status;

        public Accommodation() {   //default constructor

            accommodation_id = 0;
            type_of_accommodation = "";
            owner = "";
            telephone_number = 0;
            cost = 0;
            location = "";
            booking_status = "";

        }

        public Accommodation(int acc_id, String acc, String own, int tel, double ct, String loc, String book){       //constructor 2

            accommodation_id = acc_id;
            type_of_accommodation = acc;
            owner = own;
            telephone_number = tel;
            cost = ct;
            location = loc;
            booking_status = book;

        }

        public void get_all_accommodation() {     // to print all the details of the accommodation

            System.out.println("       ________________       ");
            System.out.println("Accommodation ID : " + accommodation_id);
            System.out.println("Type Of Accommodation : " + type_of_accommodation);
            System.out.println("Owner Of This Accommodation : " + owner);
            System.out.println("Contact Details Of Owner : " + telephone_number);
            System.out.println("Monthly Rent : " + cost);
            System.out.println("Location Of " + type_of_accommodation + ": " + location);
            System.out.println("Booking Status : " + booking_status);
            System.out.println("       ________________       ");

        }  // end of get_all_accommodation

}  // end of Accommodation class


