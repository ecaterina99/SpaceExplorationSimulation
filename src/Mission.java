public class Mission {
    private int missionCode;
    private String destinationPlanet;
    private String crewList;
    private int missionDuration;

    public Mission() {
    }

    public void setMissionCode(int missionCode) {

        this.missionCode = missionCode;
    }

    public void setDestinationPlanet(String destinationPlanet) {
        this.destinationPlanet = destinationPlanet;
    }

    public void setCrewList(String crewList) {
        this.crewList = crewList;
    }

    public void setMissionDuration(int missionDuration) {
        this.missionDuration = missionDuration;
    }

    public int getMissionCode() {
        return missionCode;
    }

    public String getDestinationPlanet() {
        return destinationPlanet;
    }

    public String getCrewList() {
        return crewList;
    }

    public int getMissionDuration() {
        return missionDuration;
    }


    public boolean isLongTermMission(int missionDuration) {
        if (getMissionDuration() > 365) {
            return true;
        }
        return false;
    }

}