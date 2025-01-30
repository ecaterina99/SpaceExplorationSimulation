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
        return "Star Classification";
    }

    @Override
    public String getDescription() {
        return "Star name:" + getName() + ". Distance from Earth: " + getDistanceFromEarth() + ". Star type: " + getStarType() + ". Temperature:" + getTemperature();
    }
    @Override
    public String getDiscoveryInfo() {
        return "Discovered By: " + getDiscoveredBy() + ". Discovery year: " + getDiscoveryYear();
    }
}
