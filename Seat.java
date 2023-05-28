class Seat {
    private int row;
    private int column;
    private boolean isAvailable;
    private double price;
    public Seat(int row, int column, boolean isAvailable, double price) {
        this.row = row;
        this.column = column;
        this.isAvailable = isAvailable;
        this.price = price;
    }
    public int getRow() {
        return row;
    }
    public int getColumn() {
        return column;
    }
    public boolean isAvailable() {
        return isAvailable;
    }
    public void setAvailability(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
}