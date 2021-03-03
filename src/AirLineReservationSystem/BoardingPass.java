package AirLineReservationSystem;

public class BoardingPass {
    private String departureCity;
    private String arrivalCity;
    private String departureDate;
    private String arrivalDate;
    private String departureTime;

    public BoardingPass(String departureCity, String arrivalCity, String departureDate,
                        String arrivalDate, String departureTime) {
        this.departureCity = departureCity;
        this.arrivalCity = arrivalCity;
        this.departureDate = departureDate;
        this.arrivalDate = arrivalDate;
        this.departureTime = departureTime;
    }

    public String getDepartureCity() {
        return departureCity;
    }

    public void setDepartureCity(String departureCity) {
        this.departureCity = departureCity;
    }

    public String getArrivalCity() {
        return arrivalCity;
    }

    public void setArrivalCity(String arrivalCity) {
        this.arrivalCity = arrivalCity;
    }

    public String getDepartureDate() {
        return departureDate;
    }

    public void setDepartureDate(String departureDate) {
        this.departureDate = departureDate;
    }

    public String getArrivalDate() {
        return arrivalDate;
    }

    public void setArrivalDate(String arrivalDate) {
        this.arrivalDate = arrivalDate;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }

    @Override
    public String toString() {
        return String.format("%nDeparture City : %s%n Arrival city: %s%n Departure Date : " +
                        "%s%n Arrival Date: %s%n Departure Time: %s", getDepartureCity(),getArrivalCity(),
                getDepartureDate(),getArrivalDate(), getDepartureTime());
    }
}
