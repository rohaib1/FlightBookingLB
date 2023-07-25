import java.util.Scanner;

public class Runner {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BookingSystem bookingSystem = new BookingSystem();
        Flight flight1 = new Flight("Madrid", "EZY2677");
        Flight flight2 = new Flight("Budapest", "TUI9917");
        Flight flight3 = new Flight("Oslo", "BA1944");
        Flight flight4 = new Flight("Taipei", "EK8251");
        Flight flight5 = new Flight("Doha", "QR0017");
        bookingSystem.addFlight(flight1);
        bookingSystem.addFlight(flight2);
        bookingSystem.addFlight(flight3);
        bookingSystem.addFlight(flight4);
        bookingSystem.addFlight(flight5);

        System.out.println("Welcome to flight booking system");
        System.out.println("Please enter passenger name:");
        String passengerName = scanner.nextLine();

        System.out.println("Please enter passenger email:");
        String passengerEmail = scanner.nextLine();

        Passenger passenger = new Passenger(passengerName, passengerEmail);
        bookingSystem.addPassenger(passenger);

        System.out.println("Current flights:");
        for (String flightInfo: bookingSystem.displayFlight()){
            System.out.println(flightInfo);
        }

        System.out.println("Which destination would you like to fly to?");
        // user chosen city:
        String destination = scanner.nextLine();

        for (Flight flight: bookingSystem.getFlights()){
            if (destination.equals(flight.getDestination())){
                flight.bookPassenger(passenger);
                System.out.println("You have booked a flight to " + destination);
            }
        }

        System.out.println("Your name is " + passengerName);
        System.out.println("You are going to " + destination);

        System.out.println("Would you like to cancel your flight? (y/n)");
        String answer = scanner.nextLine();

        if (answer.equals("y")){
            bookingSystem.removePassenger(passenger);
            System.out.println("You have cancelled your flight to " + destination);
        } else {
            System.out.println("Booking confirmed!");
        }


    }
}
