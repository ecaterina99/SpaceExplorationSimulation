import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Astronaut {
    private String name;
    private int age;
    private String nationality;
    private int yearsOfExperience;

    public Astronaut() {
    }

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return age;
    }

    public void setNationality(String nationality){
        this.nationality = nationality;
    }
    public String getNationality(){
        return nationality;
    }

    public void setYearsOfExperience(int years){
        this.yearsOfExperience = years;
    }
    public int getYearsOfExperience(){
        return yearsOfExperience;
    }


    public void addAstronaut(List<Astronaut> astronauts,Astronaut astronaut){
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

        astronauts.add(astronaut);
        System.out.println("Astronaut added successfully!");
    }

    @Override
    public String toString(){
        return "Astronaut name: " + getName()+ ", astronaut age: "+ getAge()+ ", astronaut nationality: "+ getNationality()+ ", astronaut years of experience: " + getYearsOfExperience();
    }

    public void displayAstronauts(List<Astronaut> astronauts){
        Iterator<Astronaut> iterator = astronauts.iterator();
        while (iterator.hasNext()) {
            Astronaut eachAstronaut = iterator.next();
            System.out.println(eachAstronaut);
        }
    }

    public boolean isEligibleForMission(int yearsOfExperience){
        if(getYearsOfExperience() >= 5){
            return true;
        }
        return false;
    }
}
