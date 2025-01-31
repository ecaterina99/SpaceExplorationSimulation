import java.util.*;

public abstract class SpaceEntity {
    private String name;
    private double distanceFromEarth;
    private String discoveredBy;
    private int discoveryYear;

    public SpaceEntity() {
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setDistanceFromEarth(double distanceFromEarth) {
        this.distanceFromEarth = distanceFromEarth;
    }

    public double getDistanceFromEarth() {
        return distanceFromEarth;
    }

    public void setDiscoveredBy(String discoveredBy) {
        this.discoveredBy = discoveredBy;
    }

    public String getDiscoveredBy() {
        return discoveredBy;
    }

    public void setDiscoveryYear(int discoveryYear) {
        this.discoveryYear = discoveryYear;
    }

    public int getDiscoveryYear() {
        return discoveryYear;
    }


    public String getDiscoveryInfo() {
        return "Discovered By: " + this.discoveredBy + ". Discovery year: " + this.discoveryYear;
    }

    public abstract String getDescription();


    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        SpaceEntity spaceEntity = (SpaceEntity) obj;
        return Objects.equals(this.getName(), spaceEntity.getName())
                && Objects.equals(this.getDistanceFromEarth(), spaceEntity.getDistanceFromEarth());
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, distanceFromEarth);
    }

}


