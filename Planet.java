public class Planet {

    public static final double ROUND = 1000.0;
    // Class variables
    private String planetName;
    private double distance;

    // Getters and setters
    public String getPlanetName() {
        return planetName;
    }

    public double getDistance() {
        return distance;
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

    // Method for rounding number
    public static double round(double number) {
        return Math.round(number * ROUND) / ROUND;
    }

    // To string for planet
    @Override
    public String toString() {
        double period = orbitalPeriod(distance);
        return planetName + "  is " + round(distance)
                + "AU from its star, and orbits in " + round(period) + " years";
    }
}
