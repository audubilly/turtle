package AirLineReservationSystem;

public class AirlineSystem {

    private boolean [] seats;
    private String boardingPass;
    private BoardingPass boardingPassForAirline =  new BoardingPass("lagos", "Abuja",
            "2021-11-12", "2021-11-12", "7am");

    public AirlineSystem() {
        seats = new boolean[10];
    }

    public boolean[] getSeats() {
        return seats;
    }
    public String getBoardingPass(){
        return boardingPass;
    }
    public void bookSeats(FlightTypes flightTypes, Passenger passenger) {
        switch (flightTypes){
            case FIRSTCLASS -> bookFirstClassSeats(passenger);
            case ECONOMY -> bookEconomySeats(passenger);

        }

    }

    private void bookEconomySeats(Passenger passenger) {
        for(int counter =5; seats.length > counter; counter++){
            if (seats[counter]==false){
                seats[counter] = true;
                economyBoardingPassPrinter(counter,passenger);
                break;
            }
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
                break;
            }
        }
    }

    private void firstClassBoardingPassPrinter(int counter, Passenger passenger) {
        counter = counter + 1;
        boardingPass = passenger.toString() + boardingPassForAirline.toString() + "\n Your First Class seat has being booked" +
                "and Your seat number is " + counter;
    }

}
