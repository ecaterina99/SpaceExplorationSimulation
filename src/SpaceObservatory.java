import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class SpaceObservatory {

    Set<SpaceEntity> spaceEntities = new HashSet<>();

    public void addSpaceEntity() {
        System.out.println("Enter Space Entity Type (Planet/Star/Asteroid):");
        Scanner input = new Scanner(System.in);
        String type = input.nextLine();

        switch (type.toLowerCase()) {
            case "planet" -> {
                Planet planet = new Planet();

                System.out.println("Enter the planet name: ");
                planet.setName(input.nextLine());

                System.out.println("Enter Distance from Earth (in light-years): ");
                planet.setDistanceFromEarth(Double.parseDouble(input.nextLine()));

                System.out.println("Enter Discovered By: ");
                planet.setDiscoveredBy(input.nextLine());

                System.out.println("Enter Discovery Year: ");
                planet.setDiscoveryYear(input.nextInt());
                input.nextLine();

                System.out.println("Enter the number of moons:");
                planet.setNumMoons(input.nextInt());
                input.nextLine();

                this.spaceEntities.add(planet);
            }
            case "star" -> {
                Star star = new Star();

                System.out.println("Please, add star name: ");
                star.setName(input.nextLine());

                System.out.println("Please, add distance from Earth: ");
                star.setDistanceFromEarth(Double.parseDouble(input.nextLine()));

                System.out.println("Enter temperature: ");
                star.setTemperature(Double.parseDouble(input.nextLine()));

                System.out.println("Enter star type: ");
                star.setStarType(input.nextLine());

                System.out.println("Enter Discovered By: ");
                star.setDiscoveredBy(input.nextLine());

                System.out.println("Enter Discovery Year: ");
                star.setDiscoveryYear(input.nextInt());
                input.nextLine();

                this.spaceEntities.add(star);
            }
            case "asteroid" -> {
                Asteroid asteroid = new Asteroid();

                System.out.println("Please, add asteroid name: ");
                asteroid.setName(input.nextLine());

                System.out.println("Please, add distance from Earth: ");
                asteroid.setDistanceFromEarth(Double.parseDouble(input.nextLine()));

                System.out.println("Enter the size: ");
                asteroid.setSize(input.nextInt());
                input.nextLine();

                System.out.println("Enter the composition: ");
                asteroid.setComposition(input.nextLine());

                System.out.println("Enter Discovered By: ");
                asteroid.setDiscoveredBy(input.nextLine());

                System.out.println("Enter Discovery Year: ");
                asteroid.setDiscoveryYear(input.nextInt());
                input.nextLine();

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

}
