import java.util.*;
class BusBookingApp {
    private List<Bus> buses;
    private List<Ticket> tickets;
    public BusBookingApp() {
        buses = new ArrayList<>();
        tickets = new ArrayList<>();
    }
    public void addBus(Bus bus) {
        buses.add(bus);
    }
    public void removeBus(Bus bus) {
        buses.remove(bus);
    }
    public List<Bus> searchBuses(SearchCriteria criteria) {
        List<Bus> searchResults = new ArrayList<>();
        
        for (Bus bus : buses) {
            if (bus.getRoute().equals(criteria.getRoute())
                    && bus.getRating() >= criteria.getMinRating()
                    && bus.getTicketPrice() <= criteria.getMaxPrice()) {
                searchResults.add(bus);
            }
        }
        
        return searchResults;
    }
    public Ticket bookTicket(Bus bus, Seat seat, String passengerName) {
        if (seat.isAvailable()) {
            seat.setAvailability(false);
            Ticket ticket = new Ticket(generateTicketNumber(), bus, seat, passengerName);
            tickets.add(ticket);
            return ticket;
        } else {
            return null; // Seat is already booked
        }
    }
    public void cancelTicket(Ticket ticket) {
        if (tickets.contains(ticket)) {
            Seat seat = ticket.getSeat();
            seat.setAvailability(true);
            tickets.remove(ticket);
        }
    }
    private String generateTicketNumber() {
        // Generate and return a unique ticket number
        return "TICKET" + System.currentTimeMillis();
    }
}