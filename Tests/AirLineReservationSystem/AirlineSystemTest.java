package AirLineReservationSystem;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AirlineSystemTest {

    AirlineSystem airlineSystem;
    Passenger passenger;

    @BeforeEach
    void setUp() {
        airlineSystem = new AirlineSystem();
        passenger = new Passenger("billy", "Audu");
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void testThatAirlineHasSeatsOnBoard(){
        boolean [] seats = new boolean[10];
        assertArrayEquals(seats, airlineSystem.getSeats());

        assertEquals(seats.length,airlineSystem.getSeats().length);
    }

    @Test
    void testThatASeatCanBeBooked(){
//        airlineSystem.bookSeats(FlightTypes.ECONOMY);
        airlineSystem.bookSeats(FlightTypes.FIRSTCLASS,passenger);
        assertTrue(airlineSystem.getSeats()[0]);
        airlineSystem.bookSeats(FlightTypes.FIRSTCLASS,passenger);
        assertTrue(airlineSystem.getSeats()[1]);
        airlineSystem.bookSeats(FlightTypes.FIRSTCLASS,passenger);
        assertTrue(airlineSystem.getSeats()[2]);

        airlineSystem.bookSeats(FlightTypes.ECONOMY,passenger);
        assertTrue(airlineSystem.getSeats()[5]);

        airlineSystem.bookSeats(FlightTypes.ECONOMY,passenger);
        assertTrue(airlineSystem.getSeats()[6]);

    }

    @Test
    void testThatPassengerDetailsCanBeGotten(){
        passenger.setFirstName("Billy");
        assertEquals("Billy", passenger.getFirstName());

        passenger.setLastName("Audu");
        assertEquals("Audu", passenger.getLastName());
        System.out.println(passenger.toString());
    }
}