import java.util.ArrayList;

public class SolarSystem {

    // Class variables
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

    public void setPlanets(ArrayList<Planet> planets) {
        this.planets = planets;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //To string method bank example:
    public String toString(String planetName, double distance) {
        String planetString = "";
        String solarString = "";
        for (Planet planet : planets) {
            //calculate period for each planet
            double period = Planet.orbitalPeriod(planet.getDistance());
            solarString = "Star" + name + "has planets: \n";
            planetString = planetName + " is " + distance
                    + "AU from its star, and orbits in " + period + "years";
        }
        return solarString + planetString;
    }

    // Method for adding planets
    public void addPlanet(String planetName, double distance) {
        // Creation of Planet object
        Planet planetX = new Planet(planetName, distance);
        // Add planet to array list
        planets.add(planetX);
    }
}