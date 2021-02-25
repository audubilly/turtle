package AirLineReservationSystem;

import java.util.InputMismatchException;

public class AirlineSystem {

    private boolean [] seats;
    private String boardingPass;
    private BoardingPass boardingPassForAirline ;

    private  int firstClassSeatMonitor = 0;
    private int economyClassSeatMonitor = 0;

    public AirlineSystem() {
        seats = new boolean[10];
        boardingPassForAirline = new BoardingPass("lagos", "Abuja",
                "2021-11-12", "2021-11-12", "7am");
    }

    public void setBoardingPassForAirline(String departureCity,String arrivalCity,String departureDate, String arrivalDate, String departureTime) {
        boardingPassForAirline =new BoardingPass(departureCity,arrivalCity,departureDate,arrivalDate,departureTime);
    }

    public boolean[] getSeats() {
        try {
            return seats;
        } catch (ArrayIndexOutOfBoundsException exception) {
            System.out.println("Invalid seat number");
        }
        return null;
    }

    public String getBoardingPass(){
        return boardingPass;
    }
    public void bookSeats(FlightTypes flightTypes, Passenger passenger) {
        try{switch (flightTypes){
            case FIRSTCLASS -> bookFirstClassSeats(passenger);
            case ECONOMY -> bookEconomySeats(passenger);
        }}catch (InputMismatchException exception){
            System.err.println("invalid input");
        }
    }

    private void bookEconomySeats(Passenger passenger) {
        for(int counter =5; seats.length > counter; counter++){
            if (seats[counter]==false){
                seats[counter] = true;
                economyBoardingPassPrinter(counter,passenger);
                economyClassSeatMonitor++;
                break;
            }
        }
       if(economyClassSeatMonitor==4){
           checkFirstClassSeatsForAvailability();
       }
    }

    private void checkFirstClassSeatsForAvailability() {
        if(firstClassSeatMonitor < 5){
            System.out.println("Economy Class seats are full, would you like to book a first class seat? ");
        }
    }

    private void economyBoardingPassPrinter(int counter, Passenger passenger) {
        counter = counter + 1;
        boardingPass = passenger.toString() + boardingPassForAirline.toString()+"\n Your Economy class seat has being " +
                "booked and your seat number is "+counter;

    }


    private void bookFirstClassSeats(Passenger passenger) {
        for(int counter = 0; counter < 5; counter++){
            if(!seats[counter]){
                seats[counter] = true;
                firstClassBoardingPassPrinter(counter,passenger);
                firstClassSeatMonitor++;
                break;
            }
        }
        if(firstClassSeatMonitor==4){
            checkEconomyClassSeatsForAvailability();
        }
    }

    private void checkEconomyClassSeatsForAvailability() {
        if (economyClassSeatMonitor < 5) {
            System.out.println("First class seats are full, do you want to book an Economy class seat? ");
        }
    }

    private void firstClassBoardingPassPrinter(int counter, Passenger passenger) {
        counter = counter + 1;
        boardingPass = passenger.toString() + boardingPassForAirline.toString() + "\n Your First Class seat has being booked" +
                " and Your seat number is " + counter;
    }

    public boolean getSeatsBySeatNumber(int number) {
        try {
            return getSeats()[number];
        } catch (ArrayIndexOutOfBoundsException exception) {
            throw new FlightSeatsDoesNotExists("Flight seat does not exists");
        }
    }
    public static class FlightSeatsDoesNotExists extends ArrayIndexOutOfBoundsException{
        public FlightSeatsDoesNotExists(String message){
            super(message);
        }

    }
}
