import org.junit.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public
class BookingTest {

    @Test

    public void canDisplayFlight(){
        BookingSystem bookingSystem = new BookingSystem();
        Flight flight1 = new Flight("London", "EZY0001");
        Flight flight2 = new Flight("Cardiff","EZY8654");

        bookingSystem.addFlight(flight1);
        bookingSystem.addFlight(flight2);

        //System.out.println(bookingSystem.displayFlight());

       // assertThat(bookingSystem.displayFlight()).isEqualTo(["Destination: London Flight number: EZY0001" , "Destination: Cardiff Flight number: EZY8654"]);
    }
}
