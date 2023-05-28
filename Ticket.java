class Ticket {
    private String ticketNumber;
    private Bus bus;
    private Seat seat;
    private String passengerName;
    public Ticket(String ticketNumber, Bus bus, Seat seat, String passengerName) {
        this.ticketNumber = ticketNumber;
        this.bus = bus;
        this.seat = seat;
        this.passengerName = passengerName;
    }
    public String getTicketNumber() {
        return ticketNumber;
    }
    public Bus getBus() {
        return bus;
    }
    public Seat getSeat() {
        return seat;
    }
    public String getPassengerName() {
        return passengerName;
    }
}