package AirLineReservationSystem;

public class AirlineSystem {

    private boolean [] seats;

    public AirlineSystem() {
        seats = new boolean[10];
    }

    public boolean[] getSeats() {
        return seats;
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
                break;
            }
        }
    }

    private void bookFirstClassSeats(Passenger passenger) {
        for(int counter = 0; counter < 5; counter++){
            if(!seats[counter]){
                seats[counter] = true;
                break;
            }
        }
    }
}
