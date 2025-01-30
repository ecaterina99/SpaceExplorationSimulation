import java.util.*;
public class MissionControl {
    List<Astronaut> astronauts = new ArrayList<>();

    public void addAstronaut() {
        Astronaut astronaut = new Astronaut();

        System.out.println("Please, add astronaut name: ");
        Scanner sc = new Scanner(System.in);
        astronaut.setName(sc.nextLine());

        System.out.println("Please, add astronaut age: ");
        astronaut.setAge(sc.nextInt());
        sc.nextLine();

        System.out.println("Please, select astronaut nationality: ");
        System.out.println(Arrays.toString(Astronaut.AllowedNationality.values()));
        Astronaut.AllowedNationality nationality = Astronaut.AllowedNationality.valueOf(Astronaut.AllowedNationality.class, sc.nextLine().toUpperCase());

        switch (nationality) {

            case AMERICAN -> astronaut.setNationality(Astronaut.AllowedNationality.AMERICAN);

            case ITALIAN -> astronaut.setNationality(Astronaut.AllowedNationality.ITALIAN);

            case RUSSIAN -> astronaut.setNationality(Astronaut.AllowedNationality.RUSSIAN);

            case MOLDAVIAN -> astronaut.setNationality(Astronaut.AllowedNationality.MOLDAVIAN);

            default -> System.out.println("The type is incorrect");

        }

        System.out.println("Please, add astronaut years of experience: ");
        astronaut.setYearsOfExperience(sc.nextInt());

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
        Scanner input = new Scanner(System.in);
        String nationality = input.nextLine();
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

}
