import java.util.Iterator;
import java.util.List;

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


    @Override
    public String toString(){
        return "Astronaut name: " + getName()+ ", astronaut age: "+ getAge()+ ", astronaut nationality: "+ getNationality()+ ", astronaut years of experience: " + getYearsOfExperience();
    }

    public boolean isEligibleForMission(int yearsOfExperience){
        if(getYearsOfExperience() >= 5){
            return true;
        }
        return false;
    }
}
