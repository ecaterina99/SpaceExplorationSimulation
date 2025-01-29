import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;


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

        System.out.println("Please, add astronaut nationality: ");
        astronaut.setNationality(sc.nextLine());

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


}
