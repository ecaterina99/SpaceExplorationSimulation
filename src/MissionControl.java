import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MissionControl {
    List<Astronaut> astronauts = new ArrayList<>();
    Scanner userInput = new Scanner(System.in);

    public void addAstronaut() {
        Astronaut astronaut = new Astronaut();

        System.out.println("Please, add astronaut name: ");
        astronaut.setName(userInput.nextLine());

        System.out.println("Please, add astronaut age: ");
        astronaut.setAge(userInput.nextInt());
        userInput.nextLine();

        System.out.println("Please, select astronaut nationality: ");
        System.out.println(Arrays.toString(Astronaut.AllowedNationality.values()));
        Astronaut.AllowedNationality nationality = Astronaut.AllowedNationality.valueOf(Astronaut.AllowedNationality.class, userInput.nextLine().toUpperCase());

        switch (nationality) {

            case AMERICAN -> astronaut.setNationality(Astronaut.AllowedNationality.AMERICAN);

            case ITALIAN -> astronaut.setNationality(Astronaut.AllowedNationality.ITALIAN);

            case RUSSIAN -> astronaut.setNationality(Astronaut.AllowedNationality.RUSSIAN);

            case MOLDAVIAN -> astronaut.setNationality(Astronaut.AllowedNationality.MOLDAVIAN);

            default -> System.out.println("The type is incorrect");

        }

        System.out.println("Please, add astronaut years of experience: ");
        astronaut.setYearsOfExperience(userInput.nextInt());

        this.astronauts.add(astronaut);
        System.out.println("Astronaut added successfully!");
    }

    public void displayAstronauts() {
        if (this.astronauts.isEmpty()) {
            System.out.println("Astronaut list is empty!");
        } else {
            Iterator<Astronaut> iterator = astronauts.iterator();
            while (iterator.hasNext()) {
                Astronaut eachAstronaut = iterator.next();
                System.out.println(eachAstronaut);
            }
        }
    }

    public void filterAstronautsByNationality() {

        System.out.println("Please, select the nationality: ");
        String nationality = userInput.nextLine();
        Astronaut.AllowedNationality searchedNationality;
        switch (nationality.toLowerCase()) {
            case "american" -> searchedNationality = Astronaut.AllowedNationality.AMERICAN;
            case "italian" -> searchedNationality = Astronaut.AllowedNationality.ITALIAN;
            case "russian" -> searchedNationality = Astronaut.AllowedNationality.RUSSIAN;
            case "moldavian" -> searchedNationality = Astronaut.AllowedNationality.MOLDAVIAN;
            default -> {
                System.out.println("The type is incorrect");
                return;
            }
        }
        List<Astronaut> astronautsByNationality = astronauts.stream()
                .filter(astronaut -> astronaut.getNationality() == searchedNationality)
                .toList();
        for (Astronaut eachAstronaut : astronautsByNationality) {
            System.out.println(eachAstronaut);
        }
    }

    public void validateAstronautID() {
        System.out.println("Please, select astronaut name: ");
        String searchAstronaut;
        searchAstronaut = userInput.nextLine();
        int cnt = 0;
        for (Astronaut eachAstronaut : astronauts) {
            if (eachAstronaut.getName().contains(searchAstronaut)) {
                System.out.println(searchAstronaut + " is in the list.");
                cnt++;
            }
        }
        if (cnt < 1) {
            System.out.println("Astronaut is not in the list.");
        }
    }

    public void sortAstronautsByAge() {
        astronauts.sort(Comparator.comparingInt(Astronaut::getAge));
        System.out.println("Sorted by age (ascending):");
        astronauts.forEach(System.out::println);
    }

    Queue<Mission> missions = new LinkedList<>();

    public void addMission() {
        Mission mission = new Mission();
        System.out.println("Add mission code (Format 3-digit number.)");
        String missionCodeInput = userInput.nextLine();

        String codeFormat = "^[0-9]{3}$";
        Pattern pattern = Pattern.compile(codeFormat);
        Matcher matcher = pattern.matcher(missionCodeInput);

        if (matcher.matches()) {
            mission.setMissionCode(Integer.parseInt(missionCodeInput));

            System.out.println("Add destination planet.");
            mission.setDestinationPlanet(userInput.nextLine());
            missions.add(mission);
        } else {
            System.err.println("The code format is invalid! Mission code must be a 3-digit number!");
        }
    }

    public void extractMissionCodes() {
        if (missions.isEmpty()) {
            System.out.println("The list is empty!");
        } else {
            System.out.println("Enter mission log:");
            int targetCode = userInput.nextInt();

            Iterator<Mission> iterator = missions.iterator();
            Mission current;
            Mission next;
            int cnt = 0;
            while (iterator.hasNext()) {
                current = iterator.next();

                if (current.getMissionCode() == targetCode) {
                    cnt++;
                }
                if (cnt >= 1) {
                    if (iterator.hasNext()) {
                        next = iterator.next();
                        System.out.println("Preparing for MISSION-" + current.getMissionCode() + " to " + current.getDestinationPlanet() + ". Next is MISSION-" + next.getMissionCode() + " to " + next.getDestinationPlanet());
                        System.out.println("Extracted Mission Codes: " + current.getMissionCode() + ", " + next.getMissionCode());
                    } else {
                        System.out.println("Preparing for MISSION-" + current.getMissionCode() + " to " + current.getDestinationPlanet() + ". No next mission after MISSION-" + current.getMissionCode());
                    }
                    return;
                }
            }
            System.out.println("The code format is invalid! ");
        }
    }
}

