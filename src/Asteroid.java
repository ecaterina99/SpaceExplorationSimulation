public class Asteroid extends SpaceEntity implements Hazardous {
    private double size;
    private String composition;

    public void setSize(double size) {
        this.size = size;
    }

    public double getSize() {
        return size;
    }

    public void setComposition(String composition) {
        this.composition = composition;
    }

    public String getComposition() {
        return composition;
    }

    @Override
    public String getDescription() {
        return "Asteroid name:" + getName() + ". Distance from Earth: " + getDistanceFromEarth() + ". Asteroid size: " + getSize() + ". Composition:" + getComposition();
    }

    @Override
    public String explore() {
        return "";
    }

    @Override
    public int getDangerLevel() {
        return 0;
    }

    public boolean isPotentiallyHazardous() {
        return getSize() > 1;
    }

    @Override
    public String getDiscoveryInfo() {
        return "Discovered By: " + getDiscoveredBy() + ". Discovery year: " + getDiscoveryYear();
    }
}
