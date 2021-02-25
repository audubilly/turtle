package AirLineReservationSystem;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AirlineSystemTest {

    AirlineSystem airlineSystem;
    Passenger passenger;
    BoardingPass boardingPass;


    @BeforeEach
    void setUp() {
        airlineSystem = new AirlineSystem();
        passenger = new Passenger("Billy", "Audu");
        boardingPass = new BoardingPass("lagos", "Abuja",
                "2021-11-12", "2021-11-12", "7am");

    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void testThatAirlineHasSeatsOnBoard() {
        boolean[] seats = new boolean[10];
        assertArrayEquals(seats, airlineSystem.getSeats());

        assertEquals(seats.length, airlineSystem.getSeats().length);
    }

    @Test
    void testThatASeatCanBeBooked() {
        airlineSystem.bookSeats(FlightTypes.FIRSTCLASS, passenger);
        assertTrue(airlineSystem.getSeats()[0]);
        airlineSystem.bookSeats(FlightTypes.FIRSTCLASS, passenger);
        assertTrue(airlineSystem.getSeats()[1]);
        airlineSystem.bookSeats(FlightTypes.FIRSTCLASS, passenger);
        assertTrue(airlineSystem.getSeats()[2]);

        airlineSystem.bookSeats(FlightTypes.ECONOMY, passenger);
        assertTrue(airlineSystem.getSeats()[5]);

        airlineSystem.bookSeats(FlightTypes.ECONOMY, passenger);
        assertTrue(airlineSystem.getSeats()[6]);

    }

    @Test
    void testThatPassengerDetailsCanBeGotten() {
        passenger.setFirstName("Billy");
        assertEquals("Billy", passenger.getFirstName());

        passenger.setLastName("Audu");
        assertEquals("Audu", passenger.getLastName());

    }

    @Test
    void testThatBoardingPassCanBeGotten() {
        boardingPass.setDepartureCity("lagos");
        assertEquals("lagos", boardingPass.getDepartureCity());

        boardingPass.setArrivalCity("Abuja");
        assertEquals("Abuja", boardingPass.getArrivalCity());

        boardingPass.setDepartureTime("7am");
        assertEquals("7am", boardingPass.getDepartureTime());

        boardingPass.setDepartureDate("2021-12-11");
        assertEquals("2021-12-11",boardingPass.getDepartureDate());

        boardingPass.setArrivalDate("2021-12-11");
        assertEquals("2021-12-11",boardingPass.getArrivalDate());

        System.out.println(passenger.toString() + boardingPass.toString());
    }

    @Test
    void testThatWeCanCreatePassengersAndBookSeats(){

        passenger = new Passenger("john", "Wick");

        airlineSystem.bookSeats(FlightTypes.ECONOMY,passenger);
        System.out.println(airlineSystem.getBoardingPass());

        airlineSystem.bookSeats(FlightTypes.FIRSTCLASS,passenger);
        System.out.println(airlineSystem.getBoardingPass());

    }
    @Test
    void testThatFlightSeatsCanBeAlternatedFromEconomyToFirstClassWhenFull(){
        airlineSystem.bookSeats(FlightTypes.ECONOMY,passenger);
        airlineSystem.bookSeats(FlightTypes.ECONOMY,passenger);
        airlineSystem.bookSeats(FlightTypes.ECONOMY,passenger);
        airlineSystem.bookSeats(FlightTypes.ECONOMY,passenger);
        airlineSystem.bookSeats(FlightTypes.ECONOMY,passenger);
        airlineSystem.bookSeats(FlightTypes.ECONOMY,passenger);

    }

    @Test
    void testThatFlightSeatsCanBeAlternatedWhenFromFirstClassToEconomyClassFull(){
        airlineSystem.bookSeats(FlightTypes.FIRSTCLASS,passenger);
        airlineSystem.bookSeats(FlightTypes.FIRSTCLASS,passenger);
        airlineSystem.bookSeats(FlightTypes.FIRSTCLASS,passenger);
        airlineSystem.bookSeats(FlightTypes.FIRSTCLASS,passenger);
        airlineSystem.bookSeats(FlightTypes.FIRSTCLASS,passenger);
        airlineSystem.bookSeats(FlightTypes.FIRSTCLASS,passenger);

    }

    @Test
    void testThatExceptionsAreThrown(){
        assertThrows(AirlineSystem.FlightSeatsDoesNotExists.class,()->airlineSystem.getSeatsBySeatNumber(11));
    }
}