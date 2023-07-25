import java.util.ArrayList;

public
class Flight {

    private ArrayList<Passenger> passengers;
    private String destination;
    private String flightNumber;

    public Flight(String destination, String flightNumber){
        this.passengers = new ArrayList<>();
        this.destination = destination;
        this.flightNumber = flightNumber;
    }

    public
    ArrayList<Passenger> getPassengers(){
        return passengers;
    }

    public
    void setPassengers(ArrayList<Passenger> passengers){
        this.passengers = passengers;
    }

    public
    String getDestination(){
        return destination;
    }

    public
    void setDestination(String destination){
        this.destination = destination;
    }

    public
    String getFlightNumber(){
        return flightNumber;
    }

    public
    void setFlightNumber(String flightNumber){
        this.flightNumber = flightNumber;
    }

    public void bookPassenger (Passenger passenger){
        this.passengers.add(passenger);
    }

}
