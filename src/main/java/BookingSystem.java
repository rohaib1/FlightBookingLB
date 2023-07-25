import java.util.ArrayList;

public class BookingSystem {

    private ArrayList<Flight> flights;
    private ArrayList<Passenger> passengers;

    public BookingSystem(){
        this.flights = new ArrayList<>();
        this.passengers = new ArrayList<>();
    }

    public ArrayList<Flight> getFlights(){
        return flights;
    }

    public void setFlights(ArrayList<Flight> flights){
        this.flights = flights;
    }

    public ArrayList<Passenger> getPassengers(){
        return passengers;
    }

    public void setPassengers(ArrayList<Passenger> passengers){
        this.passengers = passengers;
    }

    public void addFlight(Flight flight){
        this.flights.add(flight);
    }

    public void cancelFlight(Flight flight){
        this.flights.remove(flight);
    }

    public ArrayList<String> displayFlight(){
        ArrayList<String> flightInfo = new ArrayList<>();
        for (Flight flight:flights) {
            flightInfo.add("Destination: " + flight.getDestination() + " | Flight number: " + flight.getFlightNumber());
        }
        return  flightInfo;
    }

    public void addPassenger(Passenger passenger){
        this.passengers.add(passenger);
    }

    public void removePassenger(Passenger passenger){
        this.passengers.remove(passenger);
    }
}
