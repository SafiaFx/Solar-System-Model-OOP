import java.util.ArrayList;

public class SolarSystem {

    // Class variables
    private String name;
    // array list for planet objects
    private ArrayList<Planet> planets;

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

    // Method to print Solar system info
    public void toString(String name,
            ArrayList<Planet> planets) {
        for (int i = 0; i < planets.size(); i++) {
            System.out.println("Star" + name + "has planets: ");
            // Get the planet object
            Planet planet = planets.get(i);
            // calculate planet period
            double period = Planet.orbitalPeriod(planet.getDistance());
            System.out
                    .println(planet.getPlanetName() + " is " + planet.getDistance() + "AU from its star, and orbits in "
                            + period + "years");
        }
    }

    // Method for adding planets
    public void addPlanet(String planetName, double distance) {
        // Creation of Planet object
        Planet planetX = new Planet(planetName, distance);
        // Add planet to array list
        planets.add(planetX);
    }
}
