public class Planet {
    // Class variables
    private String planetName;
    private double distance;

    // Getters and setters
    public String getPlanetName() {
        return planetName;
    }

    public void setPlanetName(String name) {
        this.planetName = name;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    // Constructor
    public Planet(String name, double distance) {
        this.planetName = name;
        this.distance = distance;
    }

    // Method for calculating orbital period
    public static double orbitalPeriod(double distance) {
        return Math.sqrt(distance * distance * distance);
    }
}