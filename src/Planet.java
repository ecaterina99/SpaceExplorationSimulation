public class Planet extends SpaceEntity implements Explorable {
    private boolean habitable;
    private int numMoons;

    public void setHabitable(boolean habitable) {
        this.habitable = habitable;
    }

    public boolean getHabitable() {
        return habitable;
    }

    public void setNumMoons(int numMoons) {
        this.numMoons = numMoons;
    }

    public int getNumMoons() {
        return numMoons;
    }

    public boolean canSupportLife(int numMoons) {
        if (getNumMoons() >= 1) {
            return this.habitable = true;
        }
        return this.habitable = false;
    }

    @Override
    public String explore() {
        return "";
    }

    @Override
    public String getDescription() {
        return "Planet name: " + getName() + ". Distance from Earth: " + getDistanceFromEarth() + ". Number of moons: " + getNumMoons() + ". Is the planet habitable? " + getHabitable();
    }

    @Override
    public String getDiscoveryInfo() {
        return "Discovered By: " + getDiscoveredBy() + ". Discovery year: " + getDiscoveryYear();
    }
}
