import java.util.*;

public class SpaceExplorationSimulation {
    public static void main(String[] args) {

        Map<String, Integer> options = new LinkedHashMap<>();

        options.put("Add Astronaut.", 1);
        options.put("Add Space Entity (Planet/Star/Asteroid).", 2);
        options.put("Schedule Mission.", 3);
        options.put("List Astronauts.", 4);
        options.put("List Space Entities.", 5);
        options.put("Filter Astronauts by Nationality.", 6);
        options.put("Sort Astronauts by Age.", 7);
        options.put("Explore Space Entity.", 8);
        options.put("Calculate Danger Level for Asteroid.", 9);
        options.put("Check if Planet Can Support Life.", 10);
        options.put("Get Star Classification.", 11);
        options.put("Validate Astronaut ID.", 12);
        options.put("Extract Mission Codes.", 13);
        options.put("Exit.", 0);

        options.forEach((key, value) -> System.out.println(value + ": " + key));

        MissionControl missionControl = new MissionControl();
        SpaceObservatory spaceObservatory = new SpaceObservatory();


        System.out.println("Enter your choice:");
        Scanner scanner = new Scanner(System.in);
        int userInput = scanner.nextInt();

        selectOption(userInput, missionControl,spaceObservatory);
        while (userInput != 0) {
            System.out.println("Enter your choice:");
            try {
                userInput = scanner.nextInt();
                selectOption(userInput, missionControl,spaceObservatory);
            } catch (InputMismatchException e) {
                System.err.println("Invalid input. Please enter a number.");
                scanner.next();
            }
        }
    }


    public static void selectOption(int userInput, MissionControl missionControl, SpaceObservatory spaceObservatory) {
        switch (userInput) {

            case 1 -> missionControl.addAstronaut();

            case 2 -> spaceObservatory.addSpaceEntity();
            case 3 -> System.out.println(" ");

            case 4 -> missionControl.displayAstronauts();
            case 5 -> spaceObservatory.displaySpaceEntities();

            case 0 -> System.out.println("Exiting the program. Goodbye!");

            default -> System.err.println("The ID is incorrect. Please select a valid option between 1 and 13.");
        }

    }
}