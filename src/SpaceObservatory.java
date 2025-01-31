import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class SpaceObservatory {

    Set<SpaceEntity> spaceEntities = new HashSet<>();
    Scanner userInput = new Scanner(System.in);


    public void addSpaceEntity() {
        System.out.println("Enter Space Entity Type (Planet/Star/Asteroid):");
        String type = userInput.nextLine();

        switch (type.toLowerCase()) {
            case "planet" -> {
                Planet planet = new Planet();

                System.out.println("Enter the planet name: ");
                planet.setName(userInput.nextLine());

                System.out.println("Enter Distance from Earth (in light-years): ");
                planet.setDistanceFromEarth(Double.parseDouble(userInput.nextLine()));

                System.out.println("Enter Discovered By: ");
                planet.setDiscoveredBy(userInput.nextLine());

                System.out.println("Enter Discovery Year: ");
                planet.setDiscoveryYear(userInput.nextInt());
                userInput.nextLine();

                System.out.println("Enter the number of moons:");
                planet.setNumMoons(userInput.nextInt());
                userInput.nextLine();

                this.spaceEntities.add(planet);
            }
            case "star" -> {
                Star star = new Star();

                System.out.println("Please, add star name: ");
                star.setName(userInput.nextLine());

                System.out.println("Please, add distance from Earth: ");
                star.setDistanceFromEarth(Double.parseDouble(userInput.nextLine()));

                System.out.println("Enter temperature: ");
                star.setTemperature(Double.parseDouble(userInput.nextLine()));

                System.out.println("Enter star type: ");
                star.setStarType(userInput.nextLine());

                System.out.println("Enter Discovered By: ");
                star.setDiscoveredBy(userInput.nextLine());

                System.out.println("Enter Discovery Year: ");
                star.setDiscoveryYear(userInput.nextInt());
                userInput.nextLine();

                this.spaceEntities.add(star);
            }
            case "asteroid" -> {
                Asteroid asteroid = new Asteroid();

                System.out.println("Please, add asteroid name: ");
                asteroid.setName(userInput.nextLine());

                System.out.println("Please, add distance from Earth: ");
                asteroid.setDistanceFromEarth(Double.parseDouble(userInput.nextLine()));

                System.out.println("Enter the size: ");
                asteroid.setSize(userInput.nextInt());
                userInput.nextLine();

                System.out.println("Enter the composition: ");
                asteroid.setComposition(userInput.nextLine());

                System.out.println("Enter Discovered By: ");
                asteroid.setDiscoveredBy(userInput.nextLine());

                System.out.println("Enter Discovery Year: ");
                asteroid.setDiscoveryYear(userInput.nextInt());
                userInput.nextLine();

                this.spaceEntities.add(asteroid);
            }
            default -> System.out.println("The type is incorrect");
        }

    }

    public void displaySpaceEntities() {
        if (this.spaceEntities.isEmpty()) {
            System.out.println("No space entities found.");
        } else {
            System.out.println("Space entities:");
            for (SpaceEntity eachSpaceEntity : this.spaceEntities) {
                System.out.println(eachSpaceEntity.getDescription());
                System.out.println(eachSpaceEntity.getDiscoveryInfo());

            }
        }
    }

    public void exploreSpaceEntities() {
        System.out.println("Enter Space Entity Type for exploration(Planet/Asteroid):");
        String typeOfEntity = userInput.nextLine();
        switch (typeOfEntity.toLowerCase()) {
            case "planet" -> {
                Planet planet = new Planet();
                System.out.println("Enter the planet name: ");
                planet.setName(userInput.nextLine());
                System.out.println(planet.explore());
            }
            case "asteroid" -> {
                Asteroid asteroid = new Asteroid();
                System.out.println("Enter the asteroid name: ");
                asteroid.setName(userInput.nextLine());
                System.out.println(asteroid.explore());
            }
            default -> System.out.println("Exploration is impossible. Please, select a Planet/Asteroid.");
        }
    }

    public void getAsteroidDangerLevel() {
        System.out.println("Enter the asteroid name: ");
        Asteroid asteroid = new Asteroid();
        asteroid.setName(userInput.nextLine());
        System.out.println("Enter asteroid size: ");
        asteroid.setSize(userInput.nextInt());
        System.out.println(asteroid.getDangerLevel());
    }

    public void supportsLife() {
        Planet planet = new Planet();
        System.out.println("Enter planet name: ");
        planet.setName(userInput.nextLine());
        System.out.println("Enter the number of moons: ");
        planet.setNumMoons(userInput.nextInt());
        userInput.nextLine();
        System.out.println(planet.canSupportLife());
    }


    public void getStarClassification() {
        Star star = new Star();
        System.out.println("Enter star name: ");
        star.setName(userInput.nextLine());
        System.out.println("Enter star temperature: ");
        star.setTemperature(userInput.nextDouble());
        userInput.nextLine();

        System.out.println(star.getStarClassification());

    }

}

