class SearchCriteria {
    private String route;
    private double maxPrice;
    private double minRating;
    public SearchCriteria(String route, double maxPrice, double minRating) {
        this.route = route;
        this.maxPrice = maxPrice;
        this.minRating = minRating;
    }
    public String getRoute() {
        return route;
    }
    public double getMaxPrice() {
        return maxPrice;
    }
    public double getMinRating() {
        return minRating;
    }
}