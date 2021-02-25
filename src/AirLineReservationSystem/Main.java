package AirLineReservationSystem;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Passenger passenger = null;
        AirlineSystem airlineSystem= new AirlineSystem();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 1 to input details.\n" +
                "Enter 2 to book flight.\n" +
                "Enter 3 to print Boarding Pass.\n" +
                "Enter 4 to quit.");
        int number = scanner.nextInt();
        while(number != 4){
            switch (number){
                case 1:
                    System.out.println("Enter firstName");
                    String firstName=scanner.next();
                    System.out.println("Enter lastName");
                    String lastName=scanner.next();
                    passenger=new Passenger(firstName,lastName);
                    break;
                case 2:
                    System.out.println("Enter the class you would like to book type in either " +
                            "Economy or FirstClass ");
                    FlightTypes flightTypes = null;
                    String flightClass= scanner.next();
                    flightClass=flightClass.toLowerCase();
                    switch (flightClass){
                        case "firstclass": flightTypes=FlightTypes.FIRSTCLASS;
                        break;
                        case "economy": flightTypes=FlightTypes.ECONOMY;
                        break;
                        default:
                    }
                    System.out.println("Enter DepartureCity");
                    String departureCity = scanner.next();
                    System.out.println("Enter Arrival City");
                    String arrivalCity = scanner.next();
                    System.out.println("Enter Departure Date ");
                    String departureDate = scanner.next();
                    System.out.println("Enter Arrival Date ");
                    String arrivalDate = scanner.next();
                    System.out.println("Enter Departure Time");
                    String departureTime = scanner.next();
                    airlineSystem.setBoardingPassForAirline(departureCity,arrivalCity,departureDate,arrivalDate,departureTime);
                     airlineSystem.bookSeats(flightTypes,passenger);

                case 3:
                    System.out.println(airlineSystem.getBoardingPass());
                default:

            }
            System.out.println("Enter 1 to input details.\n" +
                    "Enter 2 to book flight.\n" +
                    "Enter 3 to print Boarding Pass." +
                    "Enter 4 to quit.");
            number = scanner.nextInt();


        }
        System.out.println("Exiting!!!");
    }
}
