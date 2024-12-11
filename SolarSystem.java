import java.util.ArrayList;

public class SolarSystem {
    private String name;
    // array list for planet objects
    private ArrayList<Planet> planets = new ArrayList<>();

    // Constructor
    public SolarSystem(String name) {
        this.name = name;
        this.planets = new ArrayList<>();
    }

    // Getters and setters
    public ArrayList<Planet> getPlanets() {
        return planets;
    }

    @Override
    public String toString() {
        String planetString = "";
        String solarString = "Star " + name + " has planets:\n";
        // Print information for each planet
        for (Planet planet : planets) {
            planetString += planet.toString() + "\n";
        }
        return solarString + planetString;
    }

    // Method for adding planets
    public void addPlanet(String planetName, double distance) {
        // Create planet object
        Planet planetX = new Planet(planetName, distance);
        // Add planet to array list
        planets.add(planetX);
    }
}
