package com.company;

import javax.swing.JOptionPane;
import java.util.Scanner;
import javax.swing.ImageIcon;  // Importing a logo at the start of the program 

public class Main {

    public static void main(String[] args) {

        welcome_message();      // welcome method

        Accommodation accommodation1 = new Accommodation(123,"Flat", "Mr. John Smith", 230576374, 7000.50, "Flacq", "Available");  // creating an accommodation object
        Accommodation accommodation2 = new Accommodation(345,"House", "Mr. Lewis Hand", 230578761, 5000.00, "Curepipe", "Available");
        Accommodation accommodation3 = new Accommodation(567,"Room", "Mr. Paul O'Connor", 230576375, 3500.50, "Port-Louis", "Not Available");
        Accommodation accommodation4 = new Accommodation(789,"Shared Room", "Mrs. Pauline", 230576398, 1000.00, "Curepipe", "Available");
        Accommodation accommodation5 = new Accommodation(987,"Flat", "Mrs. Helene Petitprez", 230576367, 6000.99, "Tamarin", "Not Available");
        Accommodation accommodation6 = new Accommodation(765,"Flat", "Mr. Frederic Daury", 230575474, 5999.99, "Rose Hill", "Available");
        Accommodation accommodation7 = new Accommodation(543,"House", "Mrs. Sara Kennedy", 230579804, 5000.50, "Flacq", "Available");
        Accommodation accommodation8 = new Accommodation(321,"Flat", "Mr. Georgie Wilson", 230567378, 10000.00, "Flic-en-Flac", "Not Available");
        Accommodation accommodation9 = new Accommodation(112,"Room", "Mrs. Lara Muroya", 230598770, 4500.50, "Grand-Baie", "Available");
        Accommodation accommodation10 = new Accommodation(556,"Flat", "Mrs. Omar Mallik", 230576985, 20000.00, "Mahebourg", "Available");

        Customer customer1 = new Customer();    // creating a customer object

        Scanner input = new Scanner(System.in);   // constructing a scanner object

        int choice;    // variable declaration
        int option;    // variable declaration

        double user_fees = 0;

        // printing the menu
        System.out.println("1. Enter customer details");
        System.out.println("2. View all the accommodations");
        System.out.println("3. Choose your accommodation");
        System.out.println("4. Search");
        System.out.println("5. Exit the application");

        do {  // validation for wrong input

            boolean valid_input = false;
            do {

                System.out.print("\nEnter your choice : ");
                while (!input.hasNextInt()) {
                    String temp = input.next();
                    System.out.print("Invalid input, please enter a number : ");
                }
                choice = input.nextInt();
                valid_input = true;

            } while (!valid_input);


        switch(choice) {

            case 1 :

                System.out.println("\nEnter your details below :- \n");

                customer1 = customer_details(customer1);
                customer1.get_customer_details();   // print the user's input

                System.out.println("\nYou can now view, choose or search the type of accommodation you want!");

                break;

            case 2 :
                // printing all the accommodation
                accommodation1.get_all_accommodation();
                accommodation2.get_all_accommodation();
                accommodation3.get_all_accommodation();
                accommodation4.get_all_accommodation();
                accommodation5.get_all_accommodation();
                accommodation6.get_all_accommodation();
                accommodation7.get_all_accommodation();
                accommodation8.get_all_accommodation();
                accommodation9.get_all_accommodation();
                accommodation10.get_all_accommodation();

                break;

            case 3 :

                System.out.print("Please enter the ID of the accommodation you want to book : ");
                int id = input.nextInt();

                // print the accommodation that corresponds to the accommodation ID that the user has input and checking if it is available or not
                if (id == accommodation1.accommodation_id && accommodation1.booking_status.equalsIgnoreCase("Available")) {
                    accommodation1.get_all_accommodation();
                    valid_input = false;

                    do { // checking for validation

                        System.out.print("\nEnter the amount of deposit you want to pay : ");
                        while (!input.hasNextInt() || input.hasNext("0"))  {
                            String temp = input.next();
                            System.out.print("Invalid input, please enter a number : ");
                        }
                        user_fees = input.nextDouble();
                        valid_input = true;

                        if (user_fees < 0){
                            System.out.println("Negative number not allowed.");
                        }

                        else {

                            double deposit = 0;
                            deposit = accommodation1.cost - user_fees;

                            if (deposit < 0) {
                                System.out.println("Paid successfully!");
                                System.out.println("Your debit amount : " + Math.abs(deposit)); // give the absolute value of the integer
                            }

                            else if (deposit > 0) {
                                System.out.println("Paid successfully!");
                                System.out.println("Amount you are left to pay is : " + deposit);
                            }
                        }

                    } while (!valid_input);

                    System.out.println("\nCongratulations Mr. " + customer1.firstName + " for having successfully booked your accommodation.");
                }

                else if (id == accommodation2.accommodation_id && accommodation2.booking_status.equalsIgnoreCase("Available")) {
                    accommodation2.get_all_accommodation();
                    valid_input = false;

                    do { // checking for validation

                        System.out.print("\nEnter the amount of deposit you want to pay : ");
                        while (!input.hasNextInt() || input.hasNext("0"))  {
                            String temp = input.next();
                            System.out.print("Invalid input, please enter a number : ");
                        }
                        user_fees = input.nextDouble();
                        valid_input = true;

                        if (user_fees < 0){
                            System.out.println("Negative number not allowed.");
                        }

                        else {

                            double deposit = 0;
                            deposit = accommodation2.cost - user_fees;

                            if (deposit < 0) {
                                System.out.println("Paid successfully!");
                                System.out.println("Your debit amount : " + Math.abs(deposit)); // give the absolute value of the integer
                            }

                            else if (deposit > 0) {
                                System.out.println("Paid successfully!");
                                System.out.println("Amount you are left to pay is : " + deposit);
                            }
                        }

                    } while (!valid_input);

                    System.out.println("\nCongratulations Mr. " + customer1.firstName + " for having successfully booked your accommodation.");
                }

                else if (id == accommodation3.accommodation_id && accommodation3.booking_status.equalsIgnoreCase("Available")) {
                    accommodation3.get_all_accommodation();
                    valid_input = false;

                    do {  // checking for validation

                        System.out.print("\nEnter the amount of deposit you want to pay : ");
                        while (!input.hasNextInt() || input.hasNext("0"))  {
                            String temp = input.next();
                            System.out.print("Invalid input, please enter a number : ");
                        }
                        user_fees = input.nextDouble();
                        valid_input = true;

                        if (user_fees < 0){
                            System.out.println("Negative number not allowed.");
                        }

                        else {

                            double deposit = 0;
                            deposit = accommodation3.cost - user_fees;

                            if (deposit < 0) {
                                System.out.println("Paid successfully!");
                                System.out.println("Your debit amount : " + Math.abs(deposit)); // give the absolute value of the integer
                            }

                            else if (deposit > 0) {
                                System.out.println("Paid successfully!");
                                System.out.println("Amount you are left to pay is : " + deposit);
                            }
                        }

                    } while (!valid_input);

                    System.out.println("\nCongratulations Mr. " + customer1.firstName + " for having successfully booked your accommodation.");
                }

                else if (id == accommodation4.accommodation_id && accommodation4.booking_status.equalsIgnoreCase("Available")) {
                    accommodation4.get_all_accommodation();
                    valid_input = false;

                    do {   // checking for validation

                        System.out.print("\nEnter the amount of deposit you want to pay : ");
                        while (!input.hasNextInt() || input.hasNext("0"))  {
                            String temp = input.next();
                            System.out.print("Invalid input, please enter a number : ");
                        }
                        user_fees = input.nextDouble();
                        valid_input = true;

                        if (user_fees < 0){
                            System.out.println("Negative number not allowed.");
                        }

                        else {

                        double deposit = 0;
                        deposit = accommodation4.cost - user_fees;

                        if (deposit < 0) {
                            System.out.println("Paid successfully!");
                            System.out.println("Your debit amount : " + Math.abs(deposit)); // give the absolute value of the integer
                            }

                        else if (deposit > 0) {
                            System.out.println("Paid successfully!");
                            System.out.println("Amount you are left to pay is : " + deposit);
                        }
                        }

                    } while (!valid_input);

                    System.out.println("\nCongratulations Mr. " + customer1.firstName + " for having successfully booked your accommodation.");
                }

                else if (id == accommodation5.accommodation_id && accommodation5.booking_status.equalsIgnoreCase("Available")) {
                    accommodation5.get_all_accommodation();
                    valid_input = false;

                    do {   // checking for validation

                        System.out.print("\nEnter the amount of deposit you want to pay : ");
                        while (!input.hasNextInt() || input.hasNext("0"))  {
                            String temp = input.next();
                            System.out.print("Invalid input, please enter a number : ");
                        }
                        user_fees = input.nextDouble();
                        valid_input = true;

                        if (user_fees < 0){
                            System.out.println("Negative number not allowed.");
                        }

                        else {

                            double deposit = 0;
                            deposit = accommodation5.cost - user_fees;

                            if (deposit < 0) {
                                System.out.println("Paid successfully!");
                                System.out.println("Your debit amount : " + Math.abs(deposit)); // give the absolute value of the integer
                            }

                            else if (deposit > 0) {
                                System.out.println("Paid successfully!");
                                System.out.println("Amount you are left to pay is : " + deposit);
                            }
                        }

                    } while (!valid_input);

                    System.out.println("\nCongratulations Mr. " + customer1.firstName + " for having successfully booked your accommodation.");
                }

                else if (id == accommodation6.accommodation_id && accommodation6.booking_status.equalsIgnoreCase("Available")) {
                    accommodation6.get_all_accommodation();
                    valid_input = false;

                    do {   // checking for validation

                        System.out.print("\nEnter the amount of deposit you want to pay : ");
                        while (!input.hasNextInt() || input.hasNext("0"))  {
                            String temp = input.next();
                            System.out.print("Invalid input, please enter a number : ");
                        }
                        user_fees = input.nextDouble();
                        valid_input = true;

                        if (user_fees < 0){
                            System.out.println("Negative number not allowed.");
                        }

                        else {

                            double deposit = 0;
                            deposit = accommodation6.cost - user_fees;

                            if (deposit < 0) {
                                System.out.println("Paid successfully!");
                                System.out.println("Your debit amount : " + Math.abs(deposit)); // give the absolute value of the integer
                            }

                            else if (deposit > 0) {
                                System.out.println("Paid successfully!");
                                System.out.println("Amount you are left to pay is : " + deposit);
                            }
                        }

                    } while (!valid_input);

                    System.out.println("\nCongratulations Mr. " + customer1.firstName + " for having successfully booked your accommodation.");
                }

                else if (id == accommodation7.accommodation_id && accommodation7.booking_status.equalsIgnoreCase("Available")) {
                    accommodation7.get_all_accommodation();
                    valid_input = false;

                    do {  // checking for validation

                        System.out.print("\nEnter the amount of deposit you want to pay : ");
                        while (!input.hasNextInt() || input.hasNext("0"))  {
                            String temp = input.next();
                            System.out.print("Invalid input, please enter a number : ");
                        }
                        user_fees = input.nextDouble();
                        valid_input = true;

                        if (user_fees < 0){
                            System.out.println("Negative number not allowed.");
                        }

                        else {

                            double deposit = 0;
                            deposit = accommodation7.cost - user_fees;

                            if (deposit < 0) {
                                System.out.println("Paid successfully!");
                                System.out.println("Your debit amount : " + Math.abs(deposit)); // give the absolute value of the integer
                            }

                            else if (deposit > 0) {
                                System.out.println("Paid successfully!");
                                System.out.println("Amount you are left to pay is : " + deposit);
                            }
                        }

                    } while (!valid_input);

                    System.out.println("\nCongratulations Mr. " + customer1.firstName + " for having successfully booked your accommodation.");
                }

                else if (id == accommodation8.accommodation_id && accommodation8.booking_status.equalsIgnoreCase("Available")) {
                    accommodation8.get_all_accommodation();
                    valid_input = false;

                    do {  // checking for validation

                        System.out.print("\nEnter the amount of deposit you want to pay : ");
                        while (!input.hasNextInt() || input.hasNext("0"))  {
                            String temp = input.next();
                            System.out.print("Invalid input, please enter a number : ");
                        }
                        user_fees = input.nextDouble();
                        valid_input = true;

                        if (user_fees < 0){
                            System.out.println("Negative number not allowed.");
                        }

                        else {

                            double deposit = 0;
                            deposit = accommodation8.cost - user_fees;

                            if (deposit < 0) {
                                System.out.println("Paid successfully!");
                                System.out.println("Your debit amount : " + Math.abs(deposit)); // give the absolute value of the integer
                            }

                            else if (deposit > 0) {
                                System.out.println("Paid successfully!");
                                System.out.println("Amount you are left to pay is : " + deposit);
                            }
                        }

                    } while (!valid_input);

                    System.out.println("\nCongratulations Mr. " + customer1.firstName + " for having successfully booked your accommodation.");
                }

                else if (id == accommodation9.accommodation_id && accommodation9.booking_status.equalsIgnoreCase("Available")) {
                    accommodation9.get_all_accommodation();
                    valid_input = false;

                    do {  // checking for validation

                        System.out.print("\nEnter the amount of deposit you want to pay : ");
                        while (!input.hasNextInt() || input.hasNext("0"))  {
                            String temp = input.next();
                            System.out.print("Invalid input, please enter a number : ");
                        }
                        user_fees = input.nextDouble();
                        valid_input = true;

                        if (user_fees < 0){
                            System.out.println("Negative number not allowed.");
                        }

                        else {

                            double deposit = 0;
                            deposit = accommodation9.cost - user_fees;

                            if (deposit < 0) {
                                System.out.println("Paid successfully!");
                                System.out.println("Your debit amount : " + Math.abs(deposit)); // give the absolute value of the integer
                            }

                            else if (deposit > 0) {
                                System.out.println("Paid successfully!");
                                System.out.println("Amount you are left to pay is : " + deposit);
                            }
                        }

                    } while (!valid_input);
                    System.out.println("\nCongratulations Mr. " + customer1.firstName + " for having successfully booked your accommodation.");
                }

                else if (id == accommodation10.accommodation_id && accommodation10.booking_status.equalsIgnoreCase("Available")) {
                    accommodation10.get_all_accommodation();
                    valid_input = false;

                    do {   // checking for validation

                        System.out.print("\nEnter the amount of deposit you want to pay : ");
                        while (!input.hasNextInt() || input.hasNext("0"))  {
                            String temp = input.next();
                            System.out.print("Invalid input, please enter a number : ");
                        }
                        user_fees = input.nextDouble();
                        valid_input = true;

                        if (user_fees < 0){
                            System.out.println("Negative number not allowed.");
                        }

                        else {

                            double deposit = 0;
                            deposit = accommodation10.cost - user_fees;  // calculating the amount left

                            if (deposit < 0) {
                                System.out.println("Paid successfully!");
                                System.out.println("Your debit amount : " + Math.abs(deposit)); // give the absolute value of the integer
                            }

                            else if (deposit > 0) {
                                System.out.println("Paid successfully!");
                                System.out.println("Amount you are left to pay is : " + deposit);
                            }
                        }

                    } while (!valid_input);

                    System.out.println("\nCongratulations Mr. " + customer1.firstName + " for having successfully booked your accommodation.");
                }

                else {
                    System.out.println("Sorry, the accommodation is already booked");
                }

                break;

            case 4 :

                do { // checking for validation

                    System.out.println("\nSearch by :- \n\n1. Price range \n2. Availability");
                    System.out.print("\nOption : ");
                    while (!input.hasNextInt())  {
                        String temp = input.next();
                        System.out.print("Invalid input, please enter a number : ");
                    }
                    option = input.nextInt();
                    valid_input = true;

                } while (!valid_input);
                    
                    switch (option) {

                        case 1 :  // searching by a price range

                            System.out.println("Search accommodation by price range :");

                            System.out.print("Enter Minimum price : ");  // user gets to enter the minimum price for the accommodation
                            double lower = input.nextDouble();

                            System.out.print("Enter Maximum price : ");  // user gets to enter the maximum price for the accommodation
                            double upper = input.nextDouble();
                            boolean found = false;

                            if (accommodation1.cost >= lower && accommodation1.cost <= upper) {
                                System.out.println("Result found!");
                                accommodation1.get_all_accommodation();
                                found = true;  // checking if the output is true or not
                            }

                            if (accommodation2.cost >= lower && accommodation2.cost <= upper) {
                                System.out.println("Result found!");
                                accommodation2.get_all_accommodation();
                                found = true;
                            }

                            if (accommodation3.cost >= lower && accommodation3.cost <= upper) {
                                System.out.println("Result found!");
                                accommodation3.get_all_accommodation();
                                found = true;
                            }

                            if (accommodation4.cost >= lower && accommodation4.cost <= upper) {
                                System.out.println("Result found!");
                                accommodation4.get_all_accommodation();
                                found = true;
                            }

                            if (accommodation5.cost >= lower && accommodation5.cost <= upper) {
                                System.out.println("Result found!");
                                accommodation5.get_all_accommodation();
                                found = true;
                            }

                            if (accommodation6.cost >= lower && accommodation6.cost <= upper) {
                                System.out.println("Result found!");
                                accommodation6.get_all_accommodation();
                                found = true;
                            }

                            if (accommodation7.cost >= lower && accommodation7.cost <= upper) {
                                System.out.println("Result found!");
                                accommodation7.get_all_accommodation();
                                found = true;
                            }

                            if (accommodation8.cost >= lower && accommodation8.cost <= upper) {
                                System.out.println("Result found!");
                                accommodation8.get_all_accommodation();
                                found = true;

                            }

                            if (accommodation9.cost >= lower && accommodation9.cost <= upper) {
                                System.out.println("Result found!");
                                accommodation9.get_all_accommodation();
                                found = true;
                            }

                            if (accommodation10.cost >= lower && accommodation10.cost <= upper) {
                                System.out.println("Result found!");
                                accommodation10.get_all_accommodation();
                                found = true;
                            }

                            if (!found) {
                                System.out.println("No result found");
                            }

                            break;

                        case 2 :   // searching if the accommodation is available

                            System.out.print("Search accommodation by availability : ");
                            String response = input.next();
                            Boolean found_available = false;

                            if (accommodation1.booking_status == "Available") {
                                System.out.println("Result found");
                                accommodation1.get_all_accommodation();
                                found_available = true;
                            }

                            if (accommodation2.booking_status == "Available") {
                                System.out.println("Result found");
                                accommodation2.get_all_accommodation();
                                found_available = true;
                            }

                            if (accommodation3.booking_status == "Available") {
                                System.out.println("Result found");
                                accommodation3.get_all_accommodation();
                                found_available = true;
                            }

                            if (accommodation4.booking_status == "Available") {
                                System.out.println("Result found");
                                accommodation4.get_all_accommodation();
                                found_available = true;
                            }

                            if (accommodation5.booking_status == "Available") {
                                System.out.println("Result found");
                                accommodation5.get_all_accommodation();
                                found_available = true;
                            }

                            if (accommodation6.booking_status == "Available") {
                                System.out.println("Result found");
                                accommodation6.get_all_accommodation();
                                found_available = true;
                            }

                            if (accommodation7.booking_status == "Available") {
                                System.out.println("Result found");
                                accommodation7.get_all_accommodation();
                                found_available = true;
                            }

                            if (accommodation8.booking_status == "Available") {
                                System.out.println("Result found");
                                accommodation8.get_all_accommodation();
                                found_available = true;
                            }

                            if (accommodation9.booking_status == "Available") {
                                System.out.println("Result found");
                                accommodation9.get_all_accommodation();
                                found_available = true;
                            }

                            if (accommodation10.booking_status == "Available") {
                                System.out.println("Result found");
                                accommodation10.get_all_accommodation();
                                found_available = true;
                            }

                            if (!found_available) {
                                System.out.println("Sorry, no result found");
                            }

                            break;

                        default :

                            System.out.println("Invalid selection, please choose option 1 or 2!");

                            break;
                    }

                    break;

            case 5 :

                end_program(); // ends the application or system

                break;

            default :  // this will be printed if the user enters a value outside 1 to 5

                System.out.println("Invalid selection, please try again!");

                break;

        }

    } while (choice != 5);   // end of do & while loop for the menu


    } //end of main method

