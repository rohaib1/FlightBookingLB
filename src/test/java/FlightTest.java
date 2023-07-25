import org.junit.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class FlightTest {

    @Test
    public void canBookPassenger(){
        Passenger passenger = new Passenger("Rohaib","r12@gmail.com");
        Flight flight = new Flight("Paris","TUI101");
        flight.bookPassenger(passenger);
        assertThat(flight.getPassengers().contains(passenger)).isTrue();
    }



}
