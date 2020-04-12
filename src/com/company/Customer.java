package com.company;

class Customer {

    // variables declaration // instance variables

    int customerID;
    String firstName;
    String surname;
    String address;
    int credit_card;
    int telephone_number;


    public Customer() {

        customerID = 0;               // default constructor //
        firstName = "Enter your First Name: ";
        surname = "Enter your Surname: ";
        address = "Enter your Address: ";
        credit_card = 0;
        telephone_number = 0;

    }

    public Customer (int user_input_customer_id, String user_input_first_name, String user_input_surname,
                    String user_input_address, int user_input_credit_card, int user_input_telephone_number) {

        customerID = user_input_customer_id;                                // constructor 2 //
        firstName = user_input_first_name;
        surname = user_input_surname;
        address = user_input_address;
        credit_card = user_input_credit_card;
        telephone_number = user_input_telephone_number;

    }

    public void get_customer_details() {  // to print all the details of the customer

        // prints it in a formatted string
        System.out.printf("| %15s %15s %15s %15s %15s %15s",
                "Customer ID : " + customerID + " |", "First Name : " + firstName + " |", "Surname : " + surname + " |", "Address : " + address + " |",
                "Contact Details : " + telephone_number + " |", "Payment Method(credit card number) : " + credit_card + " |\n");

    } //end of get_customer_details method

}  // end of Customer class


