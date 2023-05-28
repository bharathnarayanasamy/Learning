class Bus {
    private String busNumber;
    private String route;
    private Seat[][] seats;
    private double rating;
    public Bus(String busNumber, String route, int rows, int columns) {
        this.busNumber = busNumber;
        this.route = route;
        this.seats = new Seat[rows][columns];
        this.rating = 0.0;
        initializeSeats();
    }
    private void initializeSeats() {
        // Initialize all seats as available
        for (int i = 0; i < seats.length; i++) {
            for (int j = 0; j < seats[i].length; j++) {
                seats[i][j] = new Seat(i + 1, j + 1, true, 0.0);
            }
        }
    }
    public String getBusNumber() {
        return busNumber;
    }
    public String getRoute() {
        return route;
    }
    public Seat[][] getSeats() {
        return seats;
    }
    public double getRating() {
        return rating;
    }
    public void setRating(double rating) {
        this.rating = rating;
    }
    public double getTicketPrice() {
        // Calculate and return the average ticket price based on the seat prices
        int totalSeats = seats.length * seats[0].length;
        double totalPrice = 0.0;
        
        for (int i = 0; i < seats.length; i++) {
            for (int j = 0; j < seats[i].length; j++) {
                totalPrice += seats[i][j].getPrice();
            }
        }
        
        return totalPrice / totalSeats;
    }
}