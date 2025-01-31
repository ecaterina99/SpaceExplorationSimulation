
public class Star extends SpaceEntity {
    private double temperature;
    private String starType;

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setStarType(String starType) {
        this.starType = starType;
    }

    public String getStarType() {
        return starType;
    }

    public String getStarClassification() {
        if (this.temperature < 3.5000) {
            this.starType = "Cool Stars(RED)";
        } else if (this.temperature > 3.5000 && this.temperature < 7.5000) {
            this.starType = "Medium-Temperature Stars (Yellow & Orange)";
        } else {
            this.starType = "Hot Stars (Blue & White)";
        }
        return "The star " + this.getName() + " takes a part of " + getStarType();
    }

    @Override
    public String getDescription() {
        return "Star name:" + getName() + ". Distance from Earth: " + getDistanceFromEarth() + ". Star type: " + getStarType() + ". Temperature:" + getTemperature()+ ". Star classification: " + getStarClassification();
    }

    @Override
    public String getDiscoveryInfo() {
        return "Discovered By: " + getDiscoveredBy() + ". Discovery year: " + getDiscoveryYear();
    }
}
