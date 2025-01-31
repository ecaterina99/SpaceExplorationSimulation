public class Planet extends SpaceEntity implements Explorable {
    private boolean habitable;
    private int numMoons;

    public Planet() {
        super();
        setHabitable(Math.random() < 0.5);
    }

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

    public boolean canSupportLife() {
        System.out.println(this.getName() + " can support life? ");
        return getNumMoons() >= 1 && this.habitable;
    }

    @Override
    public String explore() {
        return "Welcome to Planet Exploration! Planet name: " + this.getName() +
                ". Initial scans detected traces of water beneath the surface " +
                "and atmospheric elements hinting at the possibility of microbial life.";
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
