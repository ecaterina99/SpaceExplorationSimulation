import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class SpaceObservatory {

    Set<SpaceEntity> spaceEntities = new HashSet<>();


    public void addSpaceEntity(){

        System.out.println("Enter Space Entity Type (Planet/Star/Asteroid):");
        Scanner sc = new Scanner(System.in);
        String type = sc.nextLine();

        switch (type) {
            case "Planet" -> {
                Planet planet = new Planet();

                System.out.println("Please, add planet name: ");
                Scanner input = new Scanner(System.in);
                planet.setName(input.nextLine());

                System.out.println("Please, add distance from Earth: ");
                planet.setName(input.nextLine());
                sc.nextLine();

                System.out.println("Enter the number of moons");
                planet.setNumMoons(input.nextInt());
                sc.nextLine();

                this.spaceEntities.add(planet);
            }
            case "Star" -> {
                Star star = new Star();

                System.out.println("Please, add star name: ");
                Scanner input = new Scanner(System.in);
                star.setName(input.nextLine());

                System.out.println("Please, add distance from Earth: ");
                star.setName(input.nextLine());
                sc.nextLine();

                this.spaceEntities.add(star);
            }
            case "Asteroid" -> {
                Asteroid asteroid = new Asteroid();

                System.out.println("Please, add asteroid name: ");
                Scanner input = new Scanner(System.in);
                asteroid.setName(input.nextLine());

                System.out.println("Please, add distance from Earth: ");
                asteroid.setName(input.nextLine());
                sc.nextLine();

                this.spaceEntities.add(asteroid);
            }
            default -> System.out.println("The type is incorrect");
        }

    }

    public void displaySpaceEntities(){
        if (this.spaceEntities.isEmpty()) {
            System.out.println("No space entities found.");
        } else {
            System.out.println("Space entities:");
            for (SpaceEntity eachSpaceEntity : this.spaceEntities) {
                System.out.println(eachSpaceEntity.getDescription());
            }
        }
    }

}
