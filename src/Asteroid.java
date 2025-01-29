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
        return "";
    }

    @Override
    public String explore() {
        return "";
    }

    @Override
    public int getDangerLevel() {
        return 0;
    }

    public boolean isPotentiallyHazardous(int size) {
        if (getSize() > 1) {
            return true;
        }
        return false;
    }


}