    public static void welcome_message() {
        ImageIcon iconic = new ImageIcon("House Rental Logo.png"); // calling the image
        JOptionPane.showMessageDialog(null, "Welcome to House Rental System.", "House Rental", JOptionPane.PLAIN_MESSAGE, iconic); // showing the logo at the start

        String Welcome_Message = "\n\nWelcome to House Rental System by Shubham. \nA system where house owners and customers can " +
                "exchange information and book houses effectively! \n\nBelow is the menu of the system.\n";

        System.out.println(Welcome_Message); // printing welcome message

    } // end of welcome_message method

    public static Customer customer_details(Customer customer1) {    // customer method

        int user_input_customer_id = Integer.parseInt(JOptionPane.showInputDialog("Enter your ID number :"));  // user must input his data
        String user_input_first_name = JOptionPane.showInputDialog("Enter your first name :");
        String user_input_surname = JOptionPane.showInputDialog("Enter your surname :");
        String user_input_address = JOptionPane.showInputDialog("Enter your address :");
        int user_input_telephone_number = Integer.parseInt(JOptionPane.showInputDialog("Enter your telephone number : "));
        int user_input_credit_card = Integer.parseInt(JOptionPane.showInputDialog("Enter your credit card number : "));

        customer1 = new Customer(user_input_customer_id, user_input_first_name, user_input_surname, user_input_address,
                user_input_telephone_number, user_input_credit_card);

        return customer1; // returning the value of customer1

    } // end  of customer_details method

    public static void end_program() {

        System.out.println("Thank you for using this application, Goodbye!!");

    } // end of end_program method

} // end of main class
