public class Asteroid extends SpaceEntity implements Hazardous {
    private int size;
    private String composition;

    public enum DangerLevel {
        LOW(1), MEDIUM(2), HIGH(3);
        private final int level;
        DangerLevel(int level) {
            this.level = level;
        }
        public int getLevel() {
            return level;
        }
    }

    public void setSize(int size) {
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
        return "The probe landed on the jagged surface of asteroid " + this.getName() +
                ". Spectral analysis revealed veins of rare metals running through the rock," +
                " offering valuable insights into the origins of the early solar system.";
    }

    @Override
    public int getDangerLevel() {
        if (this.size < 2) {
            System.out.println("The asteroid has low danger level: ");
            return DangerLevel.LOW.getLevel();
        } else if (this.size <= 10) {
            System.out.println("The asteroid has medium danger level: ");
            return DangerLevel.MEDIUM.getLevel();
        } else {
            System.out.println("The asteroid has high danger level: ");
            return DangerLevel.HIGH.getLevel();
        }
    }

    public boolean isPotentiallyHazardous() {
        return getSize() > 1;
    }

    @Override
    public String getDiscoveryInfo() {
        return "Discovered By: " + getDiscoveredBy() + ". Discovery year: " + getDiscoveryYear() + "Is it potentially hazardous? " + isPotentiallyHazardous();
    }
}
