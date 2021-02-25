package AirLineReservationSystem;

import java.util.Date;

public class BoardingPass {
    private String depatureCity;
    private String arrivalCity;
    private String depatureDate;
    private String arrivalDate;
    private String depatureTime;

    public BoardingPass(String depatureCity, String arrivalCity, String depatureDate,
                        String arrivalDate, String depatureTime) {
        this.depatureCity = depatureCity;
        this.arrivalCity = arrivalCity;
        this.depatureDate = depatureDate;
        this.arrivalDate = arrivalDate;
        this.depatureTime = depatureTime;
    }

    public String getDepatureCity() {
        return depatureCity;
    }

    public void setDepatureCity(String depatureCity) {
        this.depatureCity = depatureCity;
    }

    public String getArrivalCity() {
        return arrivalCity;
    }

    public void setArrivalCity(String arrivalCity) {
        this.arrivalCity = arrivalCity;
    }

    public String getDepatureDate() {
        return depatureDate;
    }

    public void setDepatureDate(String depatureDate) {
        this.depatureDate = depatureDate;
    }

    public String getArrivalDate() {
        return arrivalDate;
    }

    public void setArrivalDate(String arrivalDate) {
        this.arrivalDate = arrivalDate;
    }

    public String getDepatureTime() {
        return depatureTime;
    }

    public void setDepatureTime(String depatureTime) {
        this.depatureTime = depatureTime;
    }

    @Override
    public String toString() {
        return String.format("%nDepature City : %s%n Arrival city: %s%n Departure Date : %s%n Depature Date: %s%n Departure Time: %s", getDepatureCity(),getArrivalCity(),
                getDepatureDate(),getArrivalDate(),getDepatureTime());
    }
}
