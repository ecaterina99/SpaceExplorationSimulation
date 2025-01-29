public class Commander extends Astronaut{
   private int missionsCompleted;
   public void setMissionsCompleted(int missionsCompleted) {
       this.missionsCompleted = missionsCompleted;
   }
   public int getMissionsCompleted() {
       return missionsCompleted;
   }

    Commander(String name, int age, String nationality, String rank, int yearsOfExperience,int missionsCompleted) {
        super();
        this.missionsCompleted = missionsCompleted;
    }

    public String issueCommand(){
       return "";
    }
}
