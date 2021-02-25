package AirLineReservationSystem;

import java.util.InputMismatchException;

public class Passenger {
    private String firstName;
    private String lastName;

    public Passenger(String firstName, String lastName) {
        try {
            this.firstName = firstName;
            this.lastName = lastName;
        } catch (InputMismatchException exception) {
            System.out.println("invalid input, please Enter Name in words");
        }
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        try {
            this.firstName = firstName;
        } catch (InputMismatchException exception) {
            System.out.println("invalid input, please Enter name in words");
        }
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        try {
            this.lastName = lastName;
        } catch (InputMismatchException exception) {
            System.out.println("invalid input, please Enter name in words");
        }
    }

    @Override
    public String toString() {
        return String.format("Dear %s %s %n BoardingPass Details: ",getFirstName(),getLastName());
    }
}
