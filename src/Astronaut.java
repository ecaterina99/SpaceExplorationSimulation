public class Astronaut {

    private String name;
    private int age;
    private AllowedNationality nationality;
    private int yearsOfExperience;

    public enum AllowedNationality {MOLDAVIAN, AMERICAN, ITALIAN, RUSSIAN}

    public Astronaut() {
        super();
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setNationality(AllowedNationality nationality) {
        this.nationality = nationality;
    }

    public AllowedNationality getNationality() {
        return nationality;
    }

    public void setYearsOfExperience(int years) {
        this.yearsOfExperience = years;
    }

    public int getYearsOfExperience() {
        return yearsOfExperience;
    }

    public boolean isEligibleForMission() {
        return getYearsOfExperience() >= 5;
    }

    @Override
    public String toString() {
        return "Astronaut name: " + getName() + ", astronaut age: " + getAge() + ", astronaut nationality: " + getNationality() + ", astronaut years of experience: " + getYearsOfExperience() + ". Is he eligible for mission? " + isEligibleForMission();
    }


}